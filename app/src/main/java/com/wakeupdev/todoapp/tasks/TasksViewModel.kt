package com.wakeupdev.todoapp.tasks

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.wakeupdev.todoapp.R
import com.wakeupdev.todoapp.data.Task
import com.wakeupdev.todoapp.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * UiState for the task list screen.
 */
data class TasksUiState(
    val items: List<Task> = emptyList(),
    val isLoading: Boolean = false,
    val filteringUiInfo: FilteringUiInfo = FilteringUiInfo(),
    val userMessage: Int? = null
)


@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
    saveInstance: SavedStateHandle
): ViewModel() {

}

// Used to save the current filtering in SavedStateHandle.
const val TASKS_FILTER_SAVED_STATE_KEY = "TASKS_FILTER_SAVED_STATE_KEY"

data class FilteringUiInfo(
    val currentFilteringLabel: Int = R.string.label_all,
    val noTasksLabel: Int = R.string.no_tasks_all,
    val noTaskIconRes: Int = R.drawable.logo_no_fill,
)