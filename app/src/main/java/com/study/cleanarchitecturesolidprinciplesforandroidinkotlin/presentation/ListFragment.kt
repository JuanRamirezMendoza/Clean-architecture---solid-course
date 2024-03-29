package com.study.cleanarchitecturesolidprinciplesforandroidinkotlin.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.study.cleanarchitecturesolidprinciplesforandroidinkotlin.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(i: LayoutInflater, c: ViewGroup?, b: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(i, c, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addNote.setOnClickListener {  v -> v.findNavController().navigate(ListFragmentDirections.actionGoToNote(0L)) }
    }
}