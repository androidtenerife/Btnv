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

    fun allowNewStyFourVisitors() {
// Starting to Visit to the hotel
        for (indexVisitor in 1..64) {
            for (indexWindows in 0..63) {
                if (indexVisitor == 1) {
                    //Open the left window
                    windows.set(indexWindows, "I")
                }
                // Visitor #2
                if (indexVisitor == 2 && indexWindows.rem(2) == 0) {
                    //Open the left window
                    windows.set(indexWindows, "D")
                }
                // Visitor #3
                if (indexVisitor == 3 && windows[indexWindows].contains("D") && indexWindows.rem(3) == 0) {
                    //Open the left window
                    windows.set(indexWindows, "I")
                }
                // Visitor #4
                if (indexVisitor == 4 && (windows[indexWindows].contains("C")
                            || windows[indexWindows].contains("I")
                            || windows[indexWindows].contains("A")) && indexWindows.rem(4) == 0
                ) {
                    //Open the right window
                    windows.set(indexWindows, "D")
                }
                // Visitor #5 to 64
                if (indexVisitor > 4 && (windows[indexWindows].contains("C"))) {
                    //Open the left window
                    windows.set(indexWindows, "D")
                }
                // Visitor #5 to 64
                if (indexVisitor > 4 && (windows[indexWindows].contains("A"))) {
                    //Open the left window
                    windows.set(indexWindows, "I")
                }
                // Visitor #5 to 64
                if (indexVisitor > 4 && (windows[indexWindows].contains("I"))) {
                    //Open the left window
                    windows.set(indexWindows, "A")
                }
                // Visitor #5 to 64
                if (indexVisitor > 4 && (windows[indexWindows].contains("D"))) {
                    //Open the left window
                    windows.set(indexWindows, "C")
                }
            }
        }
    }

    fun amountOfWindowsAccordingToState(): ArrayList<Int> {
        // The order in the array is the same of Position 0 to 3 respectively C-A-I-O
        val amountOfWindowsArrayList = ArrayList<Int>()
        var state_C: Int = 0
        var state_A: Int = 0
        var state_I: Int = 0
        var state_D: Int = 0
        // Iterate on Hotel array windows
        for (index in 0..63) {
            if (windows[index].contentEquals("C")) {
                state_C++
            }
            if (windows[index].contentEquals("A")) {
                state_A++
            }
            if (windows[index].contentEquals("I")) {
                state_I++
            }
            if (windows[index].contentEquals("D")) {
                state_D++
            }
        }
        Log.d("Amount Of C", state_C.toString())
        Log.d("Amount Of A", state_A.toString())
        Log.d("Amount Of I", state_I.toString())
        Log.d("Amount Of D", state_D.toString())
        amountOfWindowsArrayList.add(0, state_C)
        amountOfWindowsArrayList.add(1, state_A)
        amountOfWindowsArrayList.add(2, state_I)
        amountOfWindowsArrayList.add(3, state_D)
        return amountOfWindowsArrayList
    }

    fun getWinners(): ArrayList<Int> {
        //Initialize the WinnersArraylist
        var winners_arraylist = ArrayList<Int>()
        // Make a counter to iterate in the array

        for (index in 0..63) {
            Log.d("Ventana", winners_arraylist.toString())
            // If the position -1 is closed and position+1 is closed too. the actual position is a winner
            if (index == 0 && windows[index].contains("A")) {
                winners_arraylist.add(index + 1)
            }
            if (index > 0 && index < 63 && windows[index].contains("A") &&
                windows[index - 1].contains('C') &&
                windows[index + 1].contains('C')
            ) {
                winners_arraylist.add(index + 1)
            }
            if (index == 63 && (windows[index].contains('A'))) {
                winners_arraylist.add(index + 1)
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



