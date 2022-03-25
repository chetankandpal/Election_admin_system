package io.application.electionadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:8081")
@RestController
public class ElectionController {

    @Autowired
    private ElectionService electionService;

   @RequestMapping(method = RequestMethod.POST,value="/elections")
    public void addElection(@RequestBody Election election){
        electionService.addElection(election);
    }

    @RequestMapping("/election/{eid}")
   public Optional<Election> getElectionDetails(@PathVariable Integer eid){
     return  electionService.getElectionDetails(eid);

    }
}
