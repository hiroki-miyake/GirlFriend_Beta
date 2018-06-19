//package com.miyake.girlfriend_beta
//
//import android.app.Activity
//import android.content.Intent
//import android.graphics.Color
//import android.os.Bundle
//import android.webkit.*
//import org.jetbrains.anko.*
//
//class Anko_Activity : Activity() {
//
//    lateinit var webView : WebView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        relativeLayout {
//
//            webView = webView {
//                loadUrl("http://vcard.ameba.jp/top")
//            }
//
//            // 外部ブラウザを立ちあげない
////            webView.setWebViewClient(object : WebViewClient() {
////                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
////                    return false
////                }
////            })
//            webView.webViewClient = object : WebViewClient(){}
//
//            // javaScript を有効にする
//            webView.settings.javaScriptEnabled = true
//
//
//            // 各ボタン
//            linearLayout {
//                backgroundColor = Color.rgb(30, 150, 170)
//
//                // blank
//                button {
//                    setText("A")
//
//                    setOnClickListener {  }
////                    onClick {
////
////                    }
//                }.lparams {
//                    width = dip(60)
//                    height = dip(60)
//                    margin = dip(5)
//                    leftMargin = dip(7)
//                }
//
//                // blank
//                button {
//                    setText("B")
//
//                }.lparams {
//                    width = dip(60)
//                    height = dip(60)
//                    margin = dip(5)
//                    rightMargin = dip(7)
//                    leftMargin = dip(7)
//                }
//
//                // 再読み込み
//                button {
//                    setText("更新")
//
//                    setOnClickListener {
////                    onClick {
//                        webView.reload()
//                    }
//
//                }.lparams {
//                    width = dip(60)
//                    height = dip(60)
//                    margin = dip(5)
//                }
//
//                // テス勉結果
//                button {
//                    setText("結果")
//
//                    setOnClickListener {
////                    onClick {
//                        webView.loadUrl("http://vcard.ameba.jp/s#study/battle/result")
//                    }
//                }.lparams {
//                    width = dip(60)
//                    height = dip(60)
//                    margin = dip(5)
//                    rightMargin = dip(7)
//                    leftMargin = dip(7)
//                }
//
//                // blank
//                button {
//                    setText("C")
//
//                }.lparams {
//                    width = dip(60)
//                    height = dip(60)
//                    margin = dip(5)
//                    rightMargin = dip(10)
//                }
//
//            }.lparams {
//                width = matchParent
//                height = dip(70)
//                alignParentBottom()
//            }
//        }
//    }
//}
