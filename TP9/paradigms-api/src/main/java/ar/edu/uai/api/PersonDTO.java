/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.api;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Set;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_EMPTY)
public class PersonDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private CarDTO car;

    @JsonInclude(NON_NULL)
    public Integer getId() {
        return id;
    }

    @JsonInclude(NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    @JsonInclude(NON_NULL)
    public String getLastName() {
        return lastName;
    }

    @JsonInclude(NON_NULL)
    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonInclude(NON_NULL)
    public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
        this.car = car;
    }
}
