package com.example.onionnotes.infrastructure

import com.example.onionnotes.domain.interfaces.INoteRepository
import com.example.onionnotes.domain.Note

class NoteRepository:INoteRepository {
    override fun getNotes(): List<Note> {

        val list = ArrayList<Note>()

        list.add(
            Note(
                1,
                "Første Note",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris lacus leo, bibendum ac tellus ac, rutrum fermentum diam. Vivamus varius" +
                        " convallis tellus, et iaculis est congue sit amet. Ut molestie pretium urna vitae blandit. In aliquam risus in odio ullamcorper, eu placerat lorem molestie. Maecenas porttitor elementum erat, " +
                        "et consectetur tellus ornare eget. Etiam vulputate ultricies velit in tincidunt. Suspendisse lorem arcu, elementum eu condimentum ac, laoreet nec elit. Morbi eget turpis eu turpis tincidunt sagittis sit amet gravida"
            )

        )
        list.add(
            Note(
                2,
                "Anden Note",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris lacus leo, bibendum ac tellus ac, rutrum fermentum diam. Vivamus varius convallis tellus, et iaculis est congue sit amet. Ut molestie pretium urna vitae blandit." +
                    " In aliquam risus in odio ullamcorper, eu placerat lorem molestie. Maecenas porttitor elementum erat, et consectetur tellus ornare eget. Etiam vulputate ultricies velit in tincidunt."
            )
        )
        list.add(
            Note(
                3,
                "Tredje Note",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris lacus leo, bibendum ac tellus ac, rutrum fermentum diam. Vivamus varius convallis tellus, et iaculis est congue sit amet. Ut molestie pretium urna vitae blandit." +
                        "In aliquam risus in odio ullamcorper, eu placerat lorem molestie. Maecenas porttitor elementum erat, et consectetur tellus ornare eget. Etiam vulputate ultricies velit in tincidunt."
            )
        )
        list.add(
            Note(
            4,
            "fjerde Note",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris lacus leo, bibendum ac tellus ac, rutrum fermentum diam. Vivamus varius convallis tellus, et iaculis est congue sit amet." +
                    " Ut molestie pretium urna vitae blandit. In aliquam risus in odio ullamcorper, eu placerat"
        )
        )
        list.add(
            Note(
                5,
                "Femte Note",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris lacus leo, bibendum ac tellus ac, rutrum fermentum diam. Vivamus varius convallis tellus," +
                    " et iaculis est congue sit amet. Ut molestie pretium urna vitae blandit. In aliquam risus in odio ullamcorper, eu placerat"
            )
        )

        return list

    }


}