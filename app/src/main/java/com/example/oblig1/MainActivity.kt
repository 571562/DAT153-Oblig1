package com.example.oblig1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun pressQuiz(view: View) {
        Intent (this, QuizActivity::class.java).also { startActivity(it) }


    }

    fun pressData(view : View) {
        Intent (this, DatabaseActivity::class.java).also { startActivity(it) }
    }
}
