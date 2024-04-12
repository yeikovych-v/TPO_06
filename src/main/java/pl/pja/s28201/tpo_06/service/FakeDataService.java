package pl.pja.s28201.tpo_06.service;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import pl.pja.s28201.tpo_06.model.LanguageProficiency;
import pl.pja.s28201.tpo_06.model.Language;
import pl.pja.s28201.tpo_06.model.Person;
import pl.pja.s28201.tpo_06.model.PersonDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeDataService implements DataService {

    private static final Faker FAKER = new Faker();

    @Override
    public List<Person> createPersonList(PersonDto dto) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < dto.getPersonCount(); i++) {
            Person person = new Person();
            fakeBasicData(person);
            person.setLanguage(Language.fromString(dto.getLanguage()));
            fakeAdditionalData(person, dto.isHasAddress(), dto.isHasCountry(), dto.isHasProfession(), dto.isHasLanguageProficiency(), dto.isHasHobby());

            people.add(person);
        }

        return people;
    }

    private void fakeAdditionalData(Person person,
                                    boolean hasAddress,
                                    boolean hasCountry,
                                    boolean hasProfession,
                                    boolean hasLanguageProficiency,
                                    boolean hasHobby) {

        if (hasAddress) person.setAddress(FAKER.address().fullAddress());
        if (hasCountry) person.setCountry(FAKER.address().country());
        if (hasProfession) person.setProfession(FAKER.company().profession());
        if (hasLanguageProficiency) person.setLanguageProficiency(LanguageProficiency.values()[FAKER.number().numberBetween(0, 6)]);
        if (hasHobby) person.setHobby(FAKER.hobby().activity());

    }

    private void fakeBasicData(Person person) {
        person.setFirstName(FAKER.name().firstName());
        person.setLastName(FAKER.name().lastName());
        person.setDateOfBirth(FAKER.date().birthdayLocalDate(8, 356));
    }
}
