package com.miyake.girlfriend_beta

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.LinearLayout


class XML_Activity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_bar = findViewById<LinearLayout>(R.id.button_bar)
        val webView = findViewById<WebView>(R.id.webView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button_bar.setBackgroundColor(Color.rgb(30, 150, 170))

        webView.loadUrl("http://vcard.ameba.jp/top")
        webView.webViewClient = object : WebViewClient(){}
        webView.settings.javaScriptEnabled = true

        button3.setOnClickListener{ webView.reload() }
        button4.setOnClickListener{ webView.loadUrl("http://vcard.ameba.jp/s#study/battle/result")}
    }
}