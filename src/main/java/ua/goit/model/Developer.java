package ua.goit.model;

import lombok.*;

import java.io.Serial;
import java.util.Set;
import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "projects")
@ToString(exclude = "projects")
@Entity
@Table(name = "developer")
public class Developer implements BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = 8740661570517301880L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 25, unique = true)
    private String name;

    @Column(name = "age", nullable = false, length = 2)
    private Integer age;

    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    
    @Column(name = "salary", nullable = false, length = 10)
    private Long salary;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "developer_skill",
            joinColumns = {@JoinColumn(name = "developer_id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id")})
    private Set<Skill> skills;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "project_developer",
            joinColumns = {@JoinColumn(name = "developer_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")})
    private Set<Project> projects;

}


