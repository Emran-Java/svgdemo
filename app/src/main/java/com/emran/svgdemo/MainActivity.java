package com.emran.svgdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.SystemClock;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        ImageView imageView = (ImageView) findViewById(R.id.imageView);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //for API level >=21 (LOLLIPOP)
            Drawable drawable = mContext.getResources().getDrawable(R.drawable.ic_linux, mContext.getTheme());
            imageView.setImageDrawable(drawable);
        }
        else{
            //for API level <=20 (KitKat)
            Drawable drawable = VectorDrawableCompat.create(getResources(), R.drawable.ic_linux, mContext.getTheme());
            imageView.setImageDrawable(drawable);
        }

    }
}
