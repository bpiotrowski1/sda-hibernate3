package sda.hibernate.zadania.zadanie2;

public class Main {
    public static void main(String[] args) {
        Zadanie2 zadanie2 = new Zadanie2();

        //1
        zadanie2.createQueryById(1);
        zadanie2.createNamedQueryById(1);
        zadanie2.createNativeQueryById(1);

        //2
        zadanie2.createQueryAll();
        zadanie2.createNamedQueryAll();
        zadanie2.createNativeQueryAll();

        //3
        System.out.println(zadanie2.getFilmByNazwa("Film1"));
        zadanie2.getFilmByGatunek("komedia");
        zadanie2.getFilmByRezyser("Rezyser2");
    }
}
