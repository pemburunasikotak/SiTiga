package com.example.sitiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_kependudukan.setOnClickListener {
            val intent = Intent(this, Kependudukan::class.java)
            startActivity(intent)

        }
        btn_PDRD.setOnClickListener {
            val intent = Intent(this, Pdrd::class.java)
            startActivity(intent)

        }

        btn_ketenagakerjaan.setOnClickListener {
            val intent = Intent(this, Ketenagakerjaan::class.java)
            startActivity(intent)

        }

        btn_IPM.setOnClickListener {
            val intent = Intent(this, Ipm::class.java)
            startActivity(intent)

        }

        btn_kemiskinan.setOnClickListener {
            val intent = Intent(this, Kemiskinan::class.java)
            startActivity(intent)

        }

        btn_lainya.setOnClickListener {
            val intent = Intent(this, Lainya::class.java)
            startActivity(intent)

        }

        btn_tblDinamis.setOnClickListener {
            val intent = Intent(this, Dinamis::class.java)
            startActivity(intent)

        }

        btn_galery.setOnClickListener {
            val intent = Intent(this, Galery::class.java)
            startActivity(intent)

        }

        btn_berita.setOnClickListener {
            val intent = Intent(this, Berita::class.java)
            startActivity(intent)

        }

        btn_publikasi.setOnClickListener {
            val intent = Intent(this, Publikasi::class.java)
            startActivity(intent)

        }

        fullscreen()

    }
    private fun fullscreen() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}