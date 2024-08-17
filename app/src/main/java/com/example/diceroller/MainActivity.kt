package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val rollButton: Button = findViewById(R.id.roll_button)
       rollButton.text="Let's Roll"

        rollButton.setOnClickListener {
            //Toast.makeText(this, "button clicked by Ashish", Toast.LENGTH_SHORT).show()

             rollDice()
        }



    }

    private fun rollDice() {

        val randomInt = (1..6).random()
       val drawableResource= when (randomInt) {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val diceImage: ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)



//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
    }
}