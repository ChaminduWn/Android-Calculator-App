package com.example.androidcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.androidcalculatorapp.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat
import kotlin.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonClear.setOnClickListener {
            binding.input.text = ""
            binding.output.text = ""
        }

        binding.buttonLeftBracket.setOnClickListener {
            binding.input.text = addToInput("(")
        }
        binding.buttonRightBracket.setOnClickListener {
            binding.input.text = addToInput(")")
        }
        binding.button0.setOnClickListener {
            binding.input.text = addToInput("0")
        }
        binding.button1.setOnClickListener {
            binding.input.text = addToInput("1")
        }
        binding.button2.setOnClickListener {
            binding.input.text = addToInput("2")
        }
        binding.button3.setOnClickListener {
            binding.input.text = addToInput("3")
        }
        binding.button4.setOnClickListener {
            binding.input.text = addToInput("4")
        }
        binding.button5.setOnClickListener {
            binding.input.text = addToInput("5")
        }
        binding.button6.setOnClickListener {
            binding.input.text = addToInput("6")
        }
        binding.button7.setOnClickListener {
            binding.input.text = addToInput("7")
        }
        binding.button8.setOnClickListener {
            binding.input.text = addToInput("8")
        }
        binding.button9.setOnClickListener {
            binding.input.text = addToInput("9")
        }
//        binding.buttonClear.setOnClickListener {
//            binding.input.text = addToInput("C")
//        }
        binding.buttonDot.setOnClickListener {
            binding.input.text = addToInput(".")
        }
        binding.buttonMinus.setOnClickListener {
            binding.input.text = addToInput("-")
        }
        binding.buttonPlus.setOnClickListener {
            binding.input.text = addToInput("+")
        }
        binding.buttonModulus.setOnClickListener {
            binding.input.text = addToInput("%")
        }
        binding.buttonDivision.setOnClickListener {
            binding.input.text = addToInput("÷")
        }
        binding.buttonMultiply.setOnClickListener {
            binding.input.text = addToInput("×")
        }
        binding.buttonEquals.setOnClickListener {
            showResult()
        }
    }

    private fun addToInput(buttonValue: String): String {
        return "${binding.input.text}$buttonValue"
    }

    private fun getInputExpression(): String {
        var expression = binding.input.text.toString().replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
//                binding.output.text = "Error"
                binding.output.setTextColor(ContextCompat.getColor(this,R.color.red))

            } else {
                binding.output.text = DecimalFormat("0.######").format(result).toString()
                binding.output.setTextColor(ContextCompat.getColor(this,R.color.green))

            }
        } catch (e: Exception) {
//            binding.output.text = "Error"
            binding.output.setTextColor(ContextCompat.getColor(this,R.color.red))

        }
    }
}
