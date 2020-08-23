package com.example.firstprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("0")
            mainTxt.setText(txt1)
        })

        button1.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("1")
            mainTxt.setText(txt1)
        })
        button2.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("2")
            mainTxt.setText(txt1)
        })
        button3.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("3")
            mainTxt.setText(txt1)
        })
        button4.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("4")
            mainTxt.setText(txt1)
        })
        button5.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("5")
            mainTxt.setText(txt1)
        })
        button6.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("6")
            mainTxt.setText(txt1)
        })
        button7.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("7")
            mainTxt.setText(txt1)
        })
        button8.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("8")
            mainTxt.setText(txt1)
        })
        button9.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("9")
            mainTxt.setText(txt1)
        })
        buttonSum.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("+")
            mainTxt.setText(txt1)
        })
        buttonSubmission.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("-")
            mainTxt.setText(txt1)
        })
        buttonMultiplication.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append("*")
            mainTxt.setText(txt1)
        })

        buttonEqual.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txtArray = txt?.split("+")
            val number = txtArray?.get(0)?.toInt()?.plus(txtArray?.get(1)?.toInt())
            val txt1 = StringBuilder()
            txt1.append(txt).append("=").append(number)
            mainTxt.setText(txt1)
        })
    }
}