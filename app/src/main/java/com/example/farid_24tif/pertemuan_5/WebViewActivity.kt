package com.example.farid_24tif.pertemuan_5

import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.farid_24tif.R
import com.example.farid_24tif.databinding.ActivityFifthBinding
import com.example.farid_24tif.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Web LK21"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        binding.WebView.webViewClient = WebViewClient()
        binding.WebView.settings.javaScriptEnabled = true
        binding.WebView.loadUrl("https://d21.team")

        // Agar Toolbar hide/show saat scroll web
        binding.WebView.setOnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
            if (scrollY > oldScrollY) {
                binding.appBarLayout.setExpanded(false, true) // sembunyikan
            } else if (scrollY < oldScrollY) {
                binding.appBarLayout.setExpanded(true, true) // tampilkan
            }
        }
    }

    //Mengaktifkan tombol back pada toolbar
    override fun onBackPressed() {
        if (binding.WebView.canGoBack()) {
            binding.WebView.goBack() // Kembali ke halaman sebelumnya
        } else {
            super.onBackPressed() // Keluar dari aplikasi
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}