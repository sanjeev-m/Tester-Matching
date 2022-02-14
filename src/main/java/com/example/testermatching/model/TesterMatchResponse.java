package com.example.testermatching.model;

public class TesterMatchResponse {
    private Long bugsCount;

    private Long deviceId;

    private String description;

    private Long testerId;

    private String firstName;

    private String lastName;

    private String country;

    public TesterMatchResponse(Long bugsCount, Long deviceId, String description, Long testerId, String firstName, String lastName, String country) {
        this.bugsCount = bugsCount;
        this.deviceId = deviceId;
        this.description = description;
        this.testerId = testerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public Long getBugsCount() {
        return bugsCount;
    }

    public void setBugsCount(Long bugsCount) {
        this.bugsCount = bugsCount;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTesterId() {
        return testerId;
    }

    public void setTesterId(Long testerId) {
        this.testerId = testerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
