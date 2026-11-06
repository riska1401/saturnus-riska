package com.example.saturnus_riska.Message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.saturnus_riska.R
import com.example.saturnus_riska.databinding.FragmentHomeBinding
import com.example.saturnus_riska.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://avatarapi.runflare.run/public/1","12.00"),
        MessageModel("Budi", "Sudah makan?", "https://avatarapi.runflare.run/public/2","12.45"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://avatarapi.runflare.run/public/3","12.30"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://avatarapi.runflare.run/public/4","Kemarin"),
        MessageModel("Eka", "Nice job kemarin!", "https://avatarapi.runflare.run/public/5","12.50"),
        MessageModel("Fajar", "Lagi ngapain?", "https://avatarapi.runflare.run/public/6","12.25"),
        MessageModel("Gita", "Boleh minta tolong?", "https://avatarapi.runflare.run/public/7","12.01"),
        MessageModel("Hana", "Lihat email ya", "https://avatarapi.runflare.run/public/8","12.02"),
        MessageModel("Irfan", "Oke noted", "https://avatarapi.runflare.run/public/9","12.03"),
        MessageModel("Joko", "Sampai jumpa besok", "https://avatarapi.runflare.run/public/10","12.04")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Message"
        }
        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItem.adapter = adapter
    }

}