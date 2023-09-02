package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.util.MyClass

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        saySomething()

        val myVar: IntArray

        val intent = parent

        Log.d(TAG, "onCreate: MainActivity")

        val myList = listOf("Red", "Green", "Blue")
        for (color in myList){
            Log.d(TAG, "onCreate: $color")
        }
        
    }

    private fun saySomething() {
        val myClass = MyClass()
        myClass.saySomething()
    }
}

