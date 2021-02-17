package com.ekenya.android.flexipayapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


public class Fragment3 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view: View = inflater.inflate(R.layout.fragment_3, container, false)

        /* view.btnReg.setOnClickListener {
             startActivity(Intent(activity,MobileActivity::class.java))
         }*/
        return view
    }


}