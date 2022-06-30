package Lesson4.Task2;

import java.util.*;

public class PhoneBook<S, S1> extends HashMap<String, String> {
    public PhoneBook() {
    }

    public String addRecord(String number, String name) {
        return super.put(number, name);
    }

    public Set<String> getRecord(String value) {
        Set<String> returnRecord = new HashSet<>();
        returnRecord.add(value);
        for (PhoneBook.Entry<String, String> o : super.entrySet()) {
            if (o.getValue().equals(value)) {
                returnRecord.add(o.getKey());
            }
        }
        if (returnRecord.size() == 1) {
            returnRecord.add("No Entries");
        }
        return returnRecord;
    }
}
