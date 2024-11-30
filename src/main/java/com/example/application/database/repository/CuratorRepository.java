package com.example.application.database.repository;

import com.example.application.entity.exhibits.Curator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuratorRepository extends JpaRepository<Curator,Long> {

}
