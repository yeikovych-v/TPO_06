package pl.pja.s28201.tpo_06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pja.s28201.tpo_06.model.Language;
import pl.pja.s28201.tpo_06.model.PersonDto;
import pl.pja.s28201.tpo_06.repository.PersonRepository;
import pl.pja.s28201.tpo_06.service.DataService;

@Controller
@RequestMapping("/")
public class MainPageController {

    private final DataService dataService;
    private final PersonRepository personRepository;

    public MainPageController(DataService dataService, PersonRepository personRepository) {
        this.dataService = dataService;
        this.personRepository = personRepository;
    }

    @GetMapping
    public String displayGeneratorPage(Model model) {

        model.addAttribute("dataList", personRepository.findAll());
        model.addAttribute("personDto", new PersonDto());
        model.addAttribute("languages", Language.values());
        return "static/genPage";
    }

    @PostMapping
    public String postDataRequirements(PersonDto personDto) {

        personRepository.addAll(dataService.createPersonList(personDto));

        return "redirect:/";
    }
}
