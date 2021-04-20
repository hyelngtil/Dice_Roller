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

    //  Displays the resultText of the rolled dice
        rollButton.setOnClickListener { rollDice() }
    }

    //  creates a text for the result of rolled dice
    private fun rollDice() {
        val myDice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = myDice.roll().toString()
    }

}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}