package com.masai.taskmanagerapp.adapter

import com.masai.taskmanagerapp.models.Task

interface OnClickItem {
    //for edit the task
    fun onEditClicked(task: Task)
    //for delete the task
    fun onDeleteClicked(task: Task)
}