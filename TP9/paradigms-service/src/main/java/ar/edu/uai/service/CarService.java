/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.service;

import ar.edu.uai.model.Car;
import ar.edu.uai.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CarService {

   @Autowired
   private CarRepository repository;

   /*
   public List<Car> findByPlate(String plate) {
      return repository.findByPlate(plate);
   }
   */

   public Car insert(Car car) {
      return repository.save(car);
   }

   public Car getById(int id) {
      return repository.getOne(id);
   }

}
