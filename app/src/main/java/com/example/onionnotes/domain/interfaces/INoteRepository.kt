package com.example.onionnotes.domain.interfaces

import com.example.onionnotes.domain.Note

interface INoteRepository {
    fun getNotes ():List<Note>
}