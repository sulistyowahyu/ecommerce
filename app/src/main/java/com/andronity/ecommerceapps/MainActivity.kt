package com.andronity.ecommerceapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.andronity.ecommerceapps.Helper.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent()
    }

    private fun setContent() {
        val vpa = ViewPagerAdapter(supportFragmentManager)
        vpa.addFragment(SigninFragment(),"Sign In")
        vpa.addFragment(SignupFragment(), "Sign Up")
        viewPager.adapter = vpa
        tab.setupWithViewPager(viewPager)
    }

}
