package com.example.onionnotes.service

import com.example.onionnotes.domain.interfaces.INoteRepository
import com.example.onionnotes.domain.Note
import com.example.onionnotes.service.interfaces.INoteService

class NoteService: INoteService {

    private lateinit var repo:INoteRepository

    fun NoteService(repository: INoteRepository){
        repo = repository
    }

    fun getNotes(): List<Note> {
        return repo.getNotes()
    }

    override fun addNote(id:Int,title: String, message: String) {

        Note(id, title, message).id = id
        Note(id, title, message).title = title
        Note(id, title, message).message =message



    }

    override fun deleteNote(id: Int) {
        TODO("Not yet implemented")
    }

    override fun editNote(id: Int, title: String, message: String) {
        TODO("Not yet implemented")
    }

    override fun showNote(id: Int) {
        TODO("Not yet implemented")
    }

}