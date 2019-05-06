package com.example.saadiqbal.ghalibbookindividual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAppScreenHome extends AppCompatActivity implements View.OnClickListener {

    ImageView book,back,next,infoo;
    TextView bookCounter;
    int temp = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_screen_home);
        infoo = (ImageView) findViewById(R.id.infoscreen);
        book = (ImageView)findViewById(R.id.bookshelf);
        book.setOnClickListener(this);
        infoo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.bookshelf:
                if(temp == 1)
                {
                    Intent i = new Intent(MainAppScreenHome.this,BookTitle.class);
                    startActivity(i);
                }
                break;
            case R.id.infoscreen:
                if(temp == 1)
                {
                    Intent i = new Intent(MainAppScreenHome.this,info.class);
                    startActivity(i);
                }
                break;
        }
    }
}
