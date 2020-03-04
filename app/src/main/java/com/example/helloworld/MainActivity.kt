package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set OnClickListener
        materialButton.setOnClickListener(this)
    }

    // Change Display Text function
    private fun changeDisplayText() {
        Log.d("Main Activity", "Hello World button is clicked!")
        if (materialTextView.text != getString(R.string.mainActivityText1)) {
            materialTextView.text = getString(R.string.mainActivityText1)
        } else {
            materialTextView.text = getString(R.string.mainActivityText2)
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.materialButton -> {
                changeDisplayText()
            }
        }
    }
}
