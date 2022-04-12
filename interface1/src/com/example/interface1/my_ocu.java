package com.example.interface1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

public class my_ocu {
	public Activity activity;
	public TextView myocu_txv2;
	public TextView myocu_txv3;
	public TextView myocu_txv4 ;
	public Intent it = new Intent(Intent.ACTION_VIEW);
	
	public my_ocu (Context _activity){
		activity = (Activity) _activity ;
	}
	public void openbox(){
		activity.setContentView(R.layout.my_ocu);
		activity.findViewById(R.layout.my_ocu);
//		myocu_txv1 = (TextView)activity.findViewById(R.id.myocu_txv1);
		myocu_txv2 = (TextView)activity.findViewById(R.id.myocu_txv2);
		myocu_txv3 = (TextView)activity.findViewById(R.id.myocu_txv3);
		myocu_txv4 = (TextView)activity.findViewById(R.id.myocu_txv4);
		
//		myocu_txv1.setOnClickListener(openboxx);
		myocu_txv2.setOnClickListener(openboxx); 
		myocu_txv3.setOnClickListener(openboxx);
		myocu_txv4.setOnClickListener(openboxx);
	}
	
	public TextView.OnClickListener openboxx = new TextView.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.myocu_txv2:
				it.setData(Uri.parse("geo:24.189732,120.644031"));
				break;
			case R.id.myocu_txv3:
				it.setData(Uri.parse("http://www.ocu.edu.tw"));
				break;
			case R.id.myocu_txv4:
				it.setData(Uri.parse("tel:04-27016855"));
				break;
			}
			activity.startActivity(it);
		}
		
	};
}
