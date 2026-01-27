package ourbuisnessproject;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Project {
    /**
     * Create a project with a title and a description
     */
    @NotEmpty
    public String title;
    public String description;

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
