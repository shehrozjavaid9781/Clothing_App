package com.example.clothingapp.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.clothingapp.R
import com.example.clothingapp.ui.login.RegisterActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        },2500)

    }
}