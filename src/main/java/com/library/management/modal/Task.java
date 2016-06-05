package com.library.management.modal;

import java.util.Date;

import com.library.management.enums.TASKTYPE;

public class Task {

	private int taskId;
	private TASKTYPE taskType;
	private String taskDescription;
	private int assignedUserId;
	private Date createdDate;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public TASKTYPE getTaskType() {
		return taskType;
	}

	public void setTaskType(TASKTYPE taskType) {
		this.taskType = taskType;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public int getAssignedUserId() {
		return assignedUserId;
	}

	public void setAssignedUserId(int assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
