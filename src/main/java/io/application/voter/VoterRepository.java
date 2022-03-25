package io.application.voter;

import org.springframework.data.repository.CrudRepository;

public interface VoterRepository extends CrudRepository<Voter,String> {
}
