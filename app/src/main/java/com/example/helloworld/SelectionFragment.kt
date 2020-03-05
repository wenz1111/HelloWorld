package com.example.helloworld

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_selection.view.*

/**
 * A simple [Fragment] subclass.
 */
class SelectionFragment : Fragment(), View.OnClickListener{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Initialize current view fragment
        val view : View = inflater.inflate(R.layout.fragment_selection, container, false)

        // Initialize button reference
        val fragBtn1 : Button = view.findViewById(R.id.fragmentLayoutBtn1)

        // Set Button On Click Listener
        fragBtn1.setOnClickListener(this)
        view.fragmentLayoutBtn2.setOnClickListener { Log.d("Second Activity Fragment", "Nexus 6P Button is Clicked!") }

        // Inflate the layout for this fragment
        return view
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.fragmentLayoutBtn1 -> {
                Log.d("Second Activity Fragment", "Pixel 4XL Button is Clicked!")
            }
        }
    }
}
