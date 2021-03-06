package com.mironova.springcourse.dao;

import com.mironova.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int peopleCount;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++peopleCount, "Andrew"));
        people.add(new Person(++peopleCount, "Bob"));
        people.add(new Person(++peopleCount, "Catrine"));
        people.add(new Person(++peopleCount, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
