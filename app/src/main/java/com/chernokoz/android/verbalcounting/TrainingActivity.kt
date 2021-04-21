package com.chernokoz.android.verbalcounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chernokoz.android.verbalcounting.task.Task
import com.chernokoz.android.verbalcounting.utils.UserAns
import kotlinx.android.synthetic.main.activity_training.*

class TrainingActivity : AppCompatActivity() {
    private fun addAndUpdateUserRes(ans: UserAns, charToAdd: Char) {
        ans.currentAns += charToAdd
        updateUserRes(ans)
    }

    private fun updateUserRes(ans: UserAns) {
        userAns.text = when (ans.currentNeg) {
            false -> ans.currentAns
            true -> "-${ans.currentAns}"
        }
    }

    private fun drawTask(task: Task) {
        first.text = task.first.toString()
        second.text = task.second.toString()
        operation.text = task.operation.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)
        var userAns = UserAns("", false)
        var task = Task(50, '*', 2, 100)
        drawTask(task)
        button1.setOnClickListener {
            addAndUpdateUserRes(userAns, '1')
        }
        button2.setOnClickListener {
            addAndUpdateUserRes(userAns, '2')
        }
        button3.setOnClickListener {
            addAndUpdateUserRes(userAns, '3')
        }
        button4.setOnClickListener {
            addAndUpdateUserRes(userAns, '4')
        }
        button5.setOnClickListener {
            addAndUpdateUserRes(userAns, '5')
        }
        button6.setOnClickListener {
            addAndUpdateUserRes(userAns, '6')
        }
        button7.setOnClickListener {
            addAndUpdateUserRes(userAns, '7')
        }
        button8.setOnClickListener {
            addAndUpdateUserRes(userAns, '8')
        }
        button9.setOnClickListener {
            addAndUpdateUserRes(userAns, '9')
        }
        button0.setOnClickListener {
            addAndUpdateUserRes(userAns, '0')
        }
        button_neg.setOnClickListener {
            userAns.currentNeg = !userAns.currentNeg
            updateUserRes(userAns)
        }
        button_finish_task.setOnClickListener {
            task = Task(task.first + 1, task.operation, task.second, 102)
            drawTask(task)
            userAns = UserAns("", false)
            updateUserRes(userAns)
        }
        button_finish_battle.setOnClickListener {
            finish()
        }
    }
}