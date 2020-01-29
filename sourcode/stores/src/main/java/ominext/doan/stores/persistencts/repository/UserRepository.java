package ominext.doan.stores.persistencts.repository;

import ominext.doan.stores.persistencts.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
