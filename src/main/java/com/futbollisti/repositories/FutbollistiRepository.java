package com.futbollisti.repositories;


import com.futbollisti.model.Futbollisti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutbollistiRepository extends JpaRepository<Futbollisti,Long> {
}
