package com.pluralsight.confrencedemo.repositories;

import com.pluralsight.confrencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
