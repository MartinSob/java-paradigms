/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.service;

import ar.edu.uai.model.Car;
import ar.edu.uai.model.Person;
import ar.edu.uai.repository.CarRepository;
import ar.edu.uai.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class PersonService {

   @Autowired
   private PersonRepository repository;
   private CarRepository repositoryCar;

   public List<Person> findByAge(Integer age) {
      return repository.findByAge(age);
   }

   public Person insert(Person person) {
      System.out.println(person);
      Person p2 = repository.save(person);
      return p2;
   }

   public Person getById(Integer id) {
      return repository.getOne(id);
   }

}
