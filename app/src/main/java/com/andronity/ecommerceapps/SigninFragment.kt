package com.andronity.ecommerceapps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.signup_layout.view.*

class SigninFragment : Fragment(){
    lateinit var views : View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        views = inflater.inflate(R.layout.signin_layout,container,false)
        setAction()
        return views
    }

    fun setAction(){

    }
}