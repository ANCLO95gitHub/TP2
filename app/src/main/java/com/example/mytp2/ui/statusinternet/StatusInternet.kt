package com.example.mytp2.ui.statusinternet
import android.content.Context.WIFI_SERVICE
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mytp2.R
import com.example.mytp2.databinding.AppBarMainBinding
import com.example.mytp2.databinding.ActivityMainBinding
//import com.example.mytp2.databinding.FragmentHomeBinding
//import com.example.mytp2.ui.home.HomeViewModel
import com.example.mytp2.databinding.FragmentStatusinternetBinding
import com.example.mytp2.ui.statusinternet.StatusInternetViewModel

//import com.example.mytp2.ui.statusinternet.StatusInternetViewModel

class StatusInternet : Fragment() {

    //private var _binding: FragmentStatusInternetBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = _binding!!
    //WifiManager wifiManager;
    //var wifiManager = WifiManager()
    lateinit var binding:FragmentStatusinternetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val homeViewModel =
        //    ViewModelProvider(this).get(StatusInternetViewModel::class.java)
        //_binding = FragmentStatusInternetBinding.inflate(inflater, container, false)
        //val root: View = binding.root
        val root = inflater.inflate(R.layout.fragment_statusinternet,container, false)
        val bStatusI =root.findViewById<Button>(R.id.bStatusInternet)
        bStatusI.setOnClickListener(){
            bStatusI.setText("asdf")
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
                val intent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(intent,1)
            }
        }

        /*val textView: TextView = binding.textHome
        StatusInternetViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        binding = FragmentStatusinternetBinding.inflate(layoutInflater)

        //setContentView(binding.root)

        binding.bStatusInternet.setOnClickListener(View.OnClickListener {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
                val intent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(intent,1)
            }else{
                //val applicationContext
                //val wifiManager = applicationContext.getSystemService(WIFI_SERVICE)as WifiManager
                //wifiManager.setWifiEnabled(true)
            }
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //_binding = null
    }
}
/*
class StatusInternet : Fragment() {

    private var _binding: FragmentStatusinternetBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val StatusInternetViewModel =
            ViewModelProvider(this).get(StatusInternetViewModel::class.java)

        _binding = FragmentStatusinternetBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textViewStatusInternet
        StatusInternetViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}*/