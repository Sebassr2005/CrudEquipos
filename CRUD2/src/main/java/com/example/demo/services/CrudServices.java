package com.example.demo.services;


import com.example.demo.Entities.*; 
import org.springframework.http.ResponseEntity; 
import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Map; 
import java.util.Optional; 
import java.util.stream.Collectors; 


@Service
public class CrudServices {

    
    private final List<CrudEntities> equipos = new ArrayList<>();
    private Long currentId = 1L; 

  
    public CrudServices() {
        equipos.add(new CrudEntities(currentId++, "Boca Juniors", "Buenos Aires", "Superliga", "Boca"));
        equipos.add(new CrudEntities(currentId++, "River Plate", "Buenos Aires", "Superliga", "River"));
        equipos.add(new CrudEntities(currentId++, "Barcelona", "Barcelona", "La Liga", "FCB"));
        equipos.add(new CrudEntities(currentId++, "Real Madrid", "Madrid", "La Liga", "RM"));
        equipos.add(new CrudEntities(currentId++, "Manchester United", "Manchester", "Premier League", "MU"));
        equipos.add(new CrudEntities(currentId++, "Chelsea", "Londres", "Premier League", "CFC"));
        equipos.add(new CrudEntities(currentId++, "Juventus", "Turín", "Serie A", "Juve"));
        equipos.add(new CrudEntities(currentId++, "Paris Saint-Germain", "París", "Ligue 1", "PSG"));
        equipos.add(new CrudEntities(currentId++, "Bayern Munich", "Múnich", "Bundesliga", "Bayern"));
       
    }

    
    public List<CrudEntities> getAllEquipos() {
        return equipos;
    }

   
    public ResponseEntity<?> getEquipoById(Long id) {
        Optional<CrudEntities> equipo = equipos.stream()
                .filter(e -> e.getId() == id)
                .findFirst();

        return equipo.isPresent() ? ResponseEntity.ok(equipo.get()) :
                ResponseEntity.badRequest().body(Map.of("Error", "Equipo con ID " + id + " no encontrado"));
    }

    
    public List<CrudEntities> getEquiposByLiga(String liga) {
        return equipos.stream()
                .filter(e -> e.getLiga().equalsIgnoreCase(liga))
                .collect(Collectors.toList());
    }

    public ResponseEntity<?> addEquipo(CrudEntities equipo) {
        boolean exists = equipos.stream()
                .anyMatch(e -> e.getId() == equipo.getId());

        if (exists) {
            return ResponseEntity.badRequest().body(Map.of("Error", "El equipo con ID " + equipo.getId() + " ya existe"));
        }
        equipo.setId(currentId++);
        equipos.add(equipo);
        return ResponseEntity.ok(Map.of("Mensaje", "Equipo agregado exitosamente", "equipo", equipo));
    }

   
    public ResponseEntity<?> updateEquipo(Long id, CrudEntities equipo) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getId() == id) {
                equipo.setId(id);
                equipos.set(i, equipo);
                return ResponseEntity.ok(Map.of("Mensaje", "Equipo actualizado exitosamente", "equipo", equipo));
            }
        }
        return ResponseEntity.badRequest().body(Map.of("Error", "El equipo con ID " + id + " no existe"));
    }

   
    public ResponseEntity<?> deleteEquipoById(Long id) {
        Optional<CrudEntities> equipoToRemove = equipos.stream()
                .filter(e -> e.getId() == id)
                .findFirst();

        if (equipoToRemove.isPresent()) {
            equipos.remove(equipoToRemove.get());
            return ResponseEntity.ok(Map.of("Mensaje", "Equipo eliminado exitosamente"));
        } else {
            return ResponseEntity.badRequest().body(Map.of("Error", "Equipo con ID " + id + " no encontrado"));
        }
    }
}
