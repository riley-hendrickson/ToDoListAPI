package todolist.project.demo.homepage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController 
{
    @RequestMapping("/")
    public String sayHi()
    {
        return "Hi! Welcome to the Home Page!";
    }
}
