package com.example.Springp1.service;

import com.example.Springp1.entity.Dealer;
import com.example.Springp1.model.DealerDetailsModel;
import com.example.Springp1.repository.DealerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TestService {

    @Autowired
    private final DealerRepo dealerRepo;

    public TestService(DealerRepo dealerRepo) {
        this.dealerRepo = dealerRepo;
    }

    public Dealer addData(int id, String name, String email){
        Dealer dealer =new Dealer();
        dealer.setId(id);
        dealer.setName(name);
        dealer.setEmail(email);
        return dealerRepo.save(dealer);
    }

    public List<DealerDetailsModel> get()
    {
        List<Dealer> deal = dealerRepo.findAll();
//        List<DealerDetailsModel> detailModel = new ArrayList<>();

        return deal.stream().map(this::conversion).collect(Collectors.toList());

    }
    public DealerDetailsModel getById(int id)
    {
        Optional<Dealer> ddd= dealerRepo.findById(id);
        return ddd.map(this::conversion).orElse(null);
    }



    public DealerDetailsModel conversion(Dealer detail)
    {
        DealerDetailsModel data = new DealerDetailsModel();
        data.setId(detail.getId());
        data.setName(detail.getName());
        data.setEmail(detail.getEmail());
        return data;
    }


    public void delete()
    {

        dealerRepo.deleteAll();
    }

    public void deleteby(int id)
    {

        dealerRepo.deleteById(id);
    }



}
