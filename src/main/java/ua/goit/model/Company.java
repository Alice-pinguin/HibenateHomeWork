package ua.goit.model;

import java.io.Serial;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "projects")
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

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "city", nullable = true, length = 25)
    private String city;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Project> projects;



}
