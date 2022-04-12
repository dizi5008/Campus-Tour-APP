package com.example.interface1;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class life2 {
	
	public Activity activity ;
	public String life2_url ;
	public Button btn_up,btn_next1,btn_again,btn_stop;
	public WebView wee ;

	public life2(Context _context) {
		// TODO Auto-generated constructor stub
		activity = (Activity)_context ;
		
	}
	public void opwebbt(String url2) {
		// TODO Auto-generated method stub
		activity.setContentView(R.layout.life_2);
		life2_url = url2 ;
		
		btn_up = (Button)activity.findViewById(R.id.life2_up);
		btn_next1 = (Button)activity.findViewById(R.id.life2_next);
		btn_again = (Button)activity.findViewById(R.id.life2_again);
		btn_stop = (Button)activity.findViewById(R.id.life2_stop);
		btn_up.setOnClickListener(openweb2);
		btn_next1.setOnClickListener(openweb2);
		btn_again.setOnClickListener(openweb2);
		btn_stop.setOnClickListener(openweb2);
		
		wee = (WebView)activity.findViewById(R.id.life2_webView1);
		webop();
	}
	
	public Button.OnClickListener openweb2 = new Button.OnClickListener(){

		@Override
		public void onClick(View va) {
			// TODO Auto-generated method stub
		switch(va.getId()){
		case R.id.life2_up:
			wee.goBack();
			break;
		case R.id.life2_next :
			wee.goForward();
			break;
		case R.id.life2_again :
			wee.reload();
			break;
		case R.id.life2_stop :
			wee.stopLoading();
			break;
		}
				
		}
		
	};
	
	public void webop(){
		wee.setInitialScale(150);
		wee.getSettings().setJavaScriptEnabled(true);
		wee.getSettings().setBuiltInZoomControls(true);
		wee.invokeZoomPicker();
		wee.loadUrl(life2_url);
		wee.setWebViewClient(new WebViewClient(){

			@Override
			public void onPageFinished(WebView view, String url) {
				// TODO Auto-generated method stub
				super.onPageFinished(view, url);
			}

			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				// TODO Auto-generated method stub
				super.onPageStarted(view, url, favicon);
			}

			@Override
			public void onReceivedError(WebView view, int errorCode,
					String description, String failingUrl) {
				// TODO Auto-generated method stub
				super.onReceivedError(view, errorCode, description, failingUrl);
			}

			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				//return super.shouldOverrideUrlLoading(view, url);
				return false ;
			}
			
			
			
		});
	}


}
