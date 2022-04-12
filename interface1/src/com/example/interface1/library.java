package com.example.interface1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class library {
	
	public Activity activity ;
	public Button go_home ;
	public Button uppage,nextpage,againpage,stoppage ;
	public ProgressDialog progressBar;
	public WebView wv ;
	
	public library(Context _context){
		activity = (Activity)_context  ;
		go_home = (Button)activity.findViewById(R.id.btn_lib);
	}

	public void opweb() {
		// TODO Auto-generated method stub
		activity.setContentView(R.layout.library);
		uppage = (Button)activity.findViewById(R.id.lib_up);
		nextpage = (Button)activity.findViewById(R.id.lib_next);
		againpage = (Button)activity.findViewById(R.id.lib_again);
		stoppage = (Button)activity.findViewById(R.id.lib_stop);
		
		uppage.setOnClickListener(btnopen);
		nextpage.setOnClickListener(btnopen);
		againpage.setOnClickListener(btnopen);
		stoppage.setOnClickListener(btnopen);
		wv = (WebView)activity.findViewById(R.id.lib_webView1);
		startweb();
	}
	
	public Button.OnClickListener btnopen = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.lib_up :
				wv.goBack();
			break;
			case R.id.lib_next :
				wv.goForward();
			break;
			case R.id.lib_again :
				wv.reload();
			break;
			case R.id.lib_stop :
				wv.stopLoading();
			break;
			}
		}
		
	};
	
	public void startweb(){
		wv.setInitialScale(150);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setBuiltInZoomControls(true);
		wv.invokeZoomPicker();
		wv.loadUrl("http://203.72.145.166/Webpac2/msearch.dll/");
		wv.setWebViewClient(new WebViewClient(){

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
//				return super.shouldOverrideUrlLoading(view, url);
				return false ;
			}
			
		});
	}
	
}
