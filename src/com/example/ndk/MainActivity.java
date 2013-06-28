package com.example.ndk;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyLib lib = new MyLib();
        int test= 123;

		int result = lib.add(100, 200);
		int result2= lib.subtract(300, 200);
		int test2=12;
		TextView resultView = (TextView) findViewById(R.id.ID_TextView_Hello);
		resultView.setText(String.valueOf(result2));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
