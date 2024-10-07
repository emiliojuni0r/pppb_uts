package com.example.pppb_uts

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pppb_uts.databinding.ActivitySecondBinding

private lateinit var binding: ActivitySecondBinding
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            iconHome.setOnClickListener{
                val intentToMain = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMain)
            }
            backIcon.setOnClickListener{
                val intentToMain = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMain)
            }

        }

    }
}