package com.example.testp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class testfrag extends Fragment {
	Button mBtn1;
	TextView layout1Text;
	public testfrag() {
		
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View view = inflater.inflate(R.layout.mylayout1, container, false);
    	//���o�Ӧ�activity����ơA�ó]�m�blayout1�W��TextView
    	layout1Text = (TextView) view.findViewById(R.id.layout1_textView1);
    	Bundle bundle = getArguments();
    	String arg = bundle.getString("data");
    	layout1Text.setText(arg);
    	
    	mBtn1 = (Button)view.findViewById(R.id.layout1_button1);
    	mBtn1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				//�i�H�Q��getActivity()����activity������
				TextView text = (TextView) getActivity().findViewById(R.id.main_textView1);
				text.setText("this text is set by testfrag.java");
				
			}
		});
	    return view;

	  }
}
