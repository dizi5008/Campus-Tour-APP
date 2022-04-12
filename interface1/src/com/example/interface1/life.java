package com.example.interface1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class life {
	
	public Activity activity ;
	public int sence_life2back ;
	public Button go_home ;
	public Button btn_apple,btn_ltn,btn_now,btn_tnog,btn_technew,btn_next,btn_sky,btn_bus,btn_cnyes ;
	Button[] btn = new Button[9];
	public WebView wvv ;
	public String url;
	
	
	
	public life(Context _context) {
		// TODO Auto-generated constructor stub
		activity = (Activity)_context ;
		go_home = (Button)activity.findViewById(R.id.btn_life);
		
	}

	public life(int sence_lifeback) {
		// TODO Auto-generated constructor stub
		sence_life2back = sence_lifeback ;
	}

	public void goweb() {
		// TODO Auto-generated method stub
		activity.setContentView(R.layout.life);
		
		/*btn_apple = (Button)activity.findViewById(R.id.life_btnapple);
		btn_ltn = (Button)activity.findViewById(R.id.life_btnltn);
		btn_now = (Button)activity.findViewById(R.id.life_btnnow);
		btn_tnog = (Button)activity.findViewById(R.id.life_btnog);
		btn_technew = (Button)activity.findViewById(R.id.life_btntechnew);
		btn_next= (Button)activity.findViewById(R.id.life_btnnext);
		btn_sky = (Button)activity.findViewById(R.id.life_btnsky);
		btn_bus = (Button)activity.findViewById(R.id.life_btnbus);
		btn_cnyes = (Button)activity.findViewById(R.id.life_btncnyes);*/
		
		btn[0] = (Button)activity.findViewById(R.id.life_btnapple);
		btn[1] = (Button)activity.findViewById(R.id.life_btnltn);
		btn[2] = (Button)activity.findViewById(R.id.life_btnnow);
		btn[3] = (Button)activity.findViewById(R.id.life_btnog);
		btn[4] = (Button)activity.findViewById(R.id.life_btntechnew);
		btn[5] = (Button)activity.findViewById(R.id.life_btnnext);
		btn[6] = (Button)activity.findViewById(R.id.life_btnsky);
		btn[7] = (Button)activity.findViewById(R.id.life_btnbus);
		btn[8] = (Button)activity.findViewById(R.id.life_btncnyes);
		
		for(int i =0 ; i<btn.length ; i++){
			btn[i].setOnClickListener(openweb);
			Drawable d = btn[i].getBackground();
			BitmapDrawable bd=(BitmapDrawable)d;
			int h = bd.getBitmap().getHeight();
			int w = bd.getBitmap().getWidth();
			float scale = (float)h / (float)w;
			float f = Singleton.windowsWidth / 3;
			//Log.d("mike", String.valueOf(i) + "height=" + String.valueOf(h) + " , width=" + String.valueOf(w));
			
			btn[i].getLayoutParams().width = (int)(Singleton.windowsWidth / 3);
			btn[i].getLayoutParams().height = (int)((Singleton.windowsWidth / 3) * scale);
			Log.d("mike", String.valueOf(btn[i].getLayoutParams().width) + "===" + String.valueOf(Singleton.windowsWidth / 3));
		}
		//wvv = (WebView)activity.findViewById(R.id.life_webView1);
		
	}
	
	public Button.OnClickListener openweb = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			life2 liff = new life2(v.getContext());
			switch(v.getId()){
			case R.id.life_btnapple:
				url = "http://www.appledaily.com.tw/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnltn :
				url = "http://www.ltn.com.tw/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnnow:
				url = "http://www.nownews.com/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnog :
				url = "http://buzzorange.com/techorange/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btntechnew:
				url = "http://technews.tw/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnnext :
				url = "http://www.bnext.com.tw/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnsky :
				url = "http://www.cw.com.tw/home.action" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btnbus :
				url = "http://www.businessweekly.com.tw/" ;
				liff.opwebbt(url);
				break;
			case R.id.life_btncnyes :
				url = "http://www.cnyes.com/" ;
				liff.opwebbt(url);
				break;

			}
			Singleton.sence = R.layout.life_2;
		}
		
	};
	
//	public void openweb(String url2){
//		wvv.setInitialScale(150);
//		wvv.getSettings().setJavaScriptEnabled(true);
//		wvv.getSettings().setBuiltInZoomControls(true);
//		wvv.invokeZoomPicker();
//		wvv.loadUrl(url2);
//		wvv.setWebViewClient(new WebViewClient(){
//
//			@Override
//			public void onPageFinished(WebView view, String url) {
//				// TODO Auto-generated method stub
//				super.onPageFinished(view, url);
//			}
//
//			@Override
//			public void onPageStarted(WebView view, String url, Bitmap favicon) {
//				// TODO Auto-generated method stub
//				super.onPageStarted(view, url, favicon);
//			}
//
//			@Override
//			public void onReceivedError(WebView view, int errorCode,
//					String description, String failingUrl) {
//				// TODO Auto-generated method stub
//				super.onReceivedError(view, errorCode, description, failingUrl);
//			}
//
//			@Override
//			public boolean shouldOverrideUrlLoading(WebView view, String url) {
//				// TODO Auto-generated method stub
//				//return super.shouldOverrideUrlLoading(view, url);
//				return false ;
//			}
//			
//			
//			
//		});
//	}

}
