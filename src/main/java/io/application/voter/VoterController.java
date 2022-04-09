package io.application.voter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:3000/")
@RestController
public class VoterController {


    @Autowired
    private VoterService voterService;

    @RequestMapping(method = RequestMethod.POST,value="/voter")
    public void addVoter(@RequestBody Voter voter){
        System.out.println(voter.getvId()+" "+voter.getName());
        voterService.addVoter(voter);
    }

    @RequestMapping("/voter")
    public Iterable<Voter> getVoterDetails(){
        return voterService.getVoterDetails();
    }
}
