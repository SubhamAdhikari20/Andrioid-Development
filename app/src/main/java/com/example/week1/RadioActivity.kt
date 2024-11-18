package com.example.week1

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var apple : RadioButton
    lateinit var banana : RadioButton
    lateinit var cherry : RadioButton
    lateinit var image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)

        apple = findViewById(R.id.radioApple)
        banana = findViewById(R.id.radioBanana)
        cherry = findViewById(R.id.radioCherry)
        image = findViewById(R.id.imageView)

        apple.setOnClickListener{
            image.setImageResource(R.drawable.apple)
        }

        banana.setOnClickListener{
            image.setImageResource(R.drawable.banana)
        }

        cherry.setOnClickListener{
            image.setImageResource(R.drawable.cherry)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}