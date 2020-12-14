package com.examples.challengeFour;

import java.util.Scanner;

public class IntForContacts extends ContactsApp{

    private static IntForContacts instance;
    public static synchronized IntForContacts getInstance(){
        if(instance == null){
            instance = new IntForContacts();
        }
        return instance;
    }


    public void interfaceContacts(){
        System.out.println("Your Phone Book");
        int n = 5;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\t\t1. Show all contacts");
            System.out.println("\t\t2. Add a new contact");
            System.out.println("\t\t3. Search for a contact");
            System.out.println("\t\t4. Delete a contact");
            System.out.println("\t\t5. Go back to the previous menu");
            n = sc.nextInt();
            switch (n){
                case 1:     super.showContacts();
                    break;
                case 2:
                    System.out.println("Enter the name of the contact");
                    String name = sc.next();
                    System.out.println("Enter the phone number");
                    int num = sc.nextInt();
                    super.addContact(new IndContact(name, num));
                    break;
                case 3:
                    System.out.println("Enter name");
                    String nameSrch = sc.next();
                    super.searchPhone(nameSrch);
                    break;
                case 4:
                    System.out.println("Enter name");
                    String nameDel = sc.next();
                    super.deletePhone(nameDel);
                    break;
                case 5:
                    return;
            }
        }while(n<5);

    }
}
