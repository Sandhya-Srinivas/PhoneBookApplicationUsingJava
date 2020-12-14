package com.examples.challengeFour;

import java.util.ArrayList;
import java.util.List;

public class ContactsApp {

    static List<IndContact> contactList = new ArrayList<>();

    static void showContacts(){
        if(contactList.size() == 0){
            System.out.println("Awww. Your contacts list empty. Add some contacts\n");
        }
        else{
            System.out.println("Your contact list:\nName\t\t\tNumber");
            for(IndContact i : contactList){
                System.out.println(i.getName() +"\t\t\t" + i.getPhone());
            }
            System.out.println("End of the list\n");
        }
    }

    static void addContact(IndContact i){
        for (IndContact j : contactList) {
            if ((j.getPhone() == i.getPhone()) && (j.getName().equals( i.getName()))) {
                System.out.println("The contact already exists " );
                return;
            }
        }
        contactList.add(i);
        System.out.println("Contact " + i.getName() + " added successfully\n");
    }

    static void searchPhone(String name) {
        if (contactList.size() == 0) {
            System.out.println("Awww. Your contacts list empty. Add some contacts\n");
            return;
        }
        for (IndContact i : contactList) {
            String x = i.getName();
            if (x.equals(name)) {
                System.out.println("The phone number is: " + i.getPhone());
                return;
            }
        }
        System.out.println("The contact " + name + " not found");
    }
    static void deletePhone(String name){
        if (contactList.size() == 0) {
            System.out.println("Awww. Your contacts list empty. Add some contacts\n");
            return;
        }
        for (IndContact i : contactList) {
            String x = i.getName();
            if (x.equals(name)) {
                contactList.remove(i);
                System.out.println("The phone number " + i.getPhone() + "is removed");
                return;
            }
        }
        System.out.println("The contact " + name + " not found");
    }
}
