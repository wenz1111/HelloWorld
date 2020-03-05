package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    private val fragmentManager = supportFragmentManager
    private val fragmentSelection = SelectionFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Initialize Action Bar
        val actionBar = supportActionBar

        // Customize Action Bar title
        //actionBar!!.title = "New Activity"

        // Set default fragment to display
        /*val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment, fragmentSelection)
        fragmentTransaction.commit()*/

        // Set Button OnClickListener
        secondActBtn1.setOnClickListener(this)
    }


    // Set On Button Click Listener
    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.secondActBtn1 -> {
                Log.d("Second Activity", "Button is Clicked!")
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
