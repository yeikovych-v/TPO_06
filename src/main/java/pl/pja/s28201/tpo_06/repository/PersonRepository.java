package pl.pja.s28201.tpo_06.repository;

import pl.pja.s28201.tpo_06.model.Person;

import java.util.Collection;
import java.util.List;

public interface PersonRepository {

    void add(Person person);
    default void addAll(Collection<Person> people) {
        for (Person p : people) add(p);
    }

    List<Person> findAll();
}
