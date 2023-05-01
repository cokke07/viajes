package cl.cokke.Viajes.services;

import cl.cokke.Viajes.model.Pasajero;
import cl.cokke.Viajes.repository.PasajeroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return null;
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
