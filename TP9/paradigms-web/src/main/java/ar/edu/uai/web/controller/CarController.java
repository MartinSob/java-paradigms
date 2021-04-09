/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.web.controller;


import ar.edu.uai.api.CarDTO;
import ar.edu.uai.mapper.CarMapper;
import ar.edu.uai.model.Car;
import ar.edu.uai.service.CarService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private CarMapper mapper;

    @ApiOperation(value="Get user by id")
    @RequestMapping(value="/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = CarDTO.class)})
    public CarDTO getCar(@PathVariable("id") Integer id) {
        return mapper.map(carService.getById(id), CarDTO.class);
    }

    @ApiOperation(value="Insert User")
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = CarDTO.class)})
    @RequestMapping(method = POST)
    public @ResponseBody ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
        Car saveCar = mapper.map(carDTO, Car.class);
        return new ResponseEntity<>(mapper.map(carService.insert(saveCar), CarDTO.class), HttpStatus.CREATED);
    }


}
