package com.example.onionnotes.service.interfaces

interface INoteService {


    fun addNote( title : String, message : String)


    fun deleteNote(id:Int)

    fun editNote(id: Int,title: String, message: String)

    fun showNote(id: Int)

}