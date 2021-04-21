package com.chernokoz.android.verbalcounting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        battle_button.setOnClickListener {
            val intent = Intent(this, BattleActivity::class.java)
            startActivityForResult(intent, 1)
        }
        train_button.setOnClickListener {
            val intent = Intent(this, TrainingActivity::class.java)
            startActivityForResult(intent, 2)
        }
        statistics_button.setOnClickListener {
            val intent = Intent(this, StatisticsActivity::class.java)
            startActivityForResult(intent, 3)
        }
        about_button.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivityForResult(intent, 4)
        }
        quit_button.setOnClickListener {
            finishAndRemoveTask()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> {
                val intent = Intent(this, BattleResultsActivity::class.java)
                startActivityForResult(intent, 11)
            }
            2 -> {
                val intent = Intent(this, TrainingResultsActivity::class.java)
                startActivityForResult(intent, 22)
            }
        }
    }
}