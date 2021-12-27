package com.example.Springp1.controller;

import com.example.Springp1.entity.Dealer;
import com.example.Springp1.model.DealerDetailsModel;
import com.example.Springp1.model.TestModel;
import com.example.Springp1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
   public List<DealerDetailsModel> get()
   {
      return service.get();

   }
   @GetMapping("/get/{id}")
   public DealerDetailsModel getById(@PathVariable int id)
   {
      return service.getById(id);
   }

   @DeleteMapping("/deleteall")
   public void delete()
   {
      service.delete();
   }
   @DeleteMapping("/delet-by-id/{id}")
   public void delet(@PathVariable int id)
   {
      service.deleteby(id);
   }




//   @PostMapping("/post-message")
//   private TestModel GetMessage(@RequestBody TestModel message){
//       return message;
//   }
//   @GetMapping("/get-message")
//   public String hetMessage()
//   {
//      return "Hello........";
//   }


}
