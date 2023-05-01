package cl.cokke.Viajes.services;

import cl.cokke.Viajes.model.Pasajero;
import cl.cokke.Viajes.repository.PasajeroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PasajeroServiceImpl implements PasajeroService{
    @Autowired
    private PasajeroRepository pasajeroRepository;

    @Override
    public List<Pasajero> listarPasajeros() {
        log.info("Ingresando en el servicio de listar pasajeros");
        List<Pasajero> pasajeros = new ArrayList<>();;
        try {
            pasajeros = pasajeroRepository.findAll();
        } catch (Exception e) {
            log.error("Se produjo un error en el listado de pasajeros: {}", e.getMessage());
            throw new RuntimeException("Ha ocurrido un error al procesar los datos", e);
        }
        log.info("Finalizando el servicio de listar pasajeros. Listando: {}", pasajeros);

        return pasajeros;
    }

    @Override
    public Pasajero buscarPasajeroPorRut(Long rut) {

        Optional<Pasajero> pasajeroBuscado = pasajeroRepository.findById(rut);
        try{
            if(pasajeroBuscado.isPresent()){
                return pasajeroBuscado.get();
            }else{
                throw new EntityNotFoundException("No se encontro el pasajero Rut: " + rut);
            }
        }catch(Exception e){
            log.error("Se produjo un error en el la busqueda: {}", e.getMessage());
            throw new RuntimeException("Ha ocurrido un error al procesar los datos", e);
        }

    }

    @Override
    public Pasajero crearPasajero(Pasajero p) {
        return null;
    }

    @Override
    public Pasajero actualizarPasajero(Pasajero p) {
        return null;
    }

    @Override
    public HttpStatus eliminarPasajeroporRut(Long rut) {
        return null;
    }
}
