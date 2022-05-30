package ma.emsi.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.emsi.cinema.entities.Categorie;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CategoryRepository extends JpaRepository<Categorie, Long> {

}
