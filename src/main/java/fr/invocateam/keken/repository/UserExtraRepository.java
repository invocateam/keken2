package fr.invocateam.keken.repository;

import fr.invocateam.keken.domain.UserExtra;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the UserExtra entity.
 */
@SuppressWarnings("unused")
public interface UserExtraRepository extends MongoRepository<UserExtra,String> {

}
