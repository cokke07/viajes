package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rut;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String calle;
    private int telefono;
    private String cod_comuna;

}
