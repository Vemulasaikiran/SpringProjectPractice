package com.example.Springp1.repository;

import com.example.Springp1.entity.Dealer;
import com.example.Springp1.model.DealerDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealerRepo extends JpaRepository<Dealer, Integer> {
//    List<Dealer> findByPublished(boolean published);


}
