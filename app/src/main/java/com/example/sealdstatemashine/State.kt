package com.example.sealdstatemashine

import android.content.Context
import android.util.Log

sealed class State : TransitionAction {
    override fun firstAction() {
    }

    override fun secondAction() {
    }

    override fun thirdAction() {
    }

    override fun fourthAction() {
    }
}

class First(val context: Context, val firstVal: Any) : State() {
    override fun firstAction() {
        Log.d("STATE", firstVal as String)
        (context as MainActivity).currentState = Second(context, "Move to Tird")
    }
}

class Second(val context: Context, val secondVal: Any) : State() {
    override fun secondAction() {
        Log.d("STATE", secondVal as String)
        (context as MainActivity).currentState = Third(context, "Move to Fourth")
    }

}

class Third(val context: Context, val thirdVal: Any) : State() {
    override fun thirdAction() {
        Log.d("STATE ", thirdVal as String)
        (context as MainActivity).currentState = Fourth(context)
    }
}

class Fourth(val context: Context) : State() {
    override fun fourthAction() {
        Log.d("STATE", "Go to first state")
        (context as MainActivity).currentState = First(context, "Go to first state")
    }
}