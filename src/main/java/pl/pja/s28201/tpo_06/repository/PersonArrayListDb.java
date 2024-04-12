package pl.pja.s28201.tpo_06.repository;

import org.springframework.stereotype.Repository;
import pl.pja.s28201.tpo_06.model.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonArrayListDb implements PersonRepository {

    private final static List<Person> DB = new ArrayList<>();

    @Override
    public void add(Person person) {
        DB.add(person);
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(DB);
    }


}
