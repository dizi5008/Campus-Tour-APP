package com.example.interface1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	
	//�Ĥ@�����J�I�scgohome
	cgohome firstload = new cgohome(MainActivity.this); //�N�D��context�ǤJcgohome
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);  //�]�w����
		Singleton.sence =  R.layout.activity_main;; //������hxml
		//�I�ssetclick
		firstload.setclick();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//����U��^��]�w
	public void onBackPressed(){
		if (Singleton.sence == R.layout.activity_main){
		AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
		MyAlertDialog.setTitle("�t�ΰT��");
		MyAlertDialog.setMessage("�T�w���}?");
		MyAlertDialog.setPositiveButton("�T�w",exitapp);
		MyAlertDialog.setNegativeButton("����",null);
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
