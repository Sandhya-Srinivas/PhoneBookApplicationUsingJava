package com.examples.challengeFour;

import java.util.Scanner;

public class IntForMessages extends MessagesApp{

    private static IntForMessages instance;
    public static synchronized IntForMessages getInstance(){
        if(instance == null){
            instance = new IntForMessages();
        }
        return instance;
    }

    public void interfaceMessages(){
        System.out.println("Your Message Box");
        int n = 3;
        do{
            System.out.println("\t\t1. See the list of all messages");
            System.out.println("\t\t2. Send a new message");
            System.out.println("\t\t3. Go back to the previous menu");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n){
                case 1: super.showMessages();
                    break;
                case 2:
                    System.out.println("Enter the name of the contact");
                    String name = sc.next();
                    super.sendMessage(name);
                    break;
                case 3:
                    return;
            }
        }while(n<3);

    }
}
