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
            txt1.append(txt).append(" + ")
            mainTxt.setText(txt1)
        })
        buttonSubmission.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append(" - ")
            mainTxt.setText(txt1)
        })
        buttonMultiplication.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append(" * ")
            mainTxt.setText(txt1)
        })
        buttonDivision.setOnClickListener(View.OnClickListener {
            val txt = mainTxt.text
            val txt1 = StringBuilder()
            txt1.append(txt).append(" / ")
            mainTxt.setText(txt1)
        })

        buttonEqual.setOnClickListener(View.OnClickListener {
            var txt = mainTxt.text
            var txtArray = arrayOf<String>()
            if (txt?.contains("+")!! || txt?.contains("-")!! || txt?.contains("*")!! || txt?.contains(
                    "/"
                )!!
            ) {
                txtArray = txt?.split(" ").toTypedArray()
            }
            //

//Multiplication and Division block :
            var j = 0
            for (i in txtArray) {
                if (txtArray[j] == "*") {
                    for (a in j-1 downTo 0){
                        if (txtArray[a] == "") continue
                        txtArray[a] = (txtArray[a].toDouble() * txtArray[j + 1].toDouble()).toString()
                        break
                    }
                    txtArray[j] = ""
                    txtArray[j+1] = ""
                }
                if (txtArray[j] == "/") {
                    for (a in j-1 downTo 0){
                        if (txtArray[a] == "") continue
                        txtArray[a] = (txtArray[a].toDouble() / txtArray[j + 1].toDouble()).toString()
                        break
                    }
                    txtArray[j] = ""
                    txtArray[j+1] = ""
                }
                j++
            }
// ////////////////////////////////////////////

//sum and Submission block :
            var temp = ""
            var signTemp = ""
            for (seq in txtArray) {
                if (seq == "") continue
                if (!(seq == "+" || seq == "-")) {
                    if (temp == "") temp = seq
                    else {
                        if (signTemp == "+") temp = (temp.toDouble() + seq.toDouble()).toString()
                        if (signTemp == "-") temp = (temp.toDouble() - seq.toDouble()).toString()
                    }
                } else {
                    signTemp = seq
                }
            }
 // ////////////////////////////////////


            var io = mainTxt.text.toString() + " = " + temp
            mainTxt.setText(io)
        })
    }
    private fun buttonAction(num: String){
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
    private fun CheckCalBoard(): Boolean {
        val txtchecker = mainTxt.text
        if (txtchecker?.contains("=")!!) {
            return true
        }
         return false
     }
}


