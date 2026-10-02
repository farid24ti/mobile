package com.example.farid_24tif

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.farid_24tif.databinding.ActivityMainBinding
import com.example.farid_24tif.pertemuan_4.FourthActivity
import com.example.farid_24tif.pertemuan_5.FifthActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)

            /*tambahkan bagian berikut*/
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }
        binding.btnToFifth.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
    }
}