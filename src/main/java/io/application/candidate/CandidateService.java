package io.application.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public void addCandidate(Candidate candidate){

        candidateRepository.save(candidate);
    }

}
