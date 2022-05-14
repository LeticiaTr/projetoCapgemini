package model;
import java.util.Date;

public class Task {

	private int id;
	private int project;
	private String name;
	private String description;
	private String notes;
	private boolean isCompleted;
	private Date deadline;
	private Date createdAt;
	private Date updateAt;
	
	public Task(int id, int project, String name, String description, String notes, boolean isCompleted, Date deadline,
			Date createdAt, Date updateAt) {
		
		this.id = id;
		this.project = project;
		this.name = name;
		this.description = description;
		this.notes = notes;
		this.isCompleted = isCompleted;
		this.deadline = deadline;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", project=" + project + ", name=" + name + ", description=" + description
				+ ", notes=" + notes + ", isCompleted=" + isCompleted + ", deadline=" + deadline + ", createdAt="
				+ createdAt + ", updateAt=" + updateAt + "]";
	}
	
	
	
	
}
