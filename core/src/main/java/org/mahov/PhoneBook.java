package org.mahov;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    //Телефонная книга: Реализуйте простую телефонную книгу с использованием Map,
    // где ключ — это имя абонента, а значение — его телефонный номер.
    // Добавьте возможность поиска, добавления и удаления записей.

    private Map<String, String> contacts = new HashMap<>();


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

    }
}
