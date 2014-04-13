package com.pplc7.yellowbikerspeminjam;

import com.pplc7.yellowbikerspeminjam.util.SystemUiHider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class LoginActivity extends Activity {

	// inisiasi obyek
	// private Button eSignInButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);

		// penambahan intent ke signInButton
		// eSignInButton = (Button) findViewById(R.id.signInButton);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

	}

	public void OnSignIn(View v) {
		if (v.getId() == R.id.signInButton) {
			Intent i = new Intent(this, MainMenuActivity.class);
			startActivity(i);
		}
	}

}
