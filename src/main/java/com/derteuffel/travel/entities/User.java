package com.derteuffel.travel.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long userId;

    @NotEmpty(message = "this input cannot be empty")
    private String username;
    @NotEmpty(message = "this input cannot be empty")
    private String login;
    private String avatar;
}
