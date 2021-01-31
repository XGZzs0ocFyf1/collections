package ru.gurzhiy;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Integer>> book = new HashMap<>();

    /*
        add new person to phone book
        if persons second name already exists in book
        a new phone will be added in list of existing phones
     */
    public void add(String secondName, int phoneNumber) {
        List<Integer> existingPhoneNumbers = book.get(secondName) == null ? new ArrayList<>() : book.get(secondName);
        existingPhoneNumbers.add(phoneNumber);
        book.put(secondName, existingPhoneNumbers);
    }

    /**
     * Search person phone number by person's secondName
     */
    public List<Integer> get(String secondName) {
        //List of persons with same second names
        return book.get(secondName);
    }


    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

     /*   book.add("Jonny", 123456);
        book.add("Jonny", 64347567);
        book.add("Tony", 64347567);


        System.out.println( book.get("Jonny"));
        System.out.println( book.get("Tony"));*/
    }
}
