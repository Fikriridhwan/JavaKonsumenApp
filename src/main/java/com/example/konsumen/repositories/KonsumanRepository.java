package com.example.konsumen.repositories;

import com.example.konsumen.entities.Konsuman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KonsumanRepository extends JpaRepository<Konsuman, Integer> {
}
