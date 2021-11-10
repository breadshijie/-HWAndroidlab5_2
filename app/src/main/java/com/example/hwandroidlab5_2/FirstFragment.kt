package com.example.hwandroidlab5_2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(){
    override fun onCreate(savedInstanceState:Bundle ?){
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment","onCreate")
    }
    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?,
    savedInstanceState: Bundle ?): View?{
        Log.e("FristFragment","onCreate")
        return inflater.inflate(R.layout.fragment_first, container ,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle ?){
        super.onActivityCreated(savedInstanceState)
        Log.e("FirstFragment","onActivityCreated")
    }
     override fun onStart(){
         super.onStart()
         Log.e("FristFragment","onStart")
     }

    override fun onResume(){
        super.onResume()
        Log.e("FristFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FristFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FristFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FristFragment","onDstroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FristFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("FristFragment","onDetach")
    }
}