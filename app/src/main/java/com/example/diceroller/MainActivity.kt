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
        rollButton.setOnClickListener{
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
        }

        val myDice = Dice(6)

// Displays the result of rolled dice
        rollButton.setOnClickListener{
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = myDice.roll().toString()

        }
    }

}
class Dice(private val numSides: Int) {
    fun roll(): Int{
        return (1..numSides).random()
    }
}