/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.api;

import ar.edu.uai.model.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_EMPTY)
public class CarDTO {

    private Integer id;
    private String model;
    private String brand;
    private String licensePlate;
    private Person owner;

    @JsonInclude(NON_NULL)
    public Integer getId() {
        return id;
    }

    @JsonInclude(NON_NULL)
    public String getModel() {
        return model;
    }

    @JsonInclude(NON_NULL)
    public String getBrand() {
        return brand;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @JsonInclude(NON_NULL)
    public String getLicensePlate() {
        return licensePlate;
    }

    @JsonIgnore
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
