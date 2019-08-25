package sda.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "ksiegarnia", name = "film")
@NamedQueries({@NamedQuery(name = "film.selectById", query = "SELECT n FROM Film n where n.id=:id"), @NamedQuery(name = "film.selectByRokprodukcji", query = "SELECT n FROM Film n where n.rokprodukcji=:rokprodukcji")})
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter @Setter
    private Long id;
    @Column
    @Getter @Setter
    private String nazwa_filmu;
    @Column
    @Getter @Setter
    private String gatunek_filmu;
    @Column
    @Getter @Setter
    private String rezyser_filmu;
    @Column
    @Getter @Setter
    private Integer rokprodukcji;

    public Film() {
    }
}
