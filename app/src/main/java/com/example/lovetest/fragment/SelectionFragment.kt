package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.lovetest.R

/**
 * A simple [Fragment] subclass.
 */
class SelectionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, avedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_selection, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val option1 : TextView = view.findViewById(R.id.option_1)
        val option2 : TextView = view.findViewById(R.id.option_2)
        val option3 : TextView = view.findViewById(R.id.option_3)
        val option4 : TextView = view.findViewById(R.id.option_4)

        val btnBack : ImageView = view.findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            val fragment = QuestionFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }

    }


}