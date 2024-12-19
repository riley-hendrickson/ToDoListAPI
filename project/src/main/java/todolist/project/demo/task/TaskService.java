package todolist.project.demo.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TaskService 
{
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks()
    {
        List<Task> tasks = new ArrayList<>();
        taskRepository.findAll()
        .forEach(tasks :: add);
        return tasks;
    }

    // findById returns Optional<Task>, so we need to unwrap the task inside using .orElseThrow which returns the value if it's present, and throws an exception if it isn't
    public Task getTask(String title)
    {
       return taskRepository.findById(title)
       .orElseThrow(() -> new EntityNotFoundException("No task with the title " + title + "is present in the database"));
    }

    public void addTask(Task task)
    {
        taskRepository.save(task);
    }
    public void updateTask(Task task, String title)
    {
        taskRepository.save(task);
    }
    public void deleteTask(String title)
    {
        taskRepository.deleteById(title);
    }
}
