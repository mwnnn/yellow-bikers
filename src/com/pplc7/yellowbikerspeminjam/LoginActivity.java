package com.pplc7.yellowbikerspeminjam;

import com.pplc7.yellowbikerspeminjam.util.SystemUiHider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class LoginActivity extends Activity {

	SharedPreferences settings;
	SharedPreferences.Editor editor;
	String npm;
	String fakultas;
	public static final String PREFS_NAME = "MyPrefsFile";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);
		
		settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		npm = settings.getString("npm", "tidak ditemukan");
		fakultas = settings.getString("fakultas", "tidak ditemukan");
		
		if (!npm.equalsIgnoreCase("tidak ditemukan")) {
			Intent i = new Intent(this, MainMenuActivity.class);
			startActivity(i);
		}

	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

	}

	public void OnSignIn(View v) {
		if (v.getId() == R.id.signInButton) {
			Intent i = new Intent(this, SignUpActivity.class);
			startActivity(i);
		}
	}

}
