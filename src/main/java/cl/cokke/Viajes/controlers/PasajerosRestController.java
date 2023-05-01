package cl.cokke.Viajes.controlers;

import cl.cokke.Viajes.repository.PasajeroRepository;
import cl.cokke.Viajes.repository.ViajeRepository;
import cl.cokke.Viajes.services.PasajeroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class PasajerosRestController {

    @Autowired
    PasajeroService repo;

    @Autowired
    ViajeRepository repoViajes;
    @GetMapping("/pasajeros")
    public ResponseEntity<?> listarPasajeros(){
        log.info("Ingresando en el controler de listado de pasajeros");
        return new ResponseEntity<>(repo.listarPasajeros(), HttpStatus.OK);
    }

    @GetMapping("/pasajeros/{rut}")
    public ResponseEntity<?> busquedaPasajerosPorRut(@PathVariable Long rut){
        log.info("Ingresando en el controler de pasajeros por rut buscado");
        return new ResponseEntity<>(repo.buscarPasajeroPorRut(rut), HttpStatus.OK);
    }
}
