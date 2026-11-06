package com.example.saturnus_riska

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saturnus_riska.databinding.ActivityMainBinding
import com.example.saturnus_riska.Home.pertemuan_4.FourthActivity
import com.example.saturnus_riska.Home.pertemuan_5.FifthActivity
import com.example.saturnus_riska.Home.pertemuan_7.SeventhActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPertemuan4.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)

            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }
        binding.btnPertemuan5.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        binding.btnPertemuan7.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
        }
    }
}