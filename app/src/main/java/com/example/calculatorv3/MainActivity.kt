package com.example.calculatorv3

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var op = ""
    var oldNUmber = ""
    var newNumber = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun closeApp(view: View) {
        moveTaskToBack(true)
        android.os.Process.killProcess(android.os.Process.myPid())
        exitProcess(1)
    }

    fun numbers(view: View) {
        if (newNumber){
            numberDisplay.text = ""
        }
        newNumber = false
        val select = view as Button
        var click:String = numberDisplay.text.toString()
        when(select.id){
            button1.id -> {
                click += "1"

                button1.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button2.id -> {
                click += "2"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button3.id -> {
                click += "3"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button4.id -> {
                click += "4"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button5.id -> {
                click += "5"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button6.id -> {
                click += "6"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button7.id -> {
                click += "7"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button8.id -> {
                click += "8"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button9.id -> {
                click += "9"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button10.id -> {
                click += "0"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))
            }
            button11.id -> {
                click += "."

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))

                button11.isClickable = false

            }

        }

        numberDisplay.text = click

    }

    fun operatorFun(view: View) {

        val select = view as Button
        when (select.id) {
            button13.id -> {

                op = "+"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))

            }
            button14.id -> {

                op = "-"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))

            }
            button15.id -> {

                op = "×"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button16.setBackgroundColor(Color.parseColor("#BABABA"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))

            }
            button16.id -> {

                op = "÷"

                button1.setBackgroundColor(Color.parseColor("#BABABA"))
                button2.setBackgroundColor(Color.parseColor("#BABABA"))
                button3.setBackgroundColor(Color.parseColor("#BABABA"))
                button4.setBackgroundColor(Color.parseColor("#BABABA"))
                button5.setBackgroundColor(Color.parseColor("#BABABA"))
                button6.setBackgroundColor(Color.parseColor("#BABABA"))
                button7.setBackgroundColor(Color.parseColor("#BABABA"))
                button8.setBackgroundColor(Color.parseColor("#BABABA"))
                button9.setBackgroundColor(Color.parseColor("#BABABA"))
                button10.setBackgroundColor(Color.parseColor("#BABABA"))
                button11.setBackgroundColor(Color.parseColor("#BABABA"))
                button12.setBackgroundColor(Color.parseColor("#BABABA"))
                button13.setBackgroundColor(Color.parseColor("#BABABA"))
                button14.setBackgroundColor(Color.parseColor("#BABABA"))
                button15.setBackgroundColor(Color.parseColor("#BABABA"))
                button16.setBackgroundColor(Color.parseColor("#A0E1FF"))
                button17.setBackgroundColor(Color.parseColor("#BABABA"))
                button19.setBackgroundColor(Color.parseColor("#BABABA"))

            }
        }

        oldNUmber = numberDisplay.text.toString()
        newNumber = true
        button11.isClickable = true
    }

    fun equalButton(view: View) {
        var newNumber1 = numberDisplay.text.toString()
        var finalNumber:Double?=null
        when(op){

            "+" -> {
                finalNumber= oldNUmber.toDouble() + newNumber1.toDouble()
            }
            "-" -> {
                finalNumber= oldNUmber.toDouble() - newNumber1.toDouble()

            }
            "×" -> {
                finalNumber= oldNUmber.toDouble() * newNumber1.toDouble()

            }
            "÷" -> {
                finalNumber= oldNUmber.toDouble() / newNumber1.toDouble()

            }
        }

        button1.setBackgroundColor(Color.parseColor("#BABABA"))
        button2.setBackgroundColor(Color.parseColor("#BABABA"))
        button3.setBackgroundColor(Color.parseColor("#BABABA"))
        button4.setBackgroundColor(Color.parseColor("#BABABA"))
        button5.setBackgroundColor(Color.parseColor("#BABABA"))
        button6.setBackgroundColor(Color.parseColor("#BABABA"))
        button7.setBackgroundColor(Color.parseColor("#BABABA"))
        button8.setBackgroundColor(Color.parseColor("#BABABA"))
        button9.setBackgroundColor(Color.parseColor("#BABABA"))
        button10.setBackgroundColor(Color.parseColor("#BABABA"))
        button11.setBackgroundColor(Color.parseColor("#BABABA"))
        button12.setBackgroundColor(Color.parseColor("#A0E1FF"))
        button13.setBackgroundColor(Color.parseColor("#BABABA"))
        button14.setBackgroundColor(Color.parseColor("#BABABA"))
        button15.setBackgroundColor(Color.parseColor("#BABABA"))
        button16.setBackgroundColor(Color.parseColor("#BABABA"))
        button17.setBackgroundColor(Color.parseColor("#BABABA"))
        button19.setBackgroundColor(Color.parseColor("#BABABA"))

        numberDisplay.text = finalNumber.toString()

        newNumber = true

    }

    fun backSpace(view: View) {
        if (numberDisplay.text.toString() != "") {
            var value = numberDisplay.text.toString()
            if (value.isNotEmpty()) {
                value = value.substring(0,value.length - 1)
                numberDisplay.text = value
            }
        }

        button1.setBackgroundColor(Color.parseColor("#BABABA"))
        button2.setBackgroundColor(Color.parseColor("#BABABA"))
        button3.setBackgroundColor(Color.parseColor("#BABABA"))
        button4.setBackgroundColor(Color.parseColor("#BABABA"))
        button5.setBackgroundColor(Color.parseColor("#BABABA"))
        button6.setBackgroundColor(Color.parseColor("#BABABA"))
        button7.setBackgroundColor(Color.parseColor("#BABABA"))
        button8.setBackgroundColor(Color.parseColor("#BABABA"))
        button9.setBackgroundColor(Color.parseColor("#BABABA"))
        button10.setBackgroundColor(Color.parseColor("#BABABA"))
        button11.setBackgroundColor(Color.parseColor("#BABABA"))
        button12.setBackgroundColor(Color.parseColor("#BABABA"))
        button13.setBackgroundColor(Color.parseColor("#BABABA"))
        button14.setBackgroundColor(Color.parseColor("#BABABA"))
        button15.setBackgroundColor(Color.parseColor("#BABABA"))
        button16.setBackgroundColor(Color.parseColor("#BABABA"))
        button17.setBackgroundColor(Color.parseColor("#BABABA"))
        button19.setBackgroundColor(Color.parseColor("#A0E1FF"))

        button11.isClickable = true
    }


    fun clearInput(view: View) {
        numberDisplay.text = ""
        newNumber = true

        button1.setBackgroundColor(Color.parseColor("#BABABA"))
        button2.setBackgroundColor(Color.parseColor("#BABABA"))
        button3.setBackgroundColor(Color.parseColor("#BABABA"))
        button4.setBackgroundColor(Color.parseColor("#BABABA"))
        button5.setBackgroundColor(Color.parseColor("#BABABA"))
        button6.setBackgroundColor(Color.parseColor("#BABABA"))
        button7.setBackgroundColor(Color.parseColor("#BABABA"))
        button8.setBackgroundColor(Color.parseColor("#BABABA"))
        button9.setBackgroundColor(Color.parseColor("#BABABA"))
        button10.setBackgroundColor(Color.parseColor("#BABABA"))
        button11.setBackgroundColor(Color.parseColor("#BABABA"))
        button12.setBackgroundColor(Color.parseColor("#BABABA"))
        button13.setBackgroundColor(Color.parseColor("#BABABA"))
        button14.setBackgroundColor(Color.parseColor("#BABABA"))
        button15.setBackgroundColor(Color.parseColor("#BABABA"))
        button16.setBackgroundColor(Color.parseColor("#BABABA"))
        button17.setBackgroundColor(Color.parseColor("#A0E1FF"))
        button19.setBackgroundColor(Color.parseColor("#BABABA"))

        button11.isClickable = true

    }

    fun showHistory(view: View) {
        val intent = Intent(this, History::class.java)
        startActivity(intent)
    }
}