package ourbuisnessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "enterprises")
public class Enterprise {
    /**
     * Create an Enterprise
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;
    @Size(min = 10, max = 100)
    @Column(nullable = false)
    private String description;
    @NotBlank
    @Column(nullable = false)
    private String contactName;
    @NotBlank
    @Email
    @Column(nullable = false)
    private String contactEmail;


    public Enterprise(String name, String description, String contactName, String contactEmail) {
        this.name = name;
        this.description = description;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    public Enterprise() {
        this.name = "Company & Co";
        this.description = "Comp description";
        this.contactName = "Company & Co";
        this.contactEmail = "Company & Co";
    }

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

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getContactName(){
        return contactName;
    }
    public void setId(Long id){
        this.id = id;
    }



}
