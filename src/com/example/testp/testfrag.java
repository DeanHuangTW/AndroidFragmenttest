package com.example.testp;

import android.app.Activity;
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
	Button mBtn2;
	TextView layout1Text;
	
	public interface MyInterface{
        public void getMessage(String msg);
    }
	public MyInterface myInterface;
	
	public testfrag() {		
	}
	
	//當這Fragment加入Activity時，會被callback的方法，僅執行一次。
	@Override
    public void onAttach(Activity activity) {
        myInterface = (MyInterface) activity;  //這樣可以取到實作MyInterface的Activity
        super.onAttach(activity);
    }
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View view = inflater.inflate(R.layout.mylayout1, container, false);
    	//取得來自activity的資料，並設置在layout1上的TextView
    	layout1Text = (TextView) view.findViewById(R.id.layout1_textView1);
    	Bundle bundle = getArguments();
    	String arg = bundle.getString("data");
    	layout1Text.setText(arg);
    	
    	mBtn1 = (Button)view.findViewById(R.id.layout1_button1);
    	mBtn1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				//可以利用getActivity()取的activity的物件
				TextView text = (TextView) getActivity().findViewById(R.id.main_textView1);
				text.setText("this text is set by testfrag.java");
				
			}
		});
    	
    	mBtn2 = (Button)view.findViewById(R.id.layout1_button2);
    	mBtn2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				myInterface.getMessage("來自於fragment的消息");
			}
		});
    	
	    return view;

	  }
}
