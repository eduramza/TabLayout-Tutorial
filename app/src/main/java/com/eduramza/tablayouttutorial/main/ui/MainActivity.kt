    package com.eduramza.tablayouttutorial.main.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eduramza.tablayouttutorial.R
import com.eduramza.tablayouttutorial.main.ui.adapter.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabs()
    }

    private fun setupTabs(){
        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(OneFragment.newInstance(), "Primeiro")
        adapter.addFragment(TwoFragment.newInstance(), "Segundo")
        adapter.addFragment(ThreeFragment.newInstance(), "Terceiro")
        viewPager.adapter = adapter
        my_tablayout.setupWithViewPager(viewPager)
    }
}