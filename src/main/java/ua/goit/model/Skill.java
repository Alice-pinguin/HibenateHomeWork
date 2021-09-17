package ua.goit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skill")
public class Skill implements Serializable, BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = 459598425491374756L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "language", nullable = false, length = 15)
    private String language;

    @Column(name = "level", nullable = false, length = 6)
    private String level;

    @ManyToOne
    @JoinColumn(name = "developer_id")
   private Developer developer;



}
