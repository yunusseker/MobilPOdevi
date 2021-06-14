package com.yunus.mobilpodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadSplashScreen()

    }

    private fun loadSplashScreen() {
        Handler().postDelayed({

            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
    }
}






