package com.rahmahnajiyahimtihan.input_user_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            //ambil inputan user
            val inputOne = edt1.text.toString()
            val inputTwo = edt2.text.toString()

            if (inputOne == "" || inputTwo == ""){ // == (berartikan kosong)

                Toast.makeText(this@MainActivity, "Inputan Kosong", Toast.LENGTH_SHORT).show()
            }
            else{
                //convert to double
                val resultCon = inputOne.toDouble()
                val resultCon2 = inputTwo.toDouble()

                val hasil = resultCon * resultCon2

                txt1.text = "$hasil"
            }
        }


    }
}
