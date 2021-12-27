package com.example.Springp1.controller;

import com.example.Springp1.entity.Dealer;
import com.example.Springp1.model.DealerDetailsModel;
import com.example.Springp1.model.TestModel;
import com.example.Springp1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Testproject {
   @Autowired
   private TestService service;

   @PostMapping("/add")
   public Dealer addData(@RequestBody DealerDetailsModel detailsModel)
   {
      return service.addData(detailsModel);
   }
   @GetMapping("/get")
   public List<DealerDetailsModel> getd()
   {
      return service.get();

   }

   @PostMapping("/post-message")
   private TestModel GetMessage(@RequestBody TestModel message){
       return message;
   }
   @GetMapping("/get-message")
   public String hetMessage()
   {
      return "Hello........";
   }


}
