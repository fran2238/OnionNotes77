package com.example.onionnotes.infrastructure

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onionnotes.R
import com.example.onionnotes.domain.Note
import kotlinx.android.synthetic.main.layout_note_list_item.view.*

class NoteRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Note> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return  NoteViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.layout_note_list_item,parent,false)
       )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is NoteViewHolder -> {
                holder.link(items.get(position))
            }

        }
    }
    fun SubmitList (noteList:List<Note>){
        items = noteList
    }

    class NoteViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
      val  note_title = itemView.title
      val  note_content = itemView.note_content

        fun link(note: Note){
            note_title.setText(note.title)
            note_content.setText(note.message)
        }
    }
}