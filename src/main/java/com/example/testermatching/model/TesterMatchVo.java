package com.example.testermatching.model;

import com.example.testermatching.entity.Device;

import java.util.List;

public class TesterMatchVo {
    private List<String> countries;

    private List<Device> devices;

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
