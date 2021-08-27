package ua.goit;

import ua.goit.utils.HibernateSessionFactory;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        

    }
}
