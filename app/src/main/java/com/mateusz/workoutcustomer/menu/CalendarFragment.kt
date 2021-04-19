package com.mateusz.workoutcustomer.menu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mateusz.workoutcustomer.R

/**
 * class CalendarFragment only show layout R.layout.fragment_settings
 * @author Mateusz Karłowski
 */

class CalendarFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_history, null)
    }
}