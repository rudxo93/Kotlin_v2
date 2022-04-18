package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.example.lovetest.R

/**
 * A simple [Fragment] subclass.
 */
class QuestionFragment : Fragment()/*, View.OnClickListener*/ {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val view  = inflater.inflate(R.layout.fragment_question, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext : ImageView = view.findViewById(R.id.btn_next)
        btnNext.setOnClickListener {
            val fragment = SelectionFragment() // navigate to next
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
    }


}