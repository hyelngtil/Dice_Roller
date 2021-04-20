package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
        }

    //  Displays the resultText(textView) of the rolled dice
        rollButton.setOnClickListener { rollDice() }
    }

    //  creates 2 dice object and a text for the result of rolled dice
    private fun rollDice() {
        val my6Dice = Dice(6)
        val my8Dice = Dice(8)

        val resultTextView: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView.text = my6Dice.roll().toString()
        resultTextView2.text = my8Dice.roll().toString()
    }

}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}