package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageViewProfile.setImageResource(R.drawable.empty)
        buttonCalculate.setOnClickListener(){
                val heightStr = editTextHeight.text.toString()
                val height:Double = heightStr.toDouble()
                val weightStr = editTextWeight.text.toString()
                val weight = weightStr.toDouble()
                val bmi:Double = weight/(height*height)
            val Result:String
            if(bmi < 18.5) {
                Result = "(Under)"
                imageViewProfile.setImageResource(R.drawable.under)

            }
            else if(bmi >= 18.5 && bmi <=24.9)
            {
                Result = "(Normal)"
                imageViewProfile.setImageResource(R.drawable.normal)

            }
            else
            {
                Result = "(Over)"
                imageViewProfile.setImageResource(R.drawable.over)

            }
            textViewBMI.text = "BMI : %.2f %s".format(bmi,Result)
        }

        buttonReset.setOnClickListener(){
         editTextHeight.setText("")
            editTextWeight.setText("")
            textViewBMI.setText("")
            imageViewProfile.setImageResource(R.drawable.empty)
            editTextWeight.requestFocus()

        }

    }


}
