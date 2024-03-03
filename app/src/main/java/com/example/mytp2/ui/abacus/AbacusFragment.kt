package com.example.mytp2.ui.abacus
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.mytp2.R
import com.example.mytp2.databinding.FragmentAbacusBinding
import com.example.mytp2.databinding.FragmentStatusinternetBinding

class AbacusFragment : Fragment() {

        //private var _binding: FragmentAbacusBinding? = null

        // This property is only valid between onCreateView and
        // onDestroyView.
        //private val binding get() = _binding!!
        lateinit var binding:FragmentAbacusBinding

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            val abacusViewModel =
                ViewModelProvider(this).get(AbacusViewModel::class.java)
            //setContentView(R.layout.activity_main)
            //_binding = FragmentAbacusBinding.inflate(inflater, container, false)
            //val root: View = binding.root
            val root = inflater.inflate(com.example.mytp2.R.layout.fragment_abacus,container, false)

            //val textView: TextView = binding.textViewAbacus
            val textView = root.findViewById<TextView>(com.example.mytp2.R.id.textViewAbacus)
            textView.setText("asdf")
            /*sabacusViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
            }*/

            //val root = inflater.inflate(R.layout.fragment_abacus,container, false)
            //val skseekBar2: SeekBar = binding.seekBar2
            //binding = FragmentAbacusBinding.inflate(layoutInflater)
            val skseekBar2 = root.findViewById<SeekBar>(com.example.mytp2.R.id.seekBar2)
            val tvValeurA = root.findViewById<TextView>(com.example.mytp2.R.id.tvValeurA)
            skseekBar2?.setOnSeekBarChangeListener(object :
                SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seek: SeekBar,
                                               progress: Int, fromUser: Boolean) {
                    // write custom code for progress is changed
                    textView.setText("skseekBar2  changed" + progress)
                    if(progress < 1){
                        skseekBar2.setProgress(1)
                    }
                    tvValeurA.setText("Valeur: " + progress)
                }

                override fun onStartTrackingTouch(seek: SeekBar) {
                    // write custom code for progress is started
                }

                override fun onStopTrackingTouch(seek: SeekBar) {
                    // write custom code for progress is stopped  this@MainActivity   this@AbacusFragment
                    //Toast.makeText(requireContext(),3, 5).show()
                    Toast.makeText(requireContext(),
                        "Progress is: " + seek.progress + "%",
                        Toast.LENGTH_SHORT).show()
                }
            })
            // Abacus B
            val skseekBarB = root.findViewById<SeekBar>(com.example.mytp2.R.id.seekBarB)
            val tvValeurB = root.findViewById<TextView>(com.example.mytp2.R.id.tvValeurB)
            skseekBarB?.setOnSeekBarChangeListener(object :
                SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seek: SeekBar,
                                               progress: Int, fromUser: Boolean) {
                    // write custom code for progress is changed
                    textView.setText("skseekBarB  changed" + progress)
                    if(progress < 2){
                        skseekBarB.setProgress(2)
                    }
                    tvValeurB.setText("Valeur: " + progress)
                }

                override fun onStartTrackingTouch(seek: SeekBar) {
                    // write custom code for progress is started
                }

                override fun onStopTrackingTouch(seek: SeekBar) {
                    // write custom code for progress is stopped  this@MainActivity   this@AbacusFragment
                    //Toast.makeText(requireContext(),3, 5).show()
                    Toast.makeText(requireContext(),
                        "Progress B is: " + seek.progress + "%",
                        Toast.LENGTH_SHORT).show()
                }
            })
            val aba1 = (skseekBar2.progress + skseekBarB.progress ).toString()
            textView.setText( aba1 )
            //textView.setText(skseekBar2.progress + skseekBarB.progress)
            return root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            //_binding = null
        }
    }