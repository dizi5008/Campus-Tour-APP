package com.example.interface1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	
	//第一次載入呼叫cgohome
	cgohome firstload = new cgohome(MainActivity.this); //將主頁context傳入cgohome
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);  //設定頁面
		Singleton.sence =  R.layout.activity_main;; //紀錄當層xml
		//呼叫setclick
		firstload.setclick();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//當按下返回鍵設定
	public void onBackPressed(){
		if (Singleton.sence == R.layout.activity_main){
		AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
		MyAlertDialog.setTitle("系統訊息");
		MyAlertDialog.setMessage("確定離開?");
		MyAlertDialog.setPositiveButton("確定",exitapp);
		MyAlertDialog.setNegativeButton("取消",null);
		MyAlertDialog.show();
		}
		
		else if(Singleton.sence == R.layout.life_2){
			setContentView(R.layout.life_2);
			life lif = new life(MainActivity.this);
			lif.goweb();
			Singleton.sence = R.layout.life;
		}
		else{
			setContentView(R.layout.activity_main);
			Singleton.sence = R.layout.activity_main;
			firstload.setclick();
		}
		
	}
	private DialogInterface.OnClickListener exitapp = new DialogInterface.OnClickListener(){

		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			finish();
			
		}
		
	};
}
