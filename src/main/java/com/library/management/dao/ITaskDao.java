package com.library.management.dao;

import java.util.List;

import com.library.management.modal.Task;

public interface ITaskDao {
   List<Task> getAllTasks();
   List<Task> getAllTaskAssignedToUserId(int userID);
}
