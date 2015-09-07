package com.example.testp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class testfrag extends Fragment {
	private int position;
	
	public testfrag() {
		
	}
	
	public testfrag(int pos) {
		this.position = pos;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
		Context ctx = getActivity().getApplicationContext();
		LinearLayout l = new LinearLayout(ctx);
		
		int i;
		for (i = 0; i < position; i++) {
			/* show textview */
			TextView text = new TextView(ctx);
			text.setText(String.valueOf(i+1));
			l.addView(text);
		}
		
		return l;
	}
}
