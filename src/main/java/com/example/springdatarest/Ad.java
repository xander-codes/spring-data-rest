package com.example.springdatarest;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@EqualsAndHashCode
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull(message = "Who is the owner of this ad?")
    public String owner;
    public String title;
    public String description;
    @Min(message = "Price cannot be negative", value = 0)
    public BigDecimal price;

    protected Ad() {
    }

    public Ad(String owner, String title, String description, BigDecimal price) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}