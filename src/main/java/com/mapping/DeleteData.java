package com.mapping;

import com.Model.AccountDTO;
import com.Model.PersonDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeleteData {

    static Scanner sc = new Scanner(System.in);

    public static void deleteData() {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(PersonDTO.class).addAnnotatedClass(AccountDTO.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("ENTER VALID ID FOR DELETE DATA");
        int id = sc.nextInt();
        PersonDTO personDTO = session.load(PersonDTO.class, id);
        session.delete(personDTO);
        tx.commit();
        session.close();
        factory.close();
    }
}
