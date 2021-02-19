package com.alexbirichevskiy.homework_10;

import java.util.*;

public class TelephoneBook {
    private static Map<String, String> telephoneBook;
    static {
        telephoneBook = new HashMap();
        telephoneBook.put("+79991101334", "Смирнов");
        telephoneBook.put("+79992172445", "Иванов");
        telephoneBook.put("+79993243556", "Кузнецов");
        telephoneBook.put("+79994314667", "Соколов");
        telephoneBook.put("+79995385778", "Попов");
        telephoneBook.put("+79996456889", "Лебедев");
        telephoneBook.put("+79997528000", "Козлов");
        telephoneBook.put("+79998599111", "Новиков");
        telephoneBook.put("+79999660222", "Морозов");
        telephoneBook.put("+79990731333", "Петров");
        telephoneBook.put("+79991802444", "Волков");
        telephoneBook.put("+79992873555", "Соловьёв");
        telephoneBook.put("+79993944666", "Васильев");
        telephoneBook.put("+79995015777", "Зайцев");
        telephoneBook.put("+79996086888", "Павлов");
        telephoneBook.put("+79997157999", "Семёнов");
        telephoneBook.put("+79998229110", "Голубев");
        telephoneBook.put("+79999290221", "Виноградов");
        telephoneBook.put("+79990361332", "Богданов");
        telephoneBook.put("+79991432443", "Воробьёв");
        telephoneBook.put("+79992503554", "Фёдоров");
        telephoneBook.put("+79993574665", "Михайлов");
        telephoneBook.put("+79994645776", "Беляев");
        telephoneBook.put("+79995716887", "Тарасов");
        telephoneBook.put("+79996787998", "Белов");
    }

    public static void add (String name, String telephoneNumber) {
        if (telephoneBook.containsKey(telephoneNumber)){
            System.out.println("Пользователь с таким телефоном уже существует");
        }
        else {
            telephoneBook.put(telephoneNumber, name);
        }
    }

    public static Map<String, String> getTelephoneBook() {
        System.out.println(telephoneBook);
        return telephoneBook;
    }

    public static void get(String name) {
        List<Map.Entry<String, String>> listtelephoneBook = new ArrayList(telephoneBook.entrySet());
        Iterator<Map.Entry<String, String>> iter = listtelephoneBook.iterator();
        while (iter.hasNext()) {
            Map.Entry <String, String> entry = iter.next();
            if (entry.getValue().equals(name)) {
                System.out.println("Фамилия: " + entry.getValue() + " - Телефон: " + entry.getKey());
            }
        }
    }
}
