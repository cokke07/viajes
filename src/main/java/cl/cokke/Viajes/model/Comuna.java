package cl.cokke.Viajes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comunas")
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_comuna;
    private String nombre;

}
