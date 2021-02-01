"# SITIGA " 
Merupakan aplikasi Mobile Berbasis webView yang menampilkan data dari Web Salatiga

tampilan Home
![image](https://user-images.githubusercontent.com/32323599/106445028-1b016f80-64b1-11eb-8e11-b038ad5d9a5d.png)

tampilan Depan
![image](https://user-images.githubusercontent.com/32323599/106445140-3bc9c500-64b1-11eb-91a3-f934deb58df3.png)

tampilan ISI
![image](https://user-images.githubusercontent.com/32323599/106445198-4b490e00-64b1-11eb-9b95-25cab31d4d05.png)

##Tambahkan 
android:usesCleartextTraffic="true">
Di bagian Manifest 


##Perintah untuk memanggill Web View
private fun webView2() {
        webViewPrivacyPolicy = findViewById(R.id.webViewBerita) as WebView
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
        webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/pressrelease.html")
        /* set webview client */
        webViewPrivacyPolicy!!.webViewClient = WebViewClient()
        //webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/subject/40/gender.html#subjekViewTab3")
    }
