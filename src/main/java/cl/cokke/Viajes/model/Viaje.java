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
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_viaje;
    private String rut;
    private String cod_destino;

}
