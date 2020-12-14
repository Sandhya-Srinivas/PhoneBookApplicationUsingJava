package com.examples.challengeFour;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //greet
        String name = "UserName";
        System.out.println("Hello, " + name);
        int n = 4;

        IntForContacts contactsInterface = IntForContacts.getInstance();
        IntForMessages messagesInterface = IntForMessages.getInstance();

        do{
            System.out.println("\t1. Manage Contacts");
            System.out.println("\t2. Messages");
            System.out.println("\t3. Quit");
            n  = sc.nextInt();
            switch (n){
                case 1: contactsInterface.interfaceContacts();
                    break;
                case 2: messagesInterface.interfaceMessages();
                    break;
                case 3:
                    return;
            }

        }while(n<=3);
    }
}
