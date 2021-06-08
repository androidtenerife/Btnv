package com.bitnovo.seleccion.herbert.btnv.model

import android.os.Build
import android.support.annotation.RequiresApi
import android.util.Log
import kotlin.properties.Delegates

object Hotel {
    private var isEmpty by Delegates.notNull<Boolean>()
    private val windows = ArrayList<String>(63)
    private val statesOfWindows = ArrayList<String>()


    fun getStateOfWindows(): ArrayList<String> {
        val get_state_of_windows_array = windows

        return get_state_of_windows_array
    }

    fun amountOfWindowsAccordingToState(): ArrayList<String> {
        val amountOfWindowsArrayList = windows

        return amountOfWindowsArrayList
    }

    fun getWinners(): ArrayList<Int> {
        //Initialize the WinnersArraylist
        var winners_arraylist = ArrayList<Int>()
        // Make a counter to iterate in the array

        for (index in 0..63) {
            Log.d("Ventana", winners_arraylist.toString())
            // If the position -1 is closed and position+1 is closed too. the actual position is a winner
            if (index > 0 && windows[index].contains("A") &&
                windows[index - 1].contains('C') &&
                windows[index + 1].contains('C')
            ) {
                winners_arraylist.add(index)
            }
        }
        //Log.d("Ganadores", winners_arraylist.toString())
        return winners_arraylist
    }

    fun isEmptyHotel(): Boolean {
        var state = windows.isEmpty()
        return state
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun resetWindowsToOpenAll(): ArrayList<String> {
        // Log.d("Ventana", windows.toString())
        for (index in 0..63) {
            windows.set(index, "A")
        }

        return windows
    }

    fun populateWindows() {
        //To prepare the hotel windows opens
        for (index in 0..63) {
            windows.add(index, "A")
        }

    }

    fun fakeWinners() {
        //To check the correct function of the solution.
        windows.set(14, "C")
        windows.set(15, "A")
        windows.set(16, "C")
        windows.set(25, "C")
        windows.set(26, "A")
        windows.set(27, "C")
        windows.set(51, "C")
        windows.set(52, "A")
        windows.set(53, "C")
    }
}



