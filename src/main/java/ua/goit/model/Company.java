package ua.goit.model;

import java.io.Serial;
import java.util.Set;
import javax.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "project")
@ToString(exclude = "projects")
@Entity
@Table(name = "company")

public class Company implements BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = -231534582512388955L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "city")
    private String city;
    
    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Project> projects;
    
}
