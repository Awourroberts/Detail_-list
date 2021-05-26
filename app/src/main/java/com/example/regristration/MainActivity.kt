package com.example.regristration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etName = findViewById<EditText>(R.id.etName)//R.ID IS THE A MAPPING BTN VIEW INTERGERS
        var etDOB = findViewById<EditText>(R.id.etDob)
        var etId = findViewById<EditText>(R.id.etId)
        var etNationality = findViewById<EditText>(R.id.etNationality)
        var etEmail = findViewById<EditText>(R.id.etEmail)
        var etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber)
        var btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {  it:View!
            var name = etName.text.toString()//ACCESSING THE VAIRABLE NAME
            var DoB = etDOB.text.toString()
            var IdNo = etId.text.toString()
            var Nationality=etNationality.text.toString()
            var Email = etEmail.text.toString()
            var PhoneNumber = etPhoneNumber.text.toString()
            var Student=Student(name,Dob,Id,Nationality,PhoneNumber,Email)
            Toast.makeText(baseContext, Student.toString(), Toast.LENGTH_LONG).show()//TOASTING EVERYDAY BASECONTENT GIVES THE APP A HANDLE
        }// AN ANANYMOUS
    }
}
data class  Student(var name:String,var dob:String,var nationality:String,var email:String,var phone:String)