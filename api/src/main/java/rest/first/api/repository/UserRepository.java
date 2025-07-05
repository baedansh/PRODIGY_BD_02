package rest.first.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rest.first.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    // You can add custom query methods if needed
}
