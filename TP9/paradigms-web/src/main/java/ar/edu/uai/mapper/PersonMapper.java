/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.mapper;

import ar.edu.uai.api.PersonDTO;
import ar.edu.uai.model.Person;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper extends ConfigurableMapper {

    @Override protected void configure(MapperFactory factory) {
        factory.classMap(Person.class, PersonDTO.class)
            .field("id", "id")
            .field("firstName", "firstName")
            .field("lastName", "lastName")
            .field("age", "age")
            .field("car", "car")
            .register();
    }
}
