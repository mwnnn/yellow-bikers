package com.pplc7.yellowbikerspeminjam;

import com.pplc7.yellowbikerspeminjam.util.SystemUiHider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MainMenuActivity extends Activity {

	TextView eNpmMainMenuTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main_menu);
//		Session session = new Session();
//		
//		String npm = session.getSessionItem("npm");
		eNpmMainMenuTextView = (TextView) findViewById(R.id.npmTextView);
		
		//eNpmMainMenuTextView.setText(npm);

	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

	}
	
	public void OnQrCodeClick(View v) {
		if (v.getId() == R.id.qrCodeViewButton) {
			Intent i = new Intent(this, QrCodeActivity.class);
			startActivity(i);
		}
	}
	
	public void OnStatisticsClick(View v) {
		if (v.getId() == R.id.statisticsViewButton) {
			Intent i = new Intent(this, StatisticsActivity.class);
			startActivity(i);
		}
	}
	
	public void OnTrackingClick(View v) {
		if (v.getId() == R.id.trackingViewButton) {
			Intent i = new Intent(this, TrackingActivity.class);
			startActivity(i);
		}
	}
	
}
