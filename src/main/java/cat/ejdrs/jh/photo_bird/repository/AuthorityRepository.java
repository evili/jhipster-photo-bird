package cat.ejdrs.jh.photo_bird.repository;

import cat.ejdrs.jh.photo_bird.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
