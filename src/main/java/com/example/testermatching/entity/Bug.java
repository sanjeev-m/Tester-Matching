package com.example.testermatching.entity;

import javax.persistence.*;

@Table(name = "bug")
@Entity
public class Bug {
    @Id
    @Column(name = "bug_id", nullable = false, precision = 131089)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tester_id", nullable = false)
    private Tester tester;

    public Tester getTester() {
        return tester;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}