package com.Util;
import com.mapping.DeleteData;
import com.mapping.DisplayData;
import com.mapping.InsertData;
import com.mapping.UpdateData;

import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);

    public static void Operations() {

            boolean status = true;
            while (status) {
                System.out.println("1. ADD PERSON");
                System.out.println("2. UPDATE PERSON");
                System.out.println("3. DELETE PERSON");
                System.out.println("4. DISPLAY PERSON");
                System.out.println("5. EXIT APP");
                System.out.println("ENTER YOUR CHOICE ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        InsertData insert = new InsertData();
                        insert.InsertData();
                        break;
                    case 2:
                        UpdateData update = new UpdateData();
                        update.updateData();
                        break;
                    case 3:
                        DeleteData delete = new DeleteData();
                        delete.deleteData();
                        break;
                    case 4:
                        DisplayData display = new DisplayData();
                        display.displayData();
                        break;
                    case 5:
                        System.out.println("THANK YOU FOR VISITING OUR APP...!");
                        status = false;
                        break;
                    default:
                        System.out.println("INVALID CHOICE PLEASE SELECT CORRECT CHOICE...!");
                        break;
                }

        }

    }


    public static void main(String[] args) {
     Operations();
    }
}
