package com.example.testermatching.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TesterDeviceId implements Serializable {
    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "tester_id")
    private Long testerId;

    public TesterDeviceId(Long deviceId, Long testerId) {
        this.deviceId = deviceId;
        this.testerId = testerId;
    }

    public TesterDeviceId() {

    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getTesterId() {
        return testerId;
    }

    public void setTesterId(Long testerId) {
        this.testerId = testerId;
    }
}
