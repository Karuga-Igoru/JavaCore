/*
 * Java Core. Homework #4
 *
 * @author Igor Kargapolov
 * @version 24.02.2022
 */
package Lesson4.Task2;

public class Task2Main {
    public static void main(String[] args) {
        PhoneBook<String, String> phonebook = new PhoneBook<>();
        phonebook.put("254586", "Antonov");
        phonebook.put("234234", "Ivanov");
        phonebook.put("421824", "Petrov");
        phonebook.put("332262", "Sidorov");
        phonebook.put("366450", "Koshkin");
        phonebook.put("419829", "Tolstoy");
        phonebook.put("660721", "Antonov");
        phonebook.put("799759", "Petrov");
        phonebook.addRecord("123645", "Tolstoy");
        System.out.println(phonebook.getRecord("Antonov").toString());
        System.out.println(phonebook.getRecord("Vasya").toString());
        System.out.println(phonebook.getRecord("Tolstoy").toString());
    }




}
