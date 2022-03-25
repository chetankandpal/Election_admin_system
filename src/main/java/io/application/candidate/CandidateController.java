package io.application.candidate;

import io.application.electionadmin.Election;
import io.application.electionadmin.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CandidateController {


    @Autowired
    private CandidateService candidateService;

    @RequestMapping(method = RequestMethod.POST,value="/candidate")
    public void addCandidate(@RequestBody Candidate candidate){
        candidateService.addCandidate(candidate);
    }

}
