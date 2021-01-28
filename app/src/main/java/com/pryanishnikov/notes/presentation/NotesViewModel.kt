package com.pryanishnikov.notes.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.pryanishnikov.notes.data.NotesRepositoryImpl
import com.pryanishnikov.notes.presentation.ViewState

class NotesViewModel : ViewModel() {
    fun observeViewState(): LiveData<ViewState> = NotesRepositoryImpl.observeNotes()
        .map {
            if (it.isEmpty()) ViewState.EMPTY else ViewState.Value(it)
        }
}
