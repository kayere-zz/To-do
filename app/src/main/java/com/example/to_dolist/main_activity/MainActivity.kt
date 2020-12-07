package com.example.to_dolist

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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
    }
}