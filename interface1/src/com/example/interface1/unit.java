package com.example.interface1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class unit {
	
	public Activity activity ;
	public int[] Button;
	public int[] lay;
	public int[] edbt;
	public int[] edlin;
	public int[] txv ;
	public int[] edtxv ;
	TextView tv_1 , tv_2 , tv_3;
	int mode = 1; 
	int e_mode = 1;
	Button btn_1,btn_2 ,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10,btn_11,btn_12,btn_13 ;
	
	Button bted , btad;
	
	LinearLayout lin_1;
	boolean viewmode = true;   // 目前顯示的單位為何 true=行政單位，false=教學單位
	Button go_homee; 
	
	public Intent itt = new Intent(Intent.ACTION_VIEW);
	public Intent itit = new Intent(Intent.ACTION_VIEW);
	public String iooo ;
	public String ioo;
	public TextView ttv;
	
	
	public unit(Context _activity){
		activity = (Activity)_activity;
		go_homee = (Button)activity.findViewById(R.id.btn_unit);
	}
	
public void btnn(){
	activity.setContentView(R.layout.unit);
	
	btn_1  = (Button)activity.findViewById(R.id.unit_button1);
	btn_2  = (Button)activity.findViewById(R.id.unit_button2);
	btn_3  = (Button)activity.findViewById(R.id.unit_button3);
	btn_4  = (Button)activity.findViewById(R.id.unit_button4);
	btn_5  = (Button)activity.findViewById(R.id.unit_button5);
	btn_6  = (Button)activity.findViewById(R.id.unit_button6);
	btn_7  = (Button)activity.findViewById(R.id.unit_button7);
	btn_8  = (Button)activity.findViewById(R.id.unit_button8);
	btn_9  = (Button)activity.findViewById(R.id.unit_button9);
	btn_10  = (Button)activity.findViewById(R.id.unit_button10);
	btn_11  = (Button)activity.findViewById(R.id.unit_button11);
	btn_12  = (Button)activity.findViewById(R.id.unit_button12);
	btn_13  = (Button)activity.findViewById(R.id.unit_button13);
	
	lin_1 = (LinearLayout)activity.findViewById(R.id.unit_lin1);
	
    Button = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    lay = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    edbt = new int[19];
    edlin = new int[19];
    //將行政button加入陣列
	Button[0] = R.id.unit_button1;
	Button[1] = R.id.unit_button2;
	Button[2] = R.id.unit_button3;
	Button[3] = R.id.unit_button4;
	Button[4] = R.id.unit_button5;
	Button[5] = R.id.unit_button6;
	Button[6] = R.id.unit_button7;
	Button[7] = R.id.unit_button8;
	Button[8] = R.id.unit_button9;
	Button[9] = R.id.unit_button10;
	Button[10] = R.id.unit_button11;
	Button[11] = R.id.unit_button12;
	Button[12] = R.id.unit_button13;
	Button[13] = R.id.unit_button14;
	Button[14] = R.id.unit_button15;
	//監聽事件
	for(int i = 0 ; i < Button.length ; i++){
		Button btntmp;
		btntmp = (Button)activity.findViewById(Button[i]);
		btntmp.setOnClickListener(conbtnChoose);
	}
	
	//將行政layout加入陣列
	lay[0] = R.id.unit_lin1;
	lay[1] = R.id.unit_lin2;
	lay[2] = R.id.unit_lin3;
	lay[3] = R.id.unit_lin4;
	lay[4] = R.id.unit_lin5;
	lay[5] = R.id.unit_lin6;
	lay[6] = R.id.unit_lin7;
	lay[7] = R.id.unit_lin8;
	lay[8] = R.id.unit_lin9;
	lay[9] = R.id.unit_lin10;
	lay[10] = R.id.unit_lin11;
	lay[11] = R.id.unit_lin12;
	lay[12] = R.id.unit_lin13;
	lay[13] = R.id.unit_lin14;
	lay[14] = R.id.unit_lin15;
	//將教學button加入陣列
	edbt[0] = R.id.unit_edbt1;
	edbt[1] = R.id.unit_edbt2;
	edbt[2] = R.id.unit_edbt3;
	edbt[3] = R.id.unit_edbt4;
	edbt[4] = R.id.unit_edbt5;
	edbt[5] = R.id.unit_edbt6;
	edbt[6] = R.id.unit_edbt7;
	edbt[7] = R.id.unit_edbt8;
	edbt[8] = R.id.unit_edbt9;
	edbt[9] = R.id.unit_edbt10;
	edbt[10] = R.id.unit_edbt11;
	edbt[11] = R.id.unit_edbt12;
	edbt[12] = R.id.unit_edbt13;
	edbt[13] = R.id.unit_edbt14;
	edbt[14] = R.id.unit_edbt15;
	edbt[15] = R.id.unit_edbt16;
	edbt[16] = R.id.unit_edbt17;
	edbt[17] = R.id.unit_edbt18;
	edbt[18] = R.id.unit_edbt19;
	 
	//按鈕加入監聽事件
	for(int i = 0 ; i < edbt.length ; i++){
		Button btntmp;
		btntmp = (Button)activity.findViewById(edbt[i]);
		btntmp.setOnClickListener(conbtnChoose);
	}
	
	//將教學layout加入陣列
	edlin[0] = R.id.unit_edlin1;
	edlin[1] = R.id.unit_edlin2;
	edlin[2] = R.id.unit_edlin3;
	edlin[3] = R.id.unit_edlin4;
	edlin[4] = R.id.unit_edlin5;
	edlin[5] = R.id.unit_edlin6;
	edlin[6] = R.id.unit_edlin7;
	edlin[7] = R.id.unit_edlin8;
	edlin[8] = R.id.unit_edlin9;
	edlin[9] = R.id.unit_edlin10;
	edlin[10] = R.id.unit_edlin11;
	edlin[11] = R.id.unit_edlin12;
	edlin[12] = R.id.unit_edlin13;
	edlin[13] = R.id.unit_edlin14;
	edlin[14] = R.id.unit_edlin15;
	edlin[15] = R.id.unit_edlin16;
	edlin[16] = R.id.unit_edlin17;
	edlin[17] = R.id.unit_edlin18;
	edlin[18] = R.id.unit_edlin19;

	//行政與學術交換
	
	btad = (Button)activity.findViewById(R.id.btn_ad);
	bted = (Button)activity.findViewById(R.id.btn_ed);
	btad.setOnClickListener(adedchange);
	bted.setOnClickListener(adedchange);
	
	//網址陣列
	txv = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	txv[0] = R.id.unit_textView2;
	txv[1] = R.id.unit_textView4;
	txv[2] = R.id.unit_textView6;
	txv[3] = R.id.unit_textView8;
	txv[4] = R.id.unit_textView10;
	txv[5] = R.id.unit_textView12;
	txv[6] = R.id.unit_textView14;
	txv[7] = R.id.unit_textView16;
	txv[8] = R.id.unit_textView18;
	txv[9] = R.id.unit_textView20;
	txv[10] = R.id.unit_textView22;
	txv[11] = R.id.unit_textView24;
	txv[12] = R.id.unit_textView26;
	txv[13] = R.id.unit_textView28;
	txv[14] = R.id.unit_textView30;
	txv[15] = R.id.unit_textView32;
	
	for(int i = 0 ; i < txv.length ; i++){
		TextView txvop;
		txvop = (TextView)activity.findViewById(txv[i]);
		txvop.setOnClickListener(contxvop);
	}
	
	edtxv = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	edtxv[0] = R.id.unit_edtv2_2;
	edtxv[1] = R.id.unit_edtv4_2;
	edtxv[2] = R.id.unit_edtv6_2;
	edtxv[3] = R.id.unit_edtv8_2;
	edtxv[4] = R.id.unit_edtv10_2;
	edtxv[5] = R.id.unit_edtv12_2;
	edtxv[6] = R.id.unit_edtv14_2;
	edtxv[7] = R.id.unit_edtv16_2;
	edtxv[8] = R.id.unit_edtv18_2;
	edtxv[9] = R.id.unit_edtv20_2;
	edtxv[10] = R.id.unit_edtv22_2;
	edtxv[11] = R.id.unit_edtv24_2;
	edtxv[12] = R.id.unit_edtv26_2;
	edtxv[13] = R.id.unit_edtv28_2;
	edtxv[14] = R.id.unit_edtv30_2;
	edtxv[15] = R.id.unit_edtv32_2;
	edtxv[16] = R.id.unit_edtv34_2;
	edtxv[17] = R.id.unit_edtv36_2;
	edtxv[18] = R.id.unit_edtv38_2;
	
	for(int ied = 0 ; ied < edtxv.length ;ied++){
		TextView txved ;
		txved = (TextView)activity.findViewById(edtxv[ied]);
		txved.setOnClickListener(contxvop);
		
	}
 }

public TextView.OnClickListener contxvop = new TextView.OnClickListener(){

	@Override
	public void onClick(View oop) {
		//行政單位網址控制
		// TODO Auto-generated method stub
		for(int tt = 0 ; tt <txv.length ; tt++){
			TextView txvopweb = (TextView)activity.findViewById(txv[tt]);
			iooo = txvopweb.getText().toString() ;
			if(oop.getId() == txv[tt]){
			itt.setData(Uri.parse(iooo));
			activity.startActivity(itt);
			}
		}
		//教學單位網址控制
		for(int ti = 0 ;ti <edtxv.length;ti++){
			TextView edtxvopweb = (TextView)activity.findViewById(edtxv[ti]);
			ioo = edtxvopweb.getText().toString() ;
			if(oop.getId() == edtxv[ti] ){
			itit.setData(Uri.parse(ioo));
			activity.startActivity(itit);	
			}
		}
	}
	
};
	
	private Button.OnClickListener conbtnChoose = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			//行政單位按鈕控制
			if(viewmode){
				if (mode == 1){			//顯示所選
					for (int i =0 ; i<Button.length ; i++){
						Button tmp_btn = (Button)activity.findViewById(Button[i]);
						LinearLayout tmp_lay = (LinearLayout)activity.findViewById(lay[i]);
						if(v.getId() == Button[i]){
							tmp_btn.setVisibility(View.VISIBLE);
							tmp_lay.setVisibility(View.VISIBLE);
						}
						else{
							tmp_btn.setVisibility(View.GONE);
							tmp_lay.setVisibility(View.GONE);
						}
					}
					mode = 2;
				}
				else if (mode == 2){				//取消所選，顯示全部
					for (int i =0 ; i<Button.length ; i++){
						Button tmp_btn = (Button)activity.findViewById(Button[i]);
						LinearLayout tmp_lay = (LinearLayout)activity.findViewById(lay[i]);
						tmp_btn.setVisibility(View.VISIBLE);
						tmp_lay.setVisibility(View.GONE);
						
					}
					mode = 1;
				}
			}
			else if (!viewmode){   
				// 教學單位按鈕控制
				if (e_mode == 1){			//顯示所選
					for (int i =0 ; i<edbt.length ; i++){
						Button tmp_btn = (Button)activity.findViewById(edbt[i]);
						LinearLayout tmp_lay = (LinearLayout)activity.findViewById(edlin[i]);
						if(v.getId() == edbt[i]){
							tmp_btn.setVisibility(View.VISIBLE);
							tmp_lay.setVisibility(View.VISIBLE);
						}
						else{
							tmp_btn.setVisibility(View.GONE);
							tmp_lay.setVisibility(View.GONE);
						}
					}
					e_mode = 2;
				}
				else if (e_mode == 2){				//取消所選，顯示全部
					for (int i =0 ; i<edbt.length ; i++){
						Button tmp_btn = (Button)activity.findViewById(edbt[i]);
						LinearLayout tmp_lay = (LinearLayout)activity.findViewById(edlin[i]);
						tmp_btn.setVisibility(View.VISIBLE);
						tmp_lay.setVisibility(View.GONE);
						
					}
					e_mode = 1;
				}
			}
			
		}
		
	};
	
	
	private Button.OnClickListener adedchange = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			ScrollView svad = (ScrollView)activity.findViewById(R.id.sv_ad);
			ScrollView sved = (ScrollView)activity.findViewById(R.id.sv_ed);
			
			if(v.getId() == btad.getId()){
				svad.setVisibility(View.VISIBLE);
				sved.setVisibility(View.GONE);
				viewmode = true;
			}
			else if (v.getId() == bted.getId()){
				svad.setVisibility(View.GONE);
				sved.setVisibility(View.VISIBLE);
				viewmode = false;
			}
			
		}
		
	};
}
