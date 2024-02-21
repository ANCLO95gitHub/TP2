package com.example.mytp2.ui.abacus
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.mytp2.databinding.FragmentAbacusBinding


class AbacusFragment : Fragment() {

        private var _binding: FragmentAbacusBinding? = null

        // This property is only valid between onCreateView and
        // onDestroyView.
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            val abacusViewModel =
                ViewModelProvider(this).get(AbacusViewModel::class.java)

            _binding = FragmentAbacusBinding.inflate(inflater, container, false)
            val root: View = binding.root

            val textView: TextView = binding.textViewAbacus
            abacusViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
            }
            return root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }