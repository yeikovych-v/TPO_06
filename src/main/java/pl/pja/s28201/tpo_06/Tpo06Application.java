package pl.pja.s28201.tpo_06;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pja.s28201.tpo_06.repository.PersonRepository;
import pl.pja.s28201.tpo_06.service.DataService;

@SpringBootApplication
public class Tpo06Application {

    public static void main(String[] args) {
        SpringApplication.run(Tpo06Application.class, args);
    }
}
