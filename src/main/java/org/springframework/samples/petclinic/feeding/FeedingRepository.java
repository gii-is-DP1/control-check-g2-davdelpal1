package org.springframework.samples.petclinic.feeding;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface FeedingRepository extends CrudRepository {
    List<Feeding> findAll();
    List<FeedingType> findAllFeedingTypes();
    Optional<Feeding> findById(int id);
    Feeding save(Feeding p);
}
