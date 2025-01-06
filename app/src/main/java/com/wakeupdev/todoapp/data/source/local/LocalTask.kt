package com.wakeupdev.todoapp.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "task"
)
data class LocalTask(
    @PrimaryKey val id: String,
    var title: String,
    var description: String,
    var isCompleted: Boolean,
)