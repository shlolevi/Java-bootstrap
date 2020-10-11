package com.pluralsight.confrencedemo.repositories;

import com.pluralsight.confrencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
