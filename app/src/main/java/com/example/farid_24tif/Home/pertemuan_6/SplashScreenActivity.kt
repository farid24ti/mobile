package com.example.farid_24tif.Home.pertemuan_6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.farid_24tif.BaseActivity
import com.example.farid_24tif.MainActivity
import com.example.farid_24tif.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {
            delay(2000) // simulasi proses awal

            // Cek sesi login di balik layar splash
            val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)
            val isLogin = sharedPref.getBoolean("isLogin", false)

            val target = if (isLogin) {
                BaseActivity::class.java   // sudah login
            } else {
                AuthActivity::class.java   // belum login
            }

            startActivity(Intent(this@SplashScreenActivity, target))
            finish()
        }
    }
}