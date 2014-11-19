package com.example.bandle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        
        final TextView tv1 = (TextView) findViewById(R.id.name);
        final EditText et1 = (EditText) findViewById(R.id.name1); 
        
       
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
		
       
        
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(Main.this, show.class);
				 Bundle b = new Bundle();
				 b.putString("tvn", tv1.getText().toString());
				 b.putString("etn1", et1.getText().toString());

				 i.putExtras(b);
				 startActivity(i);
				
			}
		});

    }
}
