package com.example.pjain2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

import static android.provider.AlarmClock.EXTRA_MESSAGE;



public class MainActivity extends AppCompatActivity {
    EditText from;
    EditText to;
            Button gd;
public final static String EXTRA_MESSAGE="com.example.myHelloAndroid.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         gd = (Button)findViewById(R.id.button);
         from = (EditText)findViewById(R.id.from);
         to = (EditText)findViewById(R.id.to);

        gd.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

                        String data = "From: "+from.getText().toString()+" To: "+to.getText().toString();
                        String url="http://192.168.43.43:8000/Android/?from="+from.getText().toString()+"&to="+to.getText().toString();
                        String message=data+"^"+url;
                        intent.putExtra(EXTRA_MESSAGE, message);
                        startActivity(intent);
                    }
                });

    }
}
