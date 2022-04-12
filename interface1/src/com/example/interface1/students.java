package com.example.interface1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class students {
	
	public Activity activity ;
	public Button go_home ;
	public Button uppage,nextpage,againpage,stoppage ;
	public WebView wv ;
	public ProgressDialog progressBar;
	
	public students(Context _context){
		activity = (Activity)_context ;
		go_home = (Button)activity.findViewById(R.id.btn_stu);
	}

	public void webopen() {
		// TODO Auto-generated method stub
		activity.setContentView(R.layout.students);
		uppage = (Button)activity.findViewById(R.id.stu_up);
		nextpage = (Button)activity.findViewById(R.id.stu_next);
		againpage = (Button)activity.findViewById(R.id.stu_again);
		stoppage = (Button)activity.findViewById(R.id.stu_stop);
		
		uppage.setOnClickListener(btnopen);
		nextpage.setOnClickListener(btnopen);
		againpage.setOnClickListener(btnopen);
		stoppage.setOnClickListener(btnopen);
//		
		wv = (WebView)activity.findViewById(R.id.stu_webView1);
		startweb() ;
	}
	
	public Button.OnClickListener btnopen = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			case R.id.stu_up :
				wv.goBack();
				break;
			case R.id.stu_next :
				wv.goForward();
				break;
			case R.id.stu_again :
				wv.reload();
				break;
			case R.id.stu_stop :
				wv.stopLoading();
				break;
				
			}
			
		}
		
	};
	
	public void startweb(){
		//wv.setInitialScale(130);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setSupportZoom(true);
		wv.getSettings().setBuiltInZoomControls(true);
		wv.getSettings().setUseWideViewPort(true);
		wv.getSettings().setLoadWithOverviewMode(true);
		wv.invokeZoomPicker();
		String s = "http://ccap.ocu.edu.tw/bridgelogin/login.aspx" ;
		wv.loadUrl(s);
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
