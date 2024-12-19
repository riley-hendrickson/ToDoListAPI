package todolist.project.demo.task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository <Task, String> // generic is the entity class followed by the type of its primary key
{
    
}
