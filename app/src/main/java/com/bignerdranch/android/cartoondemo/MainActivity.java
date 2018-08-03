package com.bignerdranch.android.cartoondemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Animation animation ;
    private ImageView animationImg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationImg1 =  findViewById(R.id.animation1);
        animationImg1.setImageResource(R.drawable.cartoon);
//        AnimationDrawable animationDrawable1 = (AnimationDrawable) animationImg1.getDrawable();
//        animationDrawable1.start();
//
//        animation = AnimationUtils.loadAnimation(this, R.anim.scale);
//        animationImg1 .startAnimation(animation);
//
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                animationImg1 .startAnimation(animation);
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });


        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat( animationImg1, "alpha", 1.0f, 0.5f, 0.8f, 1.0f);
        ObjectAnimator scaleXAnim = ObjectAnimator.ofFloat( animationImg1, "scaleX", 0.0f, 1.0f);
        ObjectAnimator scaleYAnim = ObjectAnimator.ofFloat( animationImg1, "scaleY", 0.0f, 2.0f);
        ObjectAnimator rotateAnim = ObjectAnimator.ofFloat( animationImg1, "rotation", 0, 360);
        ObjectAnimator transXAnim = ObjectAnimator.ofFloat( animationImg1, "translationX", 100, 400);
        ObjectAnimator transYAnim = ObjectAnimator.ofFloat( animationImg1, "translationY", 100, 750);
        AnimatorSet set = new AnimatorSet();
//        set.playTogether(alphaAnim, scaleXAnim, scaleYAnim, rotateAnim, transXAnim, transYAnim);
                set.playSequentially(alphaAnim, scaleXAnim, scaleYAnim, rotateAnim, transXAnim, transYAnim);
        set.setDuration(3000);
        set.start();


    }
}
