package io.application.voter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface VoterRepository extends CrudRepository<Voter,String> {
}
