package io.application.voter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.Blob;

@Entity
public class Voter {

    @Id
    private String Id;
    private String name;
    private String address;
    private String email;
    private String voted_for;
    private String voter_image;
    private boolean voted;

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public Voter(){

    }

    public Voter(String id, String name, String address, String email, String voted_for, String voter_image,Boolean voted) {
        super();
        this.Id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.voted_for = voted_for;
        this.voter_image = voter_image;
        this.voted=voted;
    }



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getVoter_image() {
        return voter_image;
    }

    public void setVoter_image(String voter_image) {
        this.voter_image = voter_image;
    }
}
