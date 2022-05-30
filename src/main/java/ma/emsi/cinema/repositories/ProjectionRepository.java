package ma.emsi.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import ma.emsi.cinema.entities.Projection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProjectionRepository extends JpaRepository<Projection, Long> {

}
