package com.example.testermatching.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "device")
@Entity
public class Device {
    @Id
    @Column(name = "device_id", nullable = false, precision = 131089)
    private Long id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}