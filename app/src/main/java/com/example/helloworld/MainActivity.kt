package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private val TAG: String = MainActivity::class.java.simpleName

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null){
            Log.d(TAG, "onCreate() Restoring previous state") // To restore state
        } else {
            Log.d(TAG, "onCreate() No saved state available") // Initialize app
        }
    }
}