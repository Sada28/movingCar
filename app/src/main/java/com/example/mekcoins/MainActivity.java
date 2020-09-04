package com.example.mekcoins;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView flag1;
    ImageView flag2;
    ImageView flag3;
    ImageView flag4;
    ImageView flag5;
    ImageView flag6;
    ImageView flag7;
    ImageView flag8;
    ImageView flag9;

    ImageView myCar,myCar2,myCar3;
    ObjectAnimator animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag1 = findViewById(R.id.flag1);
        flag2 = findViewById(R.id.flag2);
        flag3 = findViewById(R.id.flag3);
        flag4 = findViewById(R.id.flag4);
        flag5 = findViewById(R.id.flag5);
        flag6 = findViewById(R.id.flag6);
        flag7 = findViewById(R.id.flag7);
        flag8 = findViewById(R.id.flag8);
        flag9 = findViewById(R.id.flag9);

        myCar = findViewById(R.id.myCar);
        myCar2 = findViewById(R.id.myCar2);
        myCar3 = findViewById(R.id.myCar3);
        myCar2.setVisibility(View.INVISIBLE);
        myCar3.setVisibility(View.INVISIBLE);



        //for flag1
        animation = ObjectAnimator.ofFloat(myCar, "translationX",350f);
        animation.setDuration(2000);
        animation.start();
        new CountDownTimer(2000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag1.setImageResource(R.drawable.flag_green);
                for2();
            }

        }.start();



    }

    private void for2() {
        animation = ObjectAnimator.ofFloat(myCar, "translationX",550f);
        animation.setDuration(1500);
        animation.start();
        new CountDownTimer(1500, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag2.setImageResource(R.drawable.flag_green);
                for3();
            }

        }.start();
    }

    private void for3(){
        new CountDownTimer(1000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                myCar.animate().rotationBy(180f).setDuration(1500).setInterpolator(new LinearInterpolator()).start();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Path path = new Path();
                    path.arcTo(650f, 400f, 900f, 750f, 250f, 180f, true);
                    ObjectAnimator animator = ObjectAnimator.ofFloat(myCar, View.X, View.Y, path);
                    animator.setDuration(1000);
                    animator.start();
                }
                flag3.setImageResource(R.drawable.flag_green);
                myCar.setVisibility(View.INVISIBLE);
                myCar2.setVisibility(View.VISIBLE);
                for4();
            }

        }.start();


    }

    private void for4() {
        //for flag1
        animation = ObjectAnimator.ofFloat(myCar2, "translationX",-500f);
        animation.setDuration(1000);
        animation.start();
        new CountDownTimer(1000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag4.setImageResource(R.drawable.flag_green);
                for6();
            }

        }.start();

    }



    private void  for6(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Path path = new Path();
            path.arcTo(0f, 800f, 100f, 1000f, 270f, -200f, true);
            ObjectAnimator animator = ObjectAnimator.ofFloat(myCar2, View.X, View.Y, path);
            animator.setDuration(1000);
            animator.start();
        }
        flag5.setImageResource(R.drawable.flag_green);




        new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                flag6.setImageResource(R.drawable.flag_green);
                myCar2.setVisibility(View.INVISIBLE);
                myCar3.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFinish() {

                for7();

            }

        }.start();

    }

    private void for7(){
        //for flag7
        animation = ObjectAnimator.ofFloat(myCar3, "translationX",300f);
        animation.setDuration(1000);
        animation.start();
        new CountDownTimer(1000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag7.setImageResource(R.drawable.flag_green);
                for8();
            }

        }.start();



    }
    private void for8(){
        //for flag8
        animation = ObjectAnimator.ofFloat(myCar3, "translationX",400f);
        animation.setDuration(500);
        animation.start();
        new CountDownTimer(500, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag8.setImageResource(R.drawable.flag_green);
                for9();
            }

        }.start();


    }
    private void for9(){
        //for flag9
        animation = ObjectAnimator.ofFloat(myCar3, "translationX",500f);
        animation.setDuration(500);
        animation.start();
        new CountDownTimer(500, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                flag9.setImageResource(R.drawable.flag_green);
            }

        }.start();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.layout_menu, menu);
        return true;
    }


}