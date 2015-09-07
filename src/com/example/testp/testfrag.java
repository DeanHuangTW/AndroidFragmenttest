package com.example.testp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class testfrag extends Fragment {
	private int position;
	
	public testfrag() {
		
	}
	
	public testfrag(int pos) {
		this.position = pos;
	}
	
	@Override
	public void onCreate(Bundle saved) {
		super.onCreate(saved);
		if (null != saved) {
			position = saved.getInt("posValue");
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle save) {
		save.putInt("posValue", position);
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    if (position == 1) {
	    	View view = inflater.inflate(R.layout.mylayout1, container, false);
		    return view;
	    } else if (position == 2){
	    	View view = inflater.inflate(R.layout.mylayout2, container, false);
	    	return view;
	    } else {
	    	// default
	    	LinearLayout l = new LinearLayout(getActivity().getApplicationContext());
	    	return l;
	    }
		
	  }
}
