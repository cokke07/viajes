package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "destinos")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_destino;
    private String descripcion;
}
