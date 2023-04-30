package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pasajeros")
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rut;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String calle;
    private int telefono;
    @ManyToOne
    @JoinColumn(name = "cod_comuna", referencedColumnName = "cod_comuna")
    private Comuna comuna;

}
