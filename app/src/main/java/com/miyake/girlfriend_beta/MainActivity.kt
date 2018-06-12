package com.miyake.girlfriend_beta

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.webkit.*
import org.jetbrains.anko.*

class MainActivity : Activity() {

    lateinit var webView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        relativeLayout {
            button {
                setText("Anko")
                onClick {
                    startActivity(Intent(this@MainActivity, Anko_Activity::class.java))
                }
            }.lparams {
                width = dip(100)
                height = dip(50)
                alignParentTop()
                topMargin = dip(150)
                gravity = Gravity.CENTER_HORIZONTAL
            }

            button {
                setText("xml")
                onClick {
                    startActivity(Intent(this@MainActivity, XML_Activity::class.java))
                }
            }.lparams {
                width = dip(100)
                height = dip(50)
                topMargin = dip(250)
                gravity = Gravity.CENTER_HORIZONTAL
            }

        }
    }
}
