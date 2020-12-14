package com.examples.challengeFour;

public class IndContact {
    private final String name;
    private final int phone;
    private String message;


    public IndContact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setMessage(String message) {
        this.message = (this.message == null) ? message : (this.message + " ----- " +message) ;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getMessage() {
        return message;
    }
}
