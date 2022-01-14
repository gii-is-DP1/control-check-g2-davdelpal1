package org.springframework.samples.petclinic.feeding;

import java.util.List;

public class FeedingService {
	private FeedingRepository feedingRepository;
    public List<Feeding> getAll(){
        return this.feedingRepository.findAll();
    }

    public List<FeedingType> getAllFeedingTypes(){
        return this.feedingRepository.findAllFeedingTypes();
    }

    public FeedingType getFeedingType(String typeName) {
        return (FeedingType) this.feedingRepository.findAllFeedingTypes();
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return this.feedingRepository.save(p);       
    }

    
}
