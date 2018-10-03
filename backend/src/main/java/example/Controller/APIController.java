package example.Controller;

import example.Entity.Person;
import example.Entity.RegisterForm;
import example.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by FateXRebirth on 20/10/2017.
 */

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    PersonService personService;

    @GetMapping("/get/person/{id}")
    public Person getPersonByID(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @GetMapping("/get/person")
    public Person getPersonByUsername(@RequestParam String username) {
        return personService.getPersonByUsername(username);
    }

    @GetMapping("/person/GetAllPerson")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/person/GetAllPersonEmail")
    public List<String> getEmail() {
        return personService.getAllEmail();
    }

    @PostMapping("/person/CreatePerson")
    public void register(@RequestBody RegisterForm registerForm) {
        Person newUser = new Person(registerForm.getUsername(), registerForm.getPassword(), registerForm.getEmail(), registerForm.getType());
        personService.create(newUser);
    }

}
