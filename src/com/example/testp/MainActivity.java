package com.example.testp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//預設使用layout1
		Fragment fr = new testfrag(1);
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.fragment1, fr);
		ft.commit();
	}
	

}
