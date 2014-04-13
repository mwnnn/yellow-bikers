package com.pplc7.yellowbikerspeminjam;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.pplc7.yellowbikerspeminjam.util.SystemUiHider;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class QrCodeActivity extends Activity {

	TextView eMainTextView;
	ImageView eQrCodeImg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_qrcode);

		eMainTextView = (TextView) findViewById(R.id.mainTextView);

		eQrCodeImg = (ImageView) findViewById(R.id.qrCodeImg);
		UrlImageViewHelper
				.setUrlDrawable(
						eQrCodeImg,
						"http://chart.apis.google.com/chart?cht=qr&chs=300x300&chl=1106000400123456&chld=H|0");
		// ConnectionDetector cd = new
		// ConnectionDetector(getApplicationContext());
		// Boolean isInternetPresent = cd.isConnectingToInternet();
		//
		//
		//
		// // check for Internet status
		// if (isInternetPresent) {
		// // Internet Connection is Present
		// // make HTTP requests
		// Toast.makeText(this, "connected", Toast.LENGTH_SHORT).show();
		//
		// eQrCodeImg = (ImageView) findViewById(R.id.qrCodeImg);
		//
		// URL url;
		// Bitmap bmp;
		// try {
		// url = new URL(
		// "http://chart.apis.google.com/chart?cht=qr&chs=300x300&chl=1106000400123456&chld=H|0");
		// bmp = BitmapFactory.decodeStream(url.openConnection()
		// .getInputStream());
		// eQrCodeImg.setImageBitmap(bmp);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// } else {
		// // Internet connection is not present
		// // Ask user to connect to Internet
		// Toast.makeText(this, "not connected :(", Toast.LENGTH_SHORT).show();
		// }

	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
	}

}
