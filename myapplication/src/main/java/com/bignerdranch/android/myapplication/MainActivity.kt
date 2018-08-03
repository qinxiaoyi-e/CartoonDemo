package com.bignerdranch.android.myapplication

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animationImg1 = findViewById(R.id.animation1) as ImageView
        animationImg1.setImageResource(R.drawable.cartoon_kotlin)
//        val animationDrawable1 = animationImg1.drawable as AnimationDrawable
//        animationDrawable1.start()
//
//        val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
//        animationImg1.startAnimation(animation)
//
//        animation.setAnimationListener(object : Animation.AnimationListener {
//            override fun onAnimationStart(animation: Animation) {
//
//            }
//
//            override fun onAnimationEnd(animation: Animation) {
//                animationImg1.startAnimation(animation)
//
//            }
//
//            override fun onAnimationRepeat(animation: Animation) {
//
//            }
//        })

        val alphaAnim = ObjectAnimator.ofFloat(animationImg1, "alpha", 1.0f, 0.5f, 0.8f, 1.0f)
        val scaleXAnim = ObjectAnimator.ofFloat(animationImg1, "scaleX", 0.0f, 1.0f)
        val scaleYAnim = ObjectAnimator.ofFloat(animationImg1, "scaleY", 0.0f, 2.0f)
        val rotateAnim = ObjectAnimator.ofFloat(animationImg1, "rotation", 0f, 360f)
        val transXAnim = ObjectAnimator.ofFloat(animationImg1, "translationX", 100f, 400f)
        val transYAnim = ObjectAnimator.ofFloat(animationImg1, "translationY", 100f, 750f)
        val set = AnimatorSet()
//        set.playTogether(alphaAnim, scaleXAnim, scaleYAnim, rotateAnim, transXAnim, transYAnim);
        set.playSequentially(alphaAnim, scaleXAnim, scaleYAnim, rotateAnim, transXAnim, transYAnim)
        set.duration = 3000
        set.start()
    }
}
