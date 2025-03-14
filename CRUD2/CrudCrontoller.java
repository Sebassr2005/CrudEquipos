package Controllers;


import Entities.CrudEntities; 
import services.CrudServices; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 


@RequestMapping("/api/v1/countries")
public class CrudCrontoller {

    
    private final CrudServices crudServices;

    
    public CrudCrontoller(CrudServices crudServices) {
        this.crudServices = crudServices;
    }

   
    @GetMapping
    public List<CrudEntities> getAllCountries() {
    	return crudServices.getAllEquipos();
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<?> getOneCountry(@PathVariable Long id) {
    	return crudServices.getEquipoById(id);

    }

   
    @PostMapping
    public ResponseEntity<?> createCountry(@RequestBody CrudEntities paisACrearse) {
    	return crudServices.addEquipo(equipoACrear);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCountry(@PathVariable Long id, @RequestBody CrudEntities paisAActualizar) {
    	return crudServices.updateEquipo(id, equipoActualizar);

    }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCountry(@PathVariable Long id) {
    	return crudServices.deleteEquipoById(id);

    }
}
