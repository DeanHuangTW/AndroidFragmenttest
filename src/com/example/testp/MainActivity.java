package com.example.testp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);
		
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				stackAFragment(1);
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				stackAFragment(2);
			}
		});
	}
	/* 定義一個新的Fragment */
	private void stackAFragment(int pos) {
		Fragment fr = new testfrag(pos);
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.fragment1, fr);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		ft.addToBackStack(null);
		ft.commit();
	}

}
