package com.example.studypal


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_stream_settings.*

/**
 * A simple [Fragment] subclass.
 */
class StreamSettingsFragment : Fragment(),View.OnClickListener {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        startStreamButton.setOnClickListener(this)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stream_settings, container, false)
    }
    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.startStreamButton -> navController.navigate(R.id.action_streamSettingsFragment_to_streamSessionFragment)

        }
    }
}
