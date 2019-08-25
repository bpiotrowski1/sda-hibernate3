package sda.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "ksiegarnia", name = "uzytkownik")
@NamedQueries({@NamedQuery(name = "uzytkownik.select",query = "SELECT n FROM Uzytkownik n where n.id=:id")})
public class Uzytkownik {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  @Getter @Setter
  private Long id;
  @Column
  @Getter @Setter
  private String imie;
  @Column
  @Getter @Setter
  private String nazwisko;

  public Uzytkownik() {
  }
}
