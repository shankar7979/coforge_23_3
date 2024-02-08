package com.abc.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    Integer id;
    String name;

    @Embedded
    Address address;

    @ElementCollection(fetch = FetchType.EAGER)
     Set<Car> carSet;

}
