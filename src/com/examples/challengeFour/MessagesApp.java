package com.examples.challengeFour;

import java.util.Scanner;

public class MessagesApp extends ContactsApp {

    static void showMessages(){
        if(contactList.size() == 0){
            System.out.println("Awww. Your messages list is empty. Add some contacts\n");
        }
        else{
            System.out.println("Your message list:\nName\t\t\tPhone\t\t\tMessage");
            for(IndContact i : contactList){
                String x =i.getMessage() ;
                if(x == null){
                    x = "**Add some message***";
                }
                System.out.println(i.getName() + "\t\t\t" + i.getPhone()+"\t\t\t" + x );
            }
            System.out.println("End of the list\n");
        }
    }

    static void sendMessage(String name){
        if (contactList.size() == 0) {
            System.out.println("Awww. Your contacts list empty. Add some contacts\n");
            return;
        }
        int c =0;
        System.out.println("Choose a number");
        for(IndContact i: contactList){
            if((i.getName()).equals(name)){
                System.out.println(i.getPhone());
                c++;
            }
        }
        Scanner sc = new Scanner(System.in);
        int ph = sc.nextInt();
        for (IndContact i : contactList) {
            String x = i.getName();
            if (x.equals(name) && (ph==i.getPhone())) {
                System.out.println("The phone number is: " + i.getPhone());
                System.out.println("Enter the message");
                String message = sc.next();
                i.setMessage(message);
                System.out.println("Message added successfully to the number: "+ i.getPhone());
                return;
            }
        }
        if(c==0) {
            System.out.println("The contact " + name + " not found");
        }
    }

}
