package todolist.project.demo.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // marks this class for JPA as a class that will represent entries in our database
public class Task
{
    @Id // marks the following variable as the primary key in our database
    private String title;
    private String description;
    private String completeBy;

    public Task()
    {

    }
    public Task(String newTitle, String newDescription, String newCompleteBy)
    {
        this.title = newTitle;
        this.description = newDescription;
        this.completeBy = newCompleteBy;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setDescription(String newDescription)
    {
        this.description = newDescription;
    }
    public String getCompleteBy()
    {
        return this.completeBy;
    }
    public void setCompleteBy(String newCompleteBy)
    {
        this.completeBy = newCompleteBy;
    }
}
