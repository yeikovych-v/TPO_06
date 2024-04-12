package pl.pja.s28201.tpo_06.service;

import pl.pja.s28201.tpo_06.model.Person;
import pl.pja.s28201.tpo_06.model.PersonDto;

import java.util.List;

public interface DataService {

    List<Person> createPersonList(PersonDto dto);
}
