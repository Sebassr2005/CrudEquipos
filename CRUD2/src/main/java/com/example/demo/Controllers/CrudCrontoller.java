package com.example.demo.Controllers;


import com.example.demo.Entities.*;
import com.example.demo.services.*;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 


@RequestMapping("/api/v1/equipos")
public class CrudCrontoller {

    
    private final CrudServices  crudService;

    
    public CrudCrontoller(CrudServices crudService) {
        this.crudService = crudService;
    }

    
    @GetMapping
    public List<CrudEntities> getAllCountries() {
        return crudService.getAllEquipos();}

    
    @GetMapping("/{id}")
    public ResponseEntity<?> getOneCountry(@PathVariable Long id) {
        return crudService.getEquipoById(id); 
    }

    @PostMapping
    public ResponseEntity<?> createCountry(@RequestBody CrudEntities crearequipo) {
        return crudService.addEquipo(crearequipo) ;}

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCountry(@PathVariable Long id, @RequestBody CrudEntities actualizarequipo) {
        return crudService.updateEquipo(id, actualizarequipo);
    }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCountry(@PathVariable Long id) {
        return crudService.deleteEquipoById(id);}
}
    