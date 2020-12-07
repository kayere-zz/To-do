package com.example.to_dolist.main_activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.to_dolist.db.Repository

class MAViewModel(private val repository: Repository) : ViewModel() {

}

class MAViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MAViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return MAViewModel(repository) as T
        }
        else throw IllegalArgumentException("Unknown view model class")
    }

}