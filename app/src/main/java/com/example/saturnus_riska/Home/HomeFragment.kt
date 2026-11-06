package com.example.saturnus_riska.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.saturnus_riska.Home.pertemuan_4.FourthActivity
import com.example.saturnus_riska.Home.pertemuan_5.FifthActivity
import com.example.saturnus_riska.Home.pertemuan_7.SeventhActivity
import com.example.saturnus_riska.R
import com.example.saturnus_riska.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Home"
        }
        binding.btnPertemuan4.setOnClickListener {
            val intent = Intent(requireContext(), FourthActivity::class.java)

            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }
        binding.btnPertemuan5.setOnClickListener {
            val intent = Intent(requireContext(), FifthActivity::class.java)
            startActivity(intent)
        }
        binding.btnPertemuan7.setOnClickListener {
            val intent = Intent(requireContext(), SeventhActivity::class.java)
            startActivity(intent)
        }
    }

}