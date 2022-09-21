package com.camera.model;

public class IPv4 {
    private String octetOne;
    private String octetTwo;
    private String octetThree;
    private String octetFour;

    public IPv4() {
    }

    public IPv4(String octetOne, String octetTwo, String octetThree, String octetFour) {
        this.octetOne = octetOne;
        this.octetTwo = octetTwo;
        this.octetThree = octetThree;
        this.octetFour = octetFour;
    }

    public String getOctetOne() {
        return octetOne;
    }

    public void setOctetOne(String octetOne) {
        this.octetOne = octetOne;
    }

    public String getOctetTwo() {
        return octetTwo;
    }

    public void setOctetTwo(String octetTwo) {
        this.octetTwo = octetTwo;
    }

    public String getOctetThree() {
        return octetThree;
    }

    public void setOctetThree(String octetThree) {
        this.octetThree = octetThree;
    }

    public String getOctetFour() {
        return octetFour;
    }

    public void setOctetFour(String octetFour) {
        this.octetFour = octetFour;
    }
}
