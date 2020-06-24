package com.example.onionnotes.infrastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onionnotes.R
import com.example.onionnotes.domain.Note
import com.example.onionnotes.service.NoteService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var noteAdapter: NoteRecyclerAdapter
    private var noteRepository: NoteRepository = NoteRepository()
    private  var ns: NoteService = NoteService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecylerView()
        getNotes()
    }

    private fun getNotes() {
        val data = get_notes()
        noteAdapter.SubmitList(data)
    }

    private fun initRecylerView() {
        note_recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            noteAdapter = NoteRecyclerAdapter()
            adapter = noteAdapter

        }
    }
    private fun addNote(id:Int,t:String,content : String){
        ns.addNote(id,t,content)
    }
    private fun delete(id : Int){
        ns.deleteNote(id)
    }
    private fun edditNote(id:Int,t:String, content: String){
        ns.editNote(id,t,content)
    }
    private fun findNote(id: Int){
        ns.showNote(id)
    }
    private fun get_notes(): List<Note> {
        return noteRepository.getNotes()
    }
}

