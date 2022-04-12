package com.example.interface1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class security {
	
	public Activity activity;
	private TextView ocu_phone;
	private TextView safe_phone;
	private TextView callphone;
	private TextView testdp;
	private ListView lv;
	Button go_home;
	
	public security(Context _activity){
		activity = (Activity)_activity;
		go_home = (Button)activity.findViewById(R.id.btn_security);
	}
	
	/**
	 * @param args
	 */
	
	public void gocallphone(){
		//將頁面轉為security
		activity.setContentView(R.layout.security);
		//ListView監聽事件
		lv = (ListView)activity.findViewById(R.id.listView1);
		lv.setOnItemClickListener(clicklv);
	}
	
	//ListView設定監聽事件，可參見課本第6章
	private ListView.OnItemClickListener clicklv = new ListView.OnItemClickListener(){
		@Override
		public void onItemClick(AdapterView<?> arg0, View v, int position,
				long id) {
			// TODO Auto-generated method stub
			String item;
			TextView txv = (TextView) v;
			item = txv.getText().toString();
			switch (item){
			case ("僑光科大\n04-27016855"):
				Intent it = new Intent();
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("tel:04-27016855"));
				activity.startActivity(it);
				break;
			case("生輔組\n04-27016855分機 1327"):
				Intent it1 = new Intent();
				it1.setAction(Intent.ACTION_VIEW);
				it1.setData(Uri.parse("tel:04-27070785p1327"));
				activity.startActivity(it1);
				break;
			case("軍訓室\n04-27018279"):
				Intent it11 = new Intent();
				it11.setAction(Intent.ACTION_VIEW);
				it11.setData(Uri.parse("tel:04-27018279"));
				activity.startActivity(it11);
				break;
			case("軍訓室緊急事故通報專線\n04-27070785"):
				Intent test_in = new Intent();
				test_in.setAction(Intent.ACTION_VIEW);
				test_in.setData(Uri.parse("tel:04-27070785"));
				activity.startActivity(test_in);
				break;
			case("諮商輔導中心\n04-27016855 分機1315"):
				Intent test_inn = new Intent();
				test_inn.setAction(Intent.ACTION_VIEW);
				test_inn.setData(Uri.parse("tel:04-27016855p1315"));
				activity.startActivity(test_inn);
			default:
				break;
			}}};
	
	
	
	

	}
