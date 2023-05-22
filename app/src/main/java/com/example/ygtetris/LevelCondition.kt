package com.example.ygtetris

data class LevelCondition(
    val level: Int,
    val score: Int,
    val consecutiveThreeOrMoreLinesCleared: Int
)
