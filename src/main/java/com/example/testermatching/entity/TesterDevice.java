package com.example.testermatching.entity;

import javax.persistence.*;

@Table(name = "tester_device", indexes = {
        @Index(name = "tester_device_tester_id_device_id_uindex", columnList = "tester_id, device_id", unique = true)
})
@Entity
public class TesterDevice {
    @EmbeddedId
    private TesterDeviceId testerDeviceId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tester_id", nullable = false, insertable = false, updatable = false)
    private Tester tester;

    @ManyToOne(optional = false)
    @JoinColumn(name = "device_id", nullable = false,  insertable = false, updatable = false)
    private Device device;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Tester getTester() {
        return tester;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }


}