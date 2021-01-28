package com.pryanishnikov.notes.presentation

import com.pryanishnikov.notes.data.Note

sealed class ViewState {
    data class Value(val notes: List<Note>) : ViewState()
    object EMPTY : ViewState()
}
