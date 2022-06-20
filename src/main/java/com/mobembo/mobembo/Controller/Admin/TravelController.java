package com.mobembo.mobembo.Controller.Admin;

import java.util.List;

import com.mobembo.mobembo.Model.Request.Admin.TravelRequest;
import com.mobembo.mobembo.Model.Response.Admin.TravelResponse;
import com.mobembo.mobembo.Service.Admin.TravelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/travel")
public class TravelController {
    
    @Autowired
    private TravelService _travelService;

    @PostMapping
    public ResponseEntity<TravelRequest> Create( @RequestBody TravelRequest viagemRequest) {

        return  _travelService.Create(viagemRequest);
    }

    @PutMapping
    public ResponseEntity<TravelResponse> update( @RequestBody TravelResponse viagemRequest) {
       
       return  _travelService.Update(viagemRequest);
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<TravelRequest> Delete(@PathVariable String id) {
    
        return  _travelService.Delete(id);
   }

   @GetMapping("/{id}")
   public ResponseEntity<TravelRequest> GetById(@PathVariable String id) {
        return _travelService.GetById(id);
   }

   @GetMapping
   public ResponseEntity<List<TravelResponse>> GetAll() {
        return _travelService.GetAll();
   }

   @GetMapping("/admin")
   public ResponseEntity<List<TravelResponse>> GetAllByIdAdmin(@RequestHeader("IdAmin") String idAdmin ) {
        return _travelService.GetAllByIdAdmin(idAdmin);
   }
}
