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

    @Override
    public List<Person> createPersonList(PersonDto dto) {
        List<Person> people = new ArrayList<>();

        Faker faker = new Faker(Language.toLocale(dto.getLanguage()));
        for (int i = 0; i < dto.getPersonCount(); i++) {
            Person person = new Person();
            fakeBasicData(person, faker);
            person.setLanguage(Language.fromLanguageString(dto.getLanguage()));
            fakeAdditionalData(person, faker, dto.isHasAddress(), dto.isHasCountry(), dto.isHasProfession(), dto.isHasLanguageProficiency(), dto.isHasHobby());

            people.add(person);
        }

        return people;
    }

    private void fakeAdditionalData(Person person,
                                    Faker faker, boolean hasAddress,
                                    boolean hasCountry,
                                    boolean hasProfession,
                                    boolean hasLanguageProficiency,
                                    boolean hasHobby) {

        if (hasAddress) person.setAddress(faker.address().fullAddress());
        if (hasCountry) person.setCountry(faker.address().country());
        if (hasProfession) person.setProfession(faker.company().profession());
        if (hasLanguageProficiency)
            person.setLanguageProficiency(faker.options().option(LanguageProficiency.class));
        if (hasHobby) person.setHobby(faker.hobby().activity());

    }

    private void fakeBasicData(Person person, Faker faker) {
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setDateOfBirth(faker.date().birthdayLocalDate(8, 356));
    }
}
