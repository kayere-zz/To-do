package com.example.to_dolist.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDo(
        @PrimaryKey
        val content: String
)