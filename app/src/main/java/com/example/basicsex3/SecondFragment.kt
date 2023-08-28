package com.example.basicsex3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.basicsex3.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        binding.personRecyclerview.adapter = PersonAdapter(listOf(
            Person(android.R.drawable.btn_star,"Antonio"),
            Person(android.R.drawable.ic_menu_report_image,"Claudia"),
            Person(android.R.drawable.ic_delete,"Veronica"),
            Person(android.R.drawable.arrow_down_float,"Vincenzo")
        ))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}