package com.example.Springp1.repository;

import com.example.Springp1.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerRepo extends JpaRepository<Dealer, Integer> {

}
