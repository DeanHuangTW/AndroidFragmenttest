package com.example.testp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class testfrag extends Fragment implements View.OnClickListener{
	private int position;
	private Button mBtnLayoutChange;
	
	public testfrag() {
		
	}
	
	public testfrag(int pos) {
		this.position = pos;
	}
	
	@Override
	public void onCreate(Bundle saved) {
		super.onCreate(saved);
		Log.v("Dean", "onCreate");
		
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
		Log.v("Dean", "onCreateView");
		if (position == 1) {
	    	View view = inflater.inflate(R.layout.mylayout1, container, false);
	    	//取得view上的item
	    	mBtnLayoutChange = (Button) view.findViewById(R.id.button1);
	    	mBtnLayoutChange.setOnClickListener(this);
		    return view;
	    } else if (position == 2){
	    	View view = inflater.inflate(R.layout.mylayout2, container, false);
	    	mBtnLayoutChange = (Button) view.findViewById(R.id.button1);
	    	mBtnLayoutChange.setOnClickListener(this);
	    	return view;
	    } else {
	    	// default
	    	LinearLayout l = new LinearLayout(getActivity().getApplicationContext());
	    	return l;
	    }
		
	}
	
	@Override
	public void onClick(View v) {
		if (v == mBtnLayoutChange) {
			Fragment fr;
			if (position == 1) {
				fr = new testfrag(2);
			} else {
				fr = new testfrag(1);
			}
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.fragment1, fr);
			ft.commit();
		}
	}
}
