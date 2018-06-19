package com.miyake.girlfriend_beta

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.*
import android.widget.*

class XML_Activity : Activity(){

    lateinit var webView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_bar = findViewById<LinearLayout>(R.id.button_bar)
        webView = findViewById<WebView>(R.id.webView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button_bar.setBackgroundColor(Color.rgb(30, 150, 170))

        webView.apply {
            loadUrl("http://vcard.ameba.jp/top")

            settings.javaScriptEnabled = true

            webViewClient = object : WebViewClient(){}

            webChromeClient = object : WebChromeClient(){}
        }
/*
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient(){}

        webView.webChromeClient = object : WebChromeClient(){
//            override fun onJsAlert(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
//                result?.cancel()
//                return false
//            }

//            override fun onJsBeforeUnload(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
//                result?.equals(true)
//                return false
//            }
//
//            override fun onJsConfirm(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
////                result?.confirm()
////                result?.cancel()
//                return true
//            }
//
//            override fun onJsPrompt(view: WebView?, url: String?, message: String?, defaultValue: String?, result: JsPromptResult?): Boolean {
////                result?.confirm("")
////                result?.cancel()
//                return true
//            }
        }

        webView.loadUrl("http://vcard.ameba.jp/top")

        webView.resumeTimers()
*/
        button1.setOnClickListener {  }
        button2.setOnClickListener { webView.loadUrl("http://vcard.ameba.jp/mypage") }
        button3.setOnClickListener { webView.reload() }
        button4.setOnClickListener { webView.loadUrl("http://vcard.ameba.jp/s#study/battle/result")}
        button5.setOnClickListener {  }

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        // backKey でブラウザバックを行う
        if(keyCode == KeyEvent.KEYCODE_BACK) webView.goBack()
        return false
    }

    override fun onStop() {
        super.onStop()

        webView.clearCache(true)
    }
}