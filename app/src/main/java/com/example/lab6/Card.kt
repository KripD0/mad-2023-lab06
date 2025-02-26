package com.example.lab6

import android.graphics.Bitmap

data class Card(

    val id: Int,
    val question: String,
    val example: String,
    val answer: String,
    val translation: String,
    val image: Bitmap? = null
)