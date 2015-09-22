package com.example.testp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class testfrag2 extends Fragment {
	public testfrag2() {
		
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View view = inflater.inflate(R.layout.mylayout2, container, false);
	    return view;

	  }
}
