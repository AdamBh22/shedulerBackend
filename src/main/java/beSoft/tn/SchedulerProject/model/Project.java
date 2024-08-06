package beSoft.tn.SchedulerProject.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Project {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    private List<Task> tasks;
    @JsonManagedReference
    @OneToOne
    private AppUser owner;
}
