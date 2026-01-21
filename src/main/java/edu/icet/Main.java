package edu.icet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(2);
        student.setName("Qwerty");
        student.setAge(50);

        Configuration config = new Configuration();
        config.addAnnotatedClass(edu.icet.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();


    }
}