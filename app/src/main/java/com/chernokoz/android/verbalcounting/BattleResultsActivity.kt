package com.chernokoz.android.verbalcounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_battle_results.*

class BattleResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle_results)
        back_to_menu_button.setOnClickListener {
            finish()
        }
    }
}