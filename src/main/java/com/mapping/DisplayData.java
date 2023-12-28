package com.mapping;

import com.Model.AccountDTO;
import com.Model.PersonDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DisplayData {
    static Scanner sc=new Scanner(System.in);
    public static void displayData() {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(PersonDTO.class).addAnnotatedClass(AccountDTO.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("ENTER VALID ID FOR DISPLAY DATA");
        int id=sc.nextInt();
        PersonDTO personDTO=session.load(PersonDTO.class,id);
        System.out.println("USERNAME IS :"+personDTO.getUser_Name());
        System.out.println("PASSWORD IS :" +personDTO.getUser_Pass());

        System.out.println("FIRST NAME :"+personDTO.getPasswordDTO().getProfile_First_Name());
        System.out.println("LAST NAME :"+personDTO.getPasswordDTO().getGetProfile_Last_Name());
        System.out.println("EMAIL :"+personDTO.getPasswordDTO().getEmail());

        session.save(personDTO);
        tx.commit();
        session.close();
        factory.close();
    }

}
