package com.example.interface1;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.view.GestureDetectorCompat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class cgohome {
	private GestureDetectorCompat gestureDetector; 
	//ImageView map;
	Gallery gal;
	int[] btnid = new int[9];
	public Activity activity; 
	public cgohome(Context gohomeactivity){  // 必須將context帶入才知道來源
		activity = (Activity)gohomeactivity;
	}
	public void setclick(){
		gestureDetector = new GestureDetectorCompat(activity, new MyGestureListener());
		//map = (ImageView)activity.findViewById(R.id.myocu_image1);
		//map.setOnTouchListener(onTouchMap);
		gal = (Gallery)activity.findViewById(R.id.gallery1);
		//gal.setAdapter(new ImageAdapter(activity));
		BaseAdapter ba = new BaseAdapter(){
        	int[] myImageId = { 
        			R.drawable.mainpageimg1,
    		        R.drawable.mainpageimg2,
    		        R.drawable.mainpageimg3,
    		        R.drawable.mainpageimg4,
    		        R.drawable.mainpageimg5,
    		    };
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return myImageId.length;
			}

			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return myImageId[arg0];
			}

			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				Singleton.position = arg0;
				return arg0;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				ImageView iv = new ImageView(activity);
				iv.setImageResource(myImageId[position]);
				iv.setScaleType(ImageView.ScaleType.FIT_XY);
				int gallery_height = (int)(Singleton.windowsHeight * 3/10);
				iv.setLayoutParams(new Gallery.LayoutParams((int)(gallery_height * 1.5) , gallery_height));
				return iv;
			}
        };
		
        gal.setAdapter(ba);
		gal.setOnTouchListener(onTouchMap);
		
		DisplayMetrics dm = new DisplayMetrics();  
	    activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
	    Singleton.windowsHeight = dm.heightPixels;
	    Singleton.windowsWidth = dm.widthPixels;
	    int btnsize;
	    btnsize = (int)(dm.widthPixels /3.5);
		
		btnid[0] = R.id.go_announcement;
		btnid[1] = R.id.go_calendar;
		btnid[2] = R.id.go_library;
		btnid[3] = R.id.go_my_ocu;
		btnid[4] = R.id.go_life;
		btnid[5] = R.id.go_security;
		btnid[6] = R.id.go_students;
		btnid[7] = R.id.go_traffic;
		btnid[8] = R.id.go_unit;
		for(int i = 0 ;i<btnid.length ; i++){
			ImageView bttemp = (ImageView)activity.findViewById(btnid[i]);
			bttemp.setOnClickListener(conbtnChoose);
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			lp.setMargins(0, 0, 0, 0);
			bttemp.setLayoutParams(lp);
			bttemp.getLayoutParams().width = btnsize;
			bttemp.getLayoutParams().height = btnsize;
			
		}
	}
	private ImageView.OnClickListener conbtnChoose = new ImageView.OnClickListener(){

		
		@Override
		public void onClick(final View v) {
			// TODO Auto-generated method stub
			Animation ani = AnimationUtils.loadAnimation(activity, R.anim.btnani);
			ani.setAnimationListener(new AnimationListener() {
				
				@Override
				public void onAnimationStart(Animation arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationRepeat(Animation arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationEnd(Animation arg0) {
					// TODO Auto-generated method stub
					switch(v.getId())
					{
					case R.id.go_announcement:
						announcement ann = new announcement(v.getContext());
						ann.openweb();
						Button xbtn_ann = (Button)activity.findViewById(R.id.btn_announcement);
						xbtn_ann.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.announcement;
						break;
					case R.id.go_calendar:
						calendar cal = new calendar (v.getContext());
						cal.getimg();
						Button xbtn_cal = (Button)activity.findViewById(R.id.btn_cal);
						xbtn_cal.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.calendar;
						break;
					case R.id.go_library:
						library lib = new library(v.getContext());
						lib.opweb();
						Button xbtn_lib = (Button)activity.findViewById(R.id.btn_lib);
						xbtn_lib.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.library;
						break;
					case R.id.go_my_ocu:
						my_ocu myocu = new my_ocu(v.getContext());
						myocu.openbox();
						Button xbtn_myocu=(Button)activity.findViewById(R.id.btn_myocu);
						xbtn_myocu.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.my_ocu;
						break;
					case R.id.go_life:
						life lif = new life(v.getContext());
						lif.goweb();
						Button xbtn_rent = (Button)activity.findViewById(R.id.btn_life);
						xbtn_rent.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.life;
						break;
					case R.id.go_security:
						security sec = new security(v.getContext());
						sec.gocallphone();
						Button xbtn_security = (Button)activity.findViewById(R.id.btn_security);
						xbtn_security.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.security;
						break;
					case R.id.go_students:
						students stu = new students(v.getContext());
						stu.webopen();
						Button xbtn_stu = (Button)activity.findViewById(R.id.btn_stu);
						xbtn_stu.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.students;
						break;
					case R.id.go_traffic:
						activity.setContentView(R.layout.traffic);
						Button xbtn_tra = (Button)activity.findViewById(R.id.btn_traffic);
						xbtn_tra.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.traffic;
						break;
					case R.id.go_unit:
						unit un = new unit(v.getContext());
						un.btnn();
						//activity.setContentView(R.layout.unit);
						Button xbtn_unit = (Button)activity.findViewById(R.id.btn_unit);
						xbtn_unit.setOnClickListener(conbtnGoHome);
						Singleton.sence = R.layout.unit;
						break;
						
					}
				}
			});
			v.startAnimation(ani);
			
			
			
		}

		private Resources getResources() {
			// TODO Auto-generated method stub
			return null;
		}

		
	};
	
	class MyGestureListener extends GestureDetector.SimpleOnGestureListener{
	    @Override
	    public boolean onDoubleTap(MotionEvent e) {
	    	Intent intent = new Intent();
	    	intent.setClass(activity, MaipActivity.class);
	    	activity.startActivity(intent);
	        return true;
	    }
	  
	    @Override
	    public boolean onDown(MotionEvent e) {
	        return false;
	    }
	}
	
	private OnTouchListener onTouchMap = new OnTouchListener() {

	    @Override
	    public boolean onTouch(View v, MotionEvent event) {
	    	//return false;
	        return gestureDetector.onTouchEvent(event);
	    } 
	};
	
	private Button.OnClickListener conbtnGoHome = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			activity.setContentView(R.layout.activity_main);
			setclick();
			Singleton.sence = R.layout.activity_main;
		}
	};
	

}
