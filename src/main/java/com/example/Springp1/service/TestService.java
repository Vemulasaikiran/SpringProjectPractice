package com.example.Springp1.service;

import com.example.Springp1.entity.Dealer;
import com.example.Springp1.model.DealerDetailsModel;
import com.example.Springp1.repository.DealerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {

    @Autowired
    private DealerRepo dealerRepo;

    public Dealer addData(DealerDetailsModel dealerModel){
        Dealer dealer =new Dealer();
        dealer.setId(dealerModel.getId());
        dealer.setName(dealerModel.getName());
        dealer.setEmail(dealerModel.getEmail());
        return dealerRepo.save(dealer);
    }

    public List<DealerDetailsModel> get()
    {
        List<Dealer> deal = dealerRepo.findAll();
        List<DealerDetailsModel> detailModel = new ArrayList<>();
        deal.stream().forEach(k->{
            DealerDetailsModel dm = new DealerDetailsModel();
            dm.setId(k.getId());
            dm.setName(k.getName());
            dm.setEmail(k.getEmail());
            detailModel.add(dm);
        });
        return detailModel;
    }







}
