package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrackActivity extends AppCompatActivity {
private TextView Confirmed;
private TextView preparing;
private TextView OnTheWay;
private TextView arrived;
private ImageView view1;
private ImageView view2;
private ImageView view3;
private ImageView view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        Confirmed=findViewById(R.id.textView6);
        preparing= findViewById(R.id.textView7);
        OnTheWay= findViewById(R.id.textView8);
        arrived= findViewById(R.id.textView9);
        view1=findViewById(R.id.imageView1);
        view2=findViewById(R.id.imageView2);
        view3=findViewById(R.id.imageView3);
        view4=findViewById(R.id.imageView4);

        ShowConfirmed();
    }

    private void ShowConfirmed(){
        Confirmed.setText("Order Confirmed");
        view1.setVisibility(View.INVISIBLE);
        view2.setVisibility(View.INVISIBLE);
        view3.setVisibility(View.INVISIBLE);
        view4.setVisibility(View.INVISIBLE);

        Handler h =new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                ShowPreparing();
            }
        },3000);
    }
    private void ShowPreparing(){
        preparing.setText("Order Is Getting Prepared");
        Confirmed.setTextColor(getResources().getColor(R.color.light_grey));
        view1.setVisibility(View.VISIBLE);

        Handler h =new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                ShowOnTheWay();
            }
        },5000);
    }
    private void ShowOnTheWay(){
        OnTheWay.setText("Order Is On The Way");
        preparing.setTextColor(getResources().getColor(R.color.light_grey));
        view2.setVisibility(View.VISIBLE);

        Handler h =new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                ShowArrived();
            }
        },5000);
    }
    private void ShowArrived() {
        arrived.setText("Order Has Arrived");
        OnTheWay.setTextColor(getResources().getColor(R.color.light_grey));
        view3.setVisibility(View.VISIBLE);
        view4.setVisibility(View.VISIBLE);

        Handler h =new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_ratings);
            }
        },1000);


    }

}