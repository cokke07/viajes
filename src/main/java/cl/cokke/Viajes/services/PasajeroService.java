package cl.cokke.Viajes.services;

import cl.cokke.Viajes.model.Pasajero;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PasajeroService {

    public List<Pasajero> listarPasajeros();
    public Pasajero buscarPasajeroPorRut(Long rut);
    public Pasajero crearPasajero(Pasajero p);
    public Pasajero actualizarPasajero(Pasajero p);
    public HttpStatus eliminarPasajeroporRut(Long rut);

}
