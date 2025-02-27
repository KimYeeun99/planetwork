package com.example.planetwork

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_writeletter.*
import kotlinx.android.synthetic.main.fragment_planet.*

class PlanetFragment : Fragment() {

    var count=0
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val extra = this.arguments
        if(extra != null) {
            count = extra.getInt("count")
        }
        return inflater.inflate(R.layout.fragment_planet, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tvFragmentPla.text = "$count"
    }

}

