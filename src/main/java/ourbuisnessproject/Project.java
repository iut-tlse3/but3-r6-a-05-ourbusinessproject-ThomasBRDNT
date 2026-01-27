package ourbuisnessproject;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Project {
    @NotEmpty
    public String title;
    public String description;


    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
