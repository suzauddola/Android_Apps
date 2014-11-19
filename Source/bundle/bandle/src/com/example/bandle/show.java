package com.example.bandle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class show extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		Bundle b = getIntent().getExtras();
		
		
		TextView tvnew = (TextView) findViewById(R.id.firsttext);
		tvnew.setText(b.getString("tvn"));
		
		TextView etnew = (TextView) findViewById(R.id.secoundtext);
		etnew.setText(b.getString("etn1"));		
			
	}

}
