package fr.invocateam.keken.repository;

import fr.invocateam.keken.domain.Biere;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Biere entity.
 */
@SuppressWarnings("unused")
public interface BiereRepository extends MongoRepository<Biere,String> {

}
