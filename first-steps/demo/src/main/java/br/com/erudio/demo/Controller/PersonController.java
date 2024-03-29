package br.com.erudio.demo.Controller;

import br.com.erudio.demo.model.Person;
import br.com.erudio.demo.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices services;
    @RequestMapping(value="/{id}", method=RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(
            @PathVariable("id") String id)
            throws Exception {
        return services.findById(id);
    }

    @RequestMapping(method=RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public java.util.List<Person> findAll() throws Exception {
        return services.findAll();
    }

}