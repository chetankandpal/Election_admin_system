package io.application.voter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class VoterController {


    @Autowired
    private VoterService voterService;

    @RequestMapping(method = RequestMethod.POST,value="/voter")
    public void addCandidate(@RequestBody Voter voter){
        voterService.addVoter(voter);
    }

}
