package sda.hibernate.zadania.zadanie2;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.Film;

import java.util.List;

public class Zadanie2 {
    void createQueryById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createQuery("from Film where id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        System.out.println("createQuery: " + film);
    }

    void createNamedQueryById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNamedQuery("film.selectById", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        System.out.println("createNamedQuery: " + film);
    }

    void createNativeQueryById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNativeQuery("select * from film where id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        System.out.println("createNativeQuery: " + film);
    }

    void createQueryAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createQuery("from Film", Film.class).getResultList();
        session.close();
        for (Object o : list) {
            System.out.println(o);
        }
    }

    void createNamedQueryAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createNamedQuery("film.selectAll", Film.class).getResultList();
        session.close();
        for (Object o : list) {
            System.out.println(o);
        }
    }

    void createNativeQueryAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createNativeQuery("select * from film", Film.class).getResultList();
        session.close();
        for (Object o : list) {
            System.out.println(o);
        }
    }

    Film getFilmByNazwa(String nazwa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNamedQuery("film.selectByNazwa", Film.class).setParameter("nazwa", nazwa).getSingleResult();
        session.close();
        return film;
    }

    void getFilmByGatunek(String gatunek) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createNamedQuery("film.selectByGatunek", Film.class).setParameter("gatunek", gatunek).getResultList();
        session.close();
        for (Object o : list) {
            System.out.println(o);
        }
    }

    void getFilmByRezyser(String rezyser) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List list = session.createNamedQuery("film.selectByRezyser", Film.class).setParameter("rezyser", rezyser).getResultList();
        session.close();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
