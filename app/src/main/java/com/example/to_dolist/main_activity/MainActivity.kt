package com.example.to_dolist.main_activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.to_dolist.R
import com.example.to_dolist.db.ListDatabase
import com.example.to_dolist.db.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val vm: MAViewModel by viewModels { MAViewModelFactory(initDb()) }

    private fun initDb(): Repository {
        val db = ListDatabase.getDatabase(this)
        return Repository(db.Dao())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setView(R.layout.dialog)
                setPositiveButton("Ok") { _, _ ->

                }
                setNegativeButton("Cancel") { _, _ ->

                }
                setCancelable(false)
                create()
                show()
            }
        }

        val helper = ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                TODO("Not yet implemented")
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                TODO("Not yet implemented")
            }

        })

        helper.attachToRecyclerView(todoList)
    }
}