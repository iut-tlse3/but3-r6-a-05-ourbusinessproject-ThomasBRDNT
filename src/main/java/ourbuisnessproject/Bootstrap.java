package ourbuisnessproject;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Bootstrap {

    @Autowired
    private InitializationService initializationService;

    public Bootstrap(InitializationService initializationService){
        this.initializationService = initializationService;
    }
    @PostConstruct
    public void init(){
        try {
            initializationService.initProjects();
        }catch (RuntimeException re){};
    }

    public InitializationService getInitializationService() {
        return initializationService;
    }
}
