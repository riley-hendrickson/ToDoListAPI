package todolist.project.demo.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController 
{
    @Autowired // marks this member variable as needing dependency injection, so Spring will find the lone instance of TaskService and inject it here
    private TaskService taskService;

    @RequestMapping("/tasks")
    public List<Task> getTasks()
    {
        return taskService.getAllTasks();
    }
    @RequestMapping("tasks/{title}")
    public Task getTask(@PathVariable String title) // @PathVariable here tells spring that the path variable title is what we want to send through as an argument in our getTask call
    {
        return taskService.getTask(title);
    }

    @RequestMapping(method=RequestMethod.POST, value="/tasks")
    public void addTask(@RequestBody Task task) //@RequestBody here means that we are getting the task argument from the body of the request (in this case it's a post request)
    {
        taskService.addTask(task);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/tasks/{title}")
    public void updateTask(@RequestBody Task task, @PathVariable String title)
    {
        taskService.updateTask(task, title);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="tasks/{title}")
    public void deleteTask(@PathVariable String title) // @PathVariable here tells spring that the path variable title is what we want to send through as an argument in our getTask call
    {
        taskService.deleteTask(title);
    }
}
