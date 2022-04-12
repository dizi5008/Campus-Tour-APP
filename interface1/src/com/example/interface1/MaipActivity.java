package com.example.interface1;

import uk.co.senab.photoview.PhotoViewAttacher;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MaipActivity extends Activity {
	private PhotoViewAttacher mAttacher;
	ImageView mImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maip);
		mImageView = (ImageView) findViewById(R.id.show_img);
		Drawable d = null;
		switch(Singleton.position){
		case 0:
			d = getResources().getDrawable(R.drawable.mainpageimg1);
			break;
		case 1:
			d = getResources().getDrawable(R.drawable.mainpageimg2);
			break;
		case 2:
			d = getResources().getDrawable(R.drawable.mainpageimg3);
			break;
		case 3:
			d = getResources().getDrawable(R.drawable.mainpageimg4);
			break;
		case 4:
			d = getResources().getDrawable(R.drawable.mainpageimg5);
			break;
		}
		mImageView.setImageDrawable(d);
		
		mAttacher = new PhotoViewAttacher(mImageView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.maip, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
