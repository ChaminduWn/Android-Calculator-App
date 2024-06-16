package com.example.androidcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button_0
import kotlinx.android.synthetic.main.activity_main.button_1
import kotlinx.android.synthetic.main.activity_main.button_2
import kotlinx.android.synthetic.main.activity_main.button_3
import kotlinx.android.synthetic.main.activity_main.button_4
import kotlinx.android.synthetic.main.activity_main.button_5
import kotlinx.android.synthetic.main.activity_main.button_6
import kotlinx.android.synthetic.main.activity_main.button_7
import kotlinx.android.synthetic.main.activity_main.button_8
import kotlinx.android.synthetic.main.activity_main.button_9
import kotlinx.android.synthetic.main.activity_main.button_clear
import kotlinx.android.synthetic.main.activity_main.button_devision
import kotlinx.android.synthetic.main.activity_main.button_dot
import kotlinx.android.synthetic.main.activity_main.button_equals
import kotlinx.android.synthetic.main.activity_main.button_left_bracket
import kotlinx.android.synthetic.main.activity_main.button_minus
import kotlinx.android.synthetic.main.activity_main.button_modulus
import kotlinx.android.synthetic.main.activity_main.button_mutiply
import kotlinx.android.synthetic.main.activity_main.button_plus
import kotlinx.android.synthetic.main.activity_main.button_right_bracket
import kotlinx.android.synthetic.main.activity_main.input
import kotlinx.android.synthetic.main.activity_main.output
import java.lang.Exception
import kotlin.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clear.setOnClickListener {
            input.text = ""
            output.text =""

        }

        button_left_bracket.setOnClickListener {
            input.text= addToInput("(")
        }
        button_right_bracket.setOnClickListener {
            input.text= addToInput(")")
        }
        button_0.setOnClickListener {
            input.text = addToInput("0")
        }
        button_1.setOnClickListener {
            input.text = addToInput("1")
        }
        button_2.setOnClickListener {
            input.text = addToInput("2")
        }
        button_3.setOnClickListener {
            input.text = addToInput("3")
        }
        button_4.setOnClickListener {
            input.text = addToInput("4")
        }
        button_5.setOnClickListener {
            input.text = addToInput("5")
        }
        button_6.setOnClickListener {
            input.text = addToInput("6")
        }
        button_7.setOnClickListener {
            input.text = addToInput("7")
        }
        button_8.setOnClickListener {
            input.text = addToInput("8")
        }
        button_9.setOnClickListener {
            input.text = addToInput("9")
        }
        button_clear.setOnClickListener {
            input.text =addToInput("C")
        }
        button_dot.setOnClickListener {
            input.text = addToInput(".")
        }
        button_minus.setOnClickListener {
            input.text = addToInput("-")
        }
        button_plus.setOnClickListener {
            input.text = addToInput("+")
        }
        button_modulus.setOnClickListener {
            input.text = addToInput("%")
        }
        button_devision.setOnClickListener {
            input.text = addToInput("÷")
        }
        button_mutiply.setOnClickListener {
            input.text = addToInput("×")
        }
        button_equals.setOnClickListener {
            showResult()
        }


    }

    private fun addToInput(buttonValue: String):String {
        return "${input.text}$buttonValue"

    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷"),"/")
        expression = expression.replace(Regex("×"),"*")
        return expression
    }

    private fun showResult(){
        try{
            val expression = getInputExpression()
        } catch (e: Exception){

        }
    }
}