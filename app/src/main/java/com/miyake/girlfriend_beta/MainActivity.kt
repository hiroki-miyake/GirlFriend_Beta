package com.miyake.girlfriend_beta

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.webkit.*
import org.jetbrains.anko.*

class MainActivity : Activity() {

    var webView : WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        relativeLayout {

            webView = webView {
                loadUrl("http://vcard.ameba.jp/top")
            }

            // 外部ブラウザを立ちあげない
            webView!!.setWebViewClient(object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    return false
                }
            })

            // javaScript を有効にする
            webView!!.settings.javaScriptEnabled = true

            // 各ボタン
            linearLayout {
                backgroundColor = Color.rgb(30, 150, 170)

                // 再読み込み
                button {
                    setText("reload")

                    onClick {
                        webView!!.reload()
                    }
                }.lparams {
                    width = dip(60)
                    height = dip(60)
                    margin = dip(5)
                }

                // テス勉結果
                button {
                    setText("resalt")

                    onClick {
                        webView!!.loadUrl("http://vcard.ameba.jp/s#study/battle/result")
                    }
                }.lparams {
                    width = dip(60)
                    height = dip(60)
                    margin = dip(5)
                }
            }.lparams {
                width = matchParent
                height = dip(70)
                alignParentBottom()
            }
        }
    }
}
