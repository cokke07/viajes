package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "temporadas")
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_temporada;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "cod_destino", referencedColumnName = "cod_destino")
    private Destino destino;
}
