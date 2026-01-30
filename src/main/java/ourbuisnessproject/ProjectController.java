package ourbuisnessproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/projects")
@RestController
public class ProjectController {
    @Autowired
    private EnterpriseProjectService enterpriseProjectService;

    public ProjectController(EnterpriseProjectService enterpriseProjectService){
        this.enterpriseProjectService = enterpriseProjectService;
    }

    @GetMapping
    public List<Project> findAllProjectsWithEnterprises(){
        return enterpriseProjectService.findAllProjects();
    }

}
