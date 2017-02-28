package ufba.meuhorario.model;

import java.io.Serializable;

/**
 * Created by Diego Novaes on 24/02/2017.
 */

public class Area implements Serializable{
    Long id;
    String name;
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}