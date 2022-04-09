package io.application.voter;

import javax.persistence.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.Blob;

@Entity
public class Voter {

    @Id
    private String vId;
    private String name;
    private String address;
    private String email;
    private String voted_for;


    public Voter(){

    }

    public Voter(String vId, String name, String address, String email, String voted_for) {
        super();
        this.vId = vId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.voted_for = voted_for;
    }

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoted_for() {
        return voted_for;
    }

    public void setVoted_for(String voted_for) {
        this.voted_for = voted_for;
    }
}
