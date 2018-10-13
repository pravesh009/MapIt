package com.example.pjain2.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String word[] = message.split("\\^");
      //  TextView textView = new TextView(this);
        TextView textView=(TextView)findViewById(R.id.textview);
        textView.setText(word[0]);
        //setContentView(textView);
        String url = word[1];
        //textView.setText(url);
       // ImageView imageView=(ImageView) findViewById(R.id.image);
        PhotoView pv=(PhotoView)findViewById(R.id.photo_view);
        //Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").resize(500, 500).into(pv);
        Picasso.with(this).load(url).into(pv);
        //PhotoViewAttacher  pv=new PhotoViewAttacher(imageView);
        //pv.update();
    }

}
