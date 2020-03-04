package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val fragmentManager = supportFragmentManager
    private val titleFragment = TitleFragment()
    private val titleFragment2 = Title2Fragment()
    var fragmentBtn : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set OnClickListener
        materialButton.setOnClickListener(this)
        materialButtonFragment.setOnClickListener(this)

        // Display first Fragment Title initially
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentTitle, titleFragment)
        fragmentTransaction.commit()
    }

    // Change Display Text function
    private fun changeDisplayText() {
        Log.d("Main Activity", "Hello World button is clicked!")
        Log.d("Main Activity", "${materialTextView.text != getString(R.string.mainActivityText1)}")
        if (materialTextView.text != getString(R.string.mainActivityText1)) {
            materialTextView.text = getString(R.string.mainActivityText1)
            materialButton.text = getString(R.string.mainActivityText1)
            //materialCardView.setBackgroundColor(Color.parseColor("#e0f7fa"))
            materialButton.setBackgroundColor(Color.parseColor("#e0f7fa"))
        } else {
            materialTextView.text = getString(R.string.mainActivityText2)
            materialButton.text = getString(R.string.mainActivityText2)
            //materialCardView.setBackgroundColor(Color.parseColor("#d7ccc8"))
            materialButton.setBackgroundColor(Color.parseColor("#d7ccc8"))
        }
    }

    // Display Fragment on click Fragment button
    private fun displayFragment() {
        Log.d("Main Activity", "Display Fragment Button is clicked!")

        // Replace Fragment logic
        if (fragmentBtn == true) {
            Log.d("Fragment", "${fragmentBtn == true}")
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentTitle, titleFragment2)
            fragmentTransaction.commit()
            fragmentBtn = false
            materialButtonFragment.setBackgroundColor(Color.parseColor("#ffccbc"))
        } else {
            Log.d("Fragment", "${fragmentBtn == true}")
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentTitle, titleFragment)
            fragmentTransaction.commit()
            fragmentBtn = true
            materialButtonFragment.setBackgroundColor(Color.parseColor("#f0f4c3"))
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.materialButton -> {
                changeDisplayText()
            }
            R.id.materialButtonFragment -> {
                displayFragment()
            }
        }
    }
}
