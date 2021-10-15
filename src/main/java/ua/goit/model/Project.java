package ua.goit.model;

import lombok.*;

import java.io.Serial;
import java.util.Set;
import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = ("[developer, company]"))
@Entity
@Table(name = "project")
public class Project implements BaseEntity<Long> {


    @Serial
    private static final long serialVersionUID = 2792179459006056880L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "cost", nullable = false, length = 10)
    private Long cost;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "customer_id", updatable = false)
    private Customer customer;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "project_developer",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "developer_id")})
    private Set<Developer> developers;


}
