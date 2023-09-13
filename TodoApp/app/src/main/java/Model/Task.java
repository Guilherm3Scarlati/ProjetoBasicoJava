
package Model;

import java.util.Date;


public class Task {
    private int id;
    private int id_project;
    private String name;
    private String description;
    private String notes;
    private boolean is_completed;
    private Date deadline;
    private Date created_at;
    private Date updated_at;

    public Task(int id, int id_project, String name, String description, String notes, boolean is_completed, Date deadline, Date created_at, Date updated_at) {
        this.id = id;
        this.id_project = id_project;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.is_completed = is_completed;
        this.deadline = deadline;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public Task(){
        this.created_at = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
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

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", id_project=" + id_project + ", name=" + name + ", description=" + description + ", notes=" + notes + ", is_completed=" + is_completed + ", deadline=" + deadline + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

    
    
}
