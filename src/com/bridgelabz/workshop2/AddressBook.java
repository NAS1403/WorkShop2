package com.bridgelabz.workshop2;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContacts(){
        Contacts contact = new Contacts();
        System.out.println("Enter the first name of the contact");
        contact.setFirstName(scanner.next());
        System.out.println("Enter the second name of the contact");
        contact.setSecondName(scanner.next());
        System.out.println("Enter the name of the city");
        contact.setCity(scanner.next());
        System.out.println("Enter the state");
        contact.setState(scanner.next());
        System.out.println("Enter the Pin Code");
        contact.setPinCode(scanner.nextInt());
        System.out.println("Enter the phone number");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter email ID");
        contact.setEmail(scanner.next());
        arrayList.add(contact);
    }

    public void editContact(){
        if(arrayList.isEmpty()){
            System.out.println("No contact in addressBook to edit");
        }
        else{
            System.out.println("Enter first name of the contact");
            String firstName = scanner.next();
            boolean found = false;
            for(Contacts contact : arrayList){
                if(firstName.equals(contact.getFirstName())){
                    System.out.println("Contact found to edit");
                    System.out.println("Enter the first name of contact");
                    contact.setFirstName(scanner.next());
                    System.out.println("Enter the second name of the contact");
                    contact.setSecondName(scanner.next());
                    System.out.println("Enter the name of the city");
                    contact.setCity(scanner.next());
                    System.out.println("Enter the state");
                    contact.setState(scanner.next());
                    System.out.println("Enter the Pin Code");
                    contact.setPinCode(scanner.nextInt());
                    System.out.println("Enter the phone number");
                    contact.setPhoneNumber(scanner.nextLong());
                    System.out.println("Enter email ID");
                    contact.setEmail(scanner.next());
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Contact not found in addressBook to edit");
            }
        }
    }
}
