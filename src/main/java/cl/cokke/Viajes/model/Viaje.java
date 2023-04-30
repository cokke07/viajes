package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_viaje;
    @ManyToOne
    @JoinColumn(name = "rut" , referencedColumnName = "rut")
    private Pasajero rut;
    @ManyToOne
    @JoinColumn(name = "cod_destino" , referencedColumnName = "cod_destino")
    private Destino destino;

}
