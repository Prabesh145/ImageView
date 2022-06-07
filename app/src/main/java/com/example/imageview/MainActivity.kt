package com.example.imageview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.RadioButton
import com.bumptech.glide.Glide
import java.lang.System.load


class MainActivity : AppCompatActivity() {

    private lateinit var rdluffy: RadioButton
    private lateinit var rdsabo: RadioButton
    private lateinit var rdace: RadioButton
    private lateinit var ivImage: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rdluffy = findViewById(R.id.rdluffy)
        rdsabo = findViewById(R.id.rdsabo)
        rdace = findViewById(R.id.rdace)
        ivImage = findViewById(R.id.ivImage)

        rdluffy.setOnClickListener {
            ivImage.setImageResource(R.drawable.luffy)

        }
        rdsabo.setOnClickListener {
            ivImage.setImageResource(R.drawable.sabo)
        }
        rdace.setOnClickListener {
            Glide.with(this)
                .load("https://w7.pngwing.com/pngs/729/990/png-transparent-portgas-d-ace-one-piece-treasure-cruise-monkey-d-luffy-akainu-one-piece-manga-piracy-cartoon-thumbnail.png")
                .into(ivImage)
        }



    }
}

