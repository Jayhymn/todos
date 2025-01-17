package com.wakeupdev.todoapp.tasks

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.wakeupdev.todoapp.R
import com.wakeupdev.todoapp.data.Task
import com.wakeupdev.todoapp.util.TasksTopAppBar

@Composable
fun TasksScreen(
    @StringRes userMessage: Int,
    onAddTask: () -> Unit,
    onTaskClick: (Task) -> Unit,
    onUserMessageDisplayed: () -> Unit,
    openDrawer: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: TasksViewModel = hiltViewModel(),
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }

) {
    Scaffold(
        modifier = modifier.fillMaxWidth(),
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            TasksTopAppBar(

            )
        },
        floatingActionButton = {
            SmallFloatingActionButton(onClick = onAddTask) {
                Icon(Icons.Filled.Add, stringResource(id = R.string.add_task))
            }
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            Text("All Tasks")
            LazyColumn {

            }
        }
    }
}