package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        long count = persons.stream()
                .filter(age -> age.getAge() < 18)
                .count();
        System.out.println(count);

        List <String> persons1= persons.stream()
                .filter(age -> age.getAge() >= 18 && age.getAge() < 28)
                .map(person -> person.getFamily())
                .collect(Collectors.toList());
        System.out.println(persons1);

        List <Person> persons2= persons.stream()
                .filter(p->((p.getSex()==Sex.WOMAN && p.getAge()<60&& p.getAge()>17)||(p.getSex()==Sex.MAN &&p.getAge()<65&& p.getAge()>17)))
                .sorted(Comparator.comparing(person -> person.getFamily()))
                .collect(Collectors.toList());
        System.out.println(persons2);

    }
}
