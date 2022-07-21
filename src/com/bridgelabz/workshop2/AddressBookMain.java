package com.bridgelabz.workshop2;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while(exit) {
            System.out.println("Enter \n1)To add contact.\n2)To edit contact.\n3)To exit");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    addressBook.addContacts();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    break;
            }
        }
    }
}
