package fr.invocateam.keken.repository;

import fr.invocateam.keken.domain.Commentaire;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Commentaire entity.
 */
@SuppressWarnings("unused")
public interface CommentaireRepository extends MongoRepository<Commentaire,String> {

    List<Commentaire> findAllByBiereIdEquals(String id);
}
