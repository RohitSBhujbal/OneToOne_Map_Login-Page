package com.mapping;

import com.Model.AccountDTO;
import com.Model.PersonDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class InsertData {
    static Scanner sc=new Scanner(System.in);

    public static void InsertData() {

        System.out.println("COUNT FOR INSERT DATA");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            Configuration cfg = new Configuration().configure().addAnnotatedClass(PersonDTO.class).addAnnotatedClass(AccountDTO.class);
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            System.out.println("ENTER PERSON USER_NAME");
            String user_Name = sc.next();
            System.out.println("ENTER PERSON USER_PASSWORD");
            long user_Pass = sc.nextLong();
            System.out.println("ENTER PERSON FIRST_NAME");
            String first_Name = sc.next();
            System.out.println("ENTER PERSON LAST_NAME");
            String last_Name = sc.next();
            System.out.println("ENTER PERSON EMAIL");
            String email = sc.next();


            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setProfile_First_Name(first_Name);
            accountDTO.setGetProfile_Last_Name(last_Name);
            accountDTO.setEmail(email);

            PersonDTO personDTO = new PersonDTO();
            personDTO.setUser_Name(user_Name);
            personDTO.setUser_Pass(user_Pass);
            personDTO.setAccountDTO(accountDTO);


            session.save(personDTO);
            tx.commit();
        }
    }

}
