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
            buttonAction("0")
        })
        button1.setOnClickListener(View.OnClickListener {
            buttonAction("1")
        })
        button2.setOnClickListener(View.OnClickListener {
            buttonAction("2")
        })
        button3.setOnClickListener(View.OnClickListener {
            buttonAction("3")
        })
        button4.setOnClickListener(View.OnClickListener {
            buttonAction("4")
        })
        button5.setOnClickListener(View.OnClickListener {
            buttonAction("5")
        })
        button6.setOnClickListener(View.OnClickListener {
            buttonAction("6")
        })
        button7.setOnClickListener(View.OnClickListener {
            buttonAction("7")
        })
        button8.setOnClickListener(View.OnClickListener {
            buttonAction("8")
        })
        button9.setOnClickListener(View.OnClickListener {
            buttonAction("9")
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
    fun buttonAction(num: String){
        if (!CheckCalBoard()){
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append(num)
            mainTxt.setText(txt1)
        }
        else{
            mainTxt.setText(num)
        }
    }
     fun CheckCalBoard(): Boolean {
        val txtchecker = mainTxt.text
        if (txtchecker?.contains("=")!!) {
            return true
        }
         return false
     }
}


