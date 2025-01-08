package com.wakeupdev.todoapp.util

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.todoapp.R
import com.wakeupdev.todoapp.ui.theme.TodoAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksTopAppBar(
    openDrawer: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text("Todo") },
        navigationIcon = {
            IconButton(onClick = openDrawer) {
                Icon(Icons.Filled.Menu, stringResource(id = R.string.open_drawer))
            }
        },

        actions = {
            DropdownMenu(
                expanded = true,
                onDismissRequest = {  },
            ) {
                DropdownMenuItem(text = { Text("All") }, onClick = {})
            }
        },
        modifier = modifier.fillMaxWidth()
    )
}

@Preview
@Composable
private fun TasksTopAppBarPreview() {
    TodoAppTheme {
        Surface {
            TasksTopAppBar(openDrawer = {})
        }
    }
}