package io.application.electionadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElectionService {

    //Create election
    //Register candidates
    //Register voters

    @Autowired
    private ElectionRepository electionRepository;

    public void addElection(Election election){

     electionRepository.save(election);
    }

    public Optional<Election> getElectionDetails(Integer eid){

      return electionRepository.findById(eid);
    }


}
