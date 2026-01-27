package ourbuisnessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Enterprise {
    /**
     * Create an Enterprise
     */
    @NotBlank
    private String name;
    @Size(min = 10, max = 100)
    private String description;
    @NotBlank
    private String contactName;
    @NotBlank
    @Email
    private String contactEmail;

    /**
     * set the name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * set the description
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * set the contact name
     * @param contactName
     */
    public void setContactName(String contactName){
        this.contactName = contactName;
    }

    /**
     * set the contact email
     * @param contactEmail
     */
    public void setContactEmail(String contactEmail){
        this.contactEmail = contactEmail;
    }



}
