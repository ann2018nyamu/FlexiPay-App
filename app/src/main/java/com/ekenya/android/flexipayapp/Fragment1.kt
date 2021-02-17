package com.ekenya.android.flexipayapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment1 : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_1, container, false)
/*view.btnReg1.setOnClickListener {
    //navigate from fragment to activity
    startActivity(Intent(activity, MobileActivity::class.java))
}*/

        return view
    }
}