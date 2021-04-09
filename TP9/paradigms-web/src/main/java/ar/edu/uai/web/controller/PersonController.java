/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.web.controller;


import ar.edu.uai.api.PersonDTO;
import ar.edu.uai.mapper.PersonMapper;
import ar.edu.uai.model.Person;
import ar.edu.uai.service.PersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper mapper;

    @ApiOperation(value="Get user by id")
    @RequestMapping(value="/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PersonDTO.class)})
    public PersonDTO getPerson(@PathVariable("id") Integer id) {
        return mapper.map(personService.getById(id), PersonDTO.class);
    }

    @ApiOperation(value="Insert User")
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = PersonDTO.class)})
    @RequestMapping(method = POST)
    public @ResponseBody ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO personDTO) {
        Person savePerson = mapper.map(personDTO, Person.class);
        return new ResponseEntity<>(mapper.map(personService.insert(savePerson), PersonDTO.class), HttpStatus.CREATED);
    }


}
