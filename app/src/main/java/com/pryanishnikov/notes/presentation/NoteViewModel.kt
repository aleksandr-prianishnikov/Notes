package com.pryanishnikov.notes.presentation

import androidx.lifecycle.ViewModel
import com.pryanishnikov.notes.data.NotesRepositoryImpl
import com.pryanishnikov.notes.data.Note

class NoteViewModel(var note: Note?) : ViewModel() {

    fun updateNote(text: String) {
        note = (note ?: generateNote()).copy(note = text)
    }

    fun updateTitle(text: String) {
        note = (note ?: generateNote()).copy(title = text)
    }

    override fun onCleared() {
        super.onCleared()

        note?.let {
            NotesRepositoryImpl.addOrReplaceNote(it)
        }
    }

    private fun generateNote(): Note {
        return Note()
    }
}

