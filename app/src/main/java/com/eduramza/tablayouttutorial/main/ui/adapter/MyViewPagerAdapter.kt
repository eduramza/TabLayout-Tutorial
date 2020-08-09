package com.eduramza.tablayouttutorial.main.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

//1
class MyViewPagerAdapter (fm: FragmentManager)
//2
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    //3
    private val fragmentList = ArrayList<Fragment>()
    private val titleList = ArrayList<String>()

    //4
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount() = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    //5
    fun addFragment(fragment: Fragment, title: String){
        fragmentList.add(fragment)
        titleList.add(title)
    }

}