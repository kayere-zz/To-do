package com.example.to_dolist.db

class Repository(private val dao: Dao) {
    fun getList() = dao.getList()

    suspend fun addItem(item: ToDo) = dao.addItem(item)

    suspend fun deleteItem(item: String) = dao.deleteItem(item)
}