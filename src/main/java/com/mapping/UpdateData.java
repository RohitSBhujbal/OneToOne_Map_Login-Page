package com.mapping;

import com.Model.AccountDTO;
import com.Model.PersonDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UpdateData {

    static Scanner sc=new Scanner(System.in);
    public static void updateData(){
        Configuration cfg=new Configuration().configure().addAnnotatedClass(PersonDTO.class).addAnnotatedClass(AccountDTO.class);
        SessionFactory factory =cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        System.out.println("ENTER VALID ID FOR UPDATE DATA");
        int id=sc.nextInt();
        PersonDTO personDTO=session.load(PersonDTO.class,id);
        System.out.println("ENTER USER_PASSWORD FOR UPDATING RECORDS");
        long pass=sc.nextLong();
        System.out.println("ENTER EMAIL FOR UPDATING RECORDS");
        String email=sc.next();

        personDTO.setUser_Pass(pass);
        personDTO.getPasswordDTO().setEmail(email);

        session.update(personDTO);
        tx.commit();
        factory.close();
        session.close();


    }
}
