package com.chaitu.motionlayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatTextView>(R.id.item_1).setOnClickListener {
              findViewById<MotionLayout>(R.id.motion_layout).transitionToEnd()
        }

        findViewById<AppCompatTextView>(R.id.item_2).setOnClickListener {
            findViewById<MotionLayout>(R.id.motion_layout).transitionToStart()
        }
    }
}