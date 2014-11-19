package com.uiu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstScreen extends Activity implements OnClickListener 
{	Button btn,btn2;
	TextView tv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        
        tv=(TextView)findViewById(R.id.tv1);
        btn=(Button)findViewById(R.id.button1);
        //btn.setText("Close app");
        btn.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first_screen, menu);
        return true;
    }


	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		if(v==btn)
		{
			finish();
		}
		if(v==btn2)
		{
			tv.setText("text change");
			
		}
	}
}
