package com.example.sealdstatemashine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), TransitionAction {
    val firstState by lazy { First( this,"Move to Second") }
    var currentState: State = firstState

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentState.firstAction()
        currentState.secondAction()
        currentState.thirdAction()
        currentState.fourthAction()
    }

    override fun firstAction() {
        currentState.firstAction()
    }

    override fun secondAction() {
        currentState.secondAction()
    }

    override fun thirdAction() {
        currentState.thirdAction()
    }

    override fun fourthAction() {
        currentState.fourthAction()
    }
}
