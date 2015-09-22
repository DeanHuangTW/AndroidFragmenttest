package com.example.testp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btn1;
	Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button) findViewById(R.id.main_button1);
		btn2 = (Button) findViewById(R.id.main_button2);
		
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				enableFragment1();
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			}
		});
	}
	
	
	private void enableFragment1() {
		Fragment fr = new testfrag();
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		//傳資料給fragment
		Bundle bundle = new Bundle();
		bundle.putString("data", "這是從activity來的data");
		fr.setArguments(bundle);
		
		ft.replace(R.id.main_fragment, fr);
		ft.commit();
	}

}
