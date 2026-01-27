package ourbuisnessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "projects")
public class Project {


    /**
     * Create a project with a title and a description
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    @Column(nullable = false)
    public String title;

    @Column(length = 2000)
    public String description;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    @NotNull
    public Enterprise entreprise;

    public Enterprise getEnterprise() {
        return entreprise;
    }

    public void setEnterprise(Enterprise entreprise) {
        this.entreprise = entreprise;
    }

    public Project(String title, String description, Enterprise entreprise) {
        this.title = title;
        this.description = description;
        this.entreprise = entreprise;
    }

    public Project() {
        this.title = "rereere";
        this.description = "Project description";

    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }


    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}
