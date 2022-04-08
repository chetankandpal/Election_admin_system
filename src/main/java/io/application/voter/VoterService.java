package io.application.voter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterService {

    @Autowired
    private VoterRepository voterRepository;

    public void addVoter(Voter voter){

        voterRepository.save(voter);
    }


    public Iterable<Voter> getVoterDetails(){
       return voterRepository.findAll();
    }

}
