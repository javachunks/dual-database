package com.javachunks.dual.db.user.repository;

import com.javachunks.dual.db.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(value = "userTransactionManager")
public interface UserRepository extends JpaRepository<User, Long> {
}
