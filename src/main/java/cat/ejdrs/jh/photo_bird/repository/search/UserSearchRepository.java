package cat.ejdrs.jh.photo_bird.repository.search;

import cat.ejdrs.jh.photo_bird.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
