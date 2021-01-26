package com.pryanishnikov.notes.data

import com.pryanishnikov.notes.data.model.Note

object Repository {
    private val notes: List<Note>

    init {
        notes = listOf(
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),
            Note("Название", "текст", 0xfff06292.toInt()),

        )
    }

    fun getNotes(): List<Note> {
        return notes
    }
}