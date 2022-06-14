package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private static Map<String, List<Contacts>> map = new HashMap<>();

    public boolean addGroup(String group) {
        map.putIfAbsent(group, new ArrayList<Contacts>());
        return true;
    }

    public boolean addContacts(String name, int tel, String group) {
        Contacts contacts = new Contacts(name, tel);
        map.get(group).add(contacts);
        return true;
    }

    public void printByGroup(String group) {
        System.out.println(group + "--> " + map.get(group));
    }

    public Contacts printByTel(int tel) {
        for (Map.Entry<String, List<Contacts>> kv : map.entrySet()) {
            List<Contacts> list = kv.getValue();
            for (Contacts s : list) {
                if (s.getTel() == tel) {
                    return s;
                }
            }
        }
        return null;
    }
}



