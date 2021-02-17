package com.ekenya.android.flexipayapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_2, container, false)

        /* view.btnReg2.setOnClickListener {
             startActivity(Intent(activity,MobileActivity::class.java))
         }*/
        return view
    }





}