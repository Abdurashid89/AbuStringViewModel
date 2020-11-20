package com.example.abustringviewmodel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.abustringviewmodel.App
import com.example.abustringviewmodel.MainActivity

class StringFragment : Fragment() {

    /**
     * Siz viewModel.text ga ediTextdan kelgan ma'lumotni berasiz
     * viewModel.getLiveData methodi esa sizga o'sha ma'lumotni qaytarib beradi.
     * ekran aylangan holatda ham ma'lumot o'chib ketmaydi, to activity o'lmaguncha
     * omad :)
     *
     * */


    lateinit var viewModel: MyStringViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProvider.AndroidViewModelFactory(App()).create(MyStringViewModel::class.java)
    }
}