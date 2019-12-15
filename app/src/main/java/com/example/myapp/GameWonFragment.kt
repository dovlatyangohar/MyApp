package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapp.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameWonBinding>(
            inflater, R.layout.fragment_game_won, container, false
        )
        binding.gameWon = this


        binding.startAgainButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_gameWonFragment_to_gameStartFragment)
        }


        binding.shareButton.setOnClickListener {

        }
        return binding.root


    }

}
