package ua.goit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import java.io.Serial;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = -2162332907819959104L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "industry", nullable = true, length = 30)
    private String industry;

    @OneToOne(mappedBy= "customer", cascade = CascadeType.ALL)
    private Company company;

}
