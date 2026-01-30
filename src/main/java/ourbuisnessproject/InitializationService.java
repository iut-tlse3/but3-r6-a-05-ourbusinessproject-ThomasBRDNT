package ourbuisnessproject;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializationService {
    private Project project1;
    private Project project2;
    private Project project3;
    private Enterprise enterprise1;
    private Enterprise enterprise2;
    @Autowired
    private EnterpriseProjectService enterpriseProjectService;

    @Transactional
    public void initProjects(){
        /*
         *On remarque qu'avec un projet ayant null commme titre, on obtient 0 projets initialisés, cela est du au fait
         *Qu'on a une balise transactional. Comme on a une erreur, il y a un rollback sur la méthode
         */
        this.enterprise1 = enterpriseProjectService.newEnterprise("entreprise1", "description1", "contact1", "email1@gygy.com");
        this.enterprise2 = enterpriseProjectService.newEnterprise("entreprise1", "description2", "contact2", "email2@dhdh.com");

        this.project1 = enterpriseProjectService.newProject("project1", "description1", this.enterprise1);
        this.project2 = enterpriseProjectService.newProject("project1", "description2", this.enterprise2);
        this.project3 = enterpriseProjectService.newProject("project1", "description3", this.enterprise1);
    }

    public Project getProject1E1(){
        return this.project1;
    }
    public Project getProject1E2(){
        return this.project2;
    }
    public Project getProject2E1(){
        return this.project3;
    }
    public Enterprise getEnterprise1(){
        return this.enterprise1;
    }

    public Enterprise getEnterprise2() {
        return enterprise2;
    }

}
