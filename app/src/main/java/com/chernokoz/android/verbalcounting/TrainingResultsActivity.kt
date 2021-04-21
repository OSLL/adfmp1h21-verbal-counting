package com.chernokoz.android.verbalcounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_training_results.*

class TrainingResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training_results)
        back_to_menu_button.setOnClickListener {
            finish()
        }
    }
}