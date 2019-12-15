package com.example.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapp.databinding.FragmentGameStartBinding
import java.util.*


class GameStartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameStartBinding>(
            inflater, R.layout.fragment_game_start, container, false
        )
        binding.gameStart = this
        val enteredNumber = binding.enterNumberEditText.toString()

        if (enteredNumber.isNotEmpty()) {
            binding.generateButton.isEnabled = true
            binding.generateButton.setOnClickListener { view: View ->

                val generatedNumber = getRandomNumber()
                if (enteredNumber == generatedNumber) {

                    view.findNavController()
                        .navigate(R.id.action_gameStartFragment_to_gameWonFragment)
                } else view.findNavController()
                    .navigate(R.id.action_gameStartFragment_to_gameOverFragment)
            }
        }




        return binding.root
    }


    private fun getRandomNumber(): String {
        return Random().nextInt().toString()

    }
}
