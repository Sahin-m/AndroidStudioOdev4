package com.example.androidstudioodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidstudioodev4.databinding.FragmentSayfaXXBinding

class sayfaXXFragment : Fragment() {
    private lateinit var tasarim : FragmentSayfaXXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXXBinding.inflate(inflater, container, false)

        tasarim.btnGitYFromX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaYFragment)
        }

        return tasarim.root
    }
}