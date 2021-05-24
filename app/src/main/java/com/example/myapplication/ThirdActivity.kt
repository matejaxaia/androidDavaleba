package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val age = intent.extras?.getInt("AGE").toString()

        finishButton.setOnClickListener {

            val surname: String = editTextTextPersonSurname.text.trim().toString()

            if (surname.isEmpty()) {
                Toast.makeText(this, "Empty surname!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("SURNAME", surname)
            finish()
            startActivity(intent)
        }
    }


}