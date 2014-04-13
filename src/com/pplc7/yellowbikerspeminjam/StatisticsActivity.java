package com.pplc7.yellowbikerspeminjam;

import com.pplc7.yellowbikerspeminjam.util.SystemUiHider;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class StatisticsActivity extends Activity {

	ListView eListView;
	TextView eTextView1;

	SharedPreferences settings;
	SharedPreferences.Editor editor;
	String npm;
	String fakultas;
	public static final String PREFS_NAME = "MyPrefsFile";
	
	TextView eDummy2TextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_statistics);

		eListView = (ListView) findViewById(R.id.listView1);
		eDummy2TextView = (TextView) findViewById(R.id.dummy2TextView);

		String[] ct_name = null;

		DatabaseAdapter db = new DatabaseAdapter();

		// get npm and fakultas
		settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		npm = settings.getString("npm", "tidak ditemukan");
		fakultas = settings.getString("fakultas", "tidak ditemukan");
		
		eDummy2TextView.setText(npm);

		ct_name = db.statistik(npm);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, ct_name);
		eListView.setAdapter(adapter);
		eListView.setTextFilterEnabled(true);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

	}

}
