package ch.adesso.edms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.adesso.edms.model.Publisher;

@RepositoryRestResource(collectionResourceRel = "publishers", path = "publishers")
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Integer> {
	
}
