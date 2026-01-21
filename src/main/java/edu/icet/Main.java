package edu.icet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1);
        student.setName("Shanuu");
        student.setAge(19);

        Configuration config = new Configuration();
        config.addAnnotatedClass(edu.icet.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        session.persist(student);
    }
}