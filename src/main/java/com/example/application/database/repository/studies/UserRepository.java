package com.example.application.database.repository.studies;

import com.example.application.entity.studies.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserApp, Long>
{
    Optional<UserApp> findByUsername(String username);
}