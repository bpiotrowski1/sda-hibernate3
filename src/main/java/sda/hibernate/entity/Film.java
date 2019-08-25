package sda.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "ksiegarnia", name = "film")
@NamedQueries({@NamedQuery(name = "film.selectById", query = "SELECT n FROM Film n where n.id=:id"),
        @NamedQuery(name = "film.selectByRokprodukcji", query = "SELECT n FROM Film n where n.rokprodukcji=:rokprodukcji"),
        @NamedQuery(name = "film.selectAll", query = "SELECT n FROM Film n"),
        @NamedQuery(name = "film.selectByNazwa", query = "SELECT n FROM Film n where n.nazwa_filmu=:nazwa"),
        @NamedQuery(name = "film.selectByGatunek", query = "SELECT n FROM Film n where n.gatunek_filmu=:gatunek"),
        @NamedQuery(name = "film.selectByRezyser", query =  "SELECT n FROM Film n where n.rezyser_filmu=:rezyser")})
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter @Setter
    private Integer id;
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

    @Override
    public String toString() {
        return "id=" + id +
                ", nazwa_filmu='" + nazwa_filmu + '\'' +
                ", gatunek_filmu='" + gatunek_filmu + '\'' +
                ", rezyser_filmu='" + rezyser_filmu + '\'' +
                ", rokprodukcji=" + rokprodukcji;
    }
}
