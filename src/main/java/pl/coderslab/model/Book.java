package pl.coderslab.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotBlank;



@Entity
@Data
@DynamicUpdate
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @Size(min = 2)
    private String title;
    private String description;

    private int rating;

    private boolean active;



    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", description=" + description
                + ", rating=" + rating + "]";
    }
}