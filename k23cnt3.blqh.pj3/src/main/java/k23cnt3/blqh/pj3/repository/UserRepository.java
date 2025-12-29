package k23cnt3.blqh.pj3.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import k23cnt3.blqh.pj3.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);

    boolean existsByEmail(String email);
}