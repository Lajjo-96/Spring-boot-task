package com.stackroute.foodieservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    private int id;
    @NotNull(message = "Write the message in string" )
    @Size(min = 2)
    private String restaurantName;
    private String imageUrl;
    private String resAddress;

}