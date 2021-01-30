package com.example.sitiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ipm.*
import kotlinx.android.synthetic.main.activity_publikasi.*

class Ipm : AppCompatActivity() {
    var webViewPrivacyPolicy: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ipm)
        webView2()
        btn_kemabli_ipm.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
    private fun webView2() {
        webViewPrivacyPolicy = findViewById(R.id.webViewIpm) as WebView
        /* get setting from webview to set load image automatically to true */
        webViewPrivacyPolicy!!.settings.loadsImagesAutomatically = true
        /* get setting from webview to set java script enable */
        webViewPrivacyPolicy!!.settings.javaScriptEnabled = true
        /* get setting from webview to set dom storage enable */
        webViewPrivacyPolicy!!.settings.domStorageEnabled = true
        /* get setting from webview to set support for zoom to true */
        webViewPrivacyPolicy!!.settings.setSupportZoom(false)
        /* get setting from webview to set built in zoom controls to true */
        webViewPrivacyPolicy!!.settings.builtInZoomControls = false
        /* get setting from webview to set display zom control to false*/
        webViewPrivacyPolicy!!.settings.displayZoomControls = false
        webViewPrivacyPolicy!!.settings.defaultZoom = WebSettings.ZoomDensity.FAR
        /* set scrollbar style to SCROLLBARS_INSIDE_OVERLAY */
        webViewPrivacyPolicy!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/subject/26/indeks-pembangunan-manusia.html")
        /* set webview client */
        webViewPrivacyPolicy!!.webViewClient = WebViewClient()
        //webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/subject/40/gender.html#subjekViewTab3")
    }
}