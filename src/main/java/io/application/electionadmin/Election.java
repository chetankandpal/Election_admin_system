package io.application.electionadmin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eId;
    private String election_name;
    private Date stime;
    private Date etime;
    private Integer voters_count;

   public Election(){

   }

    public Election(String election_name, Integer eId, Date stime, Date etime, Integer voters_count) {

       super();
       this.election_name = election_name;
        this.eId = eId;
        this.stime = stime;
        this.etime = etime;
        this.voters_count = voters_count;
    }

    public String getElection_name() {
        return election_name;
    }

    public void setElection_name(String election_name) {
        this.election_name = election_name;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getVoters_count() {
        return voters_count;
    }

    public void setVoters_count(Integer voters_count) {
        this.voters_count = voters_count;
    }
}
