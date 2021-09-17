package ua.goit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(exclude = "[project, skill]")
//@ToString(exclude = "[project, skill]")
@Entity
@Table(name = "developer")
public class Developer implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 8740661570517301880L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "age", nullable = false, length = 2)
    private Integer age;

    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    
    @Column(name = "salary", nullable = false, length = 10)
    private Long salary;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    
   @ManyToOne
   @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "developer_skill",
            joinColumns = @JoinColumn(name = "developer_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Skill skill;


}
