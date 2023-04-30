package cl.cokke.Viajes.repository;

import cl.cokke.Viajes.model.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRespository extends JpaRepository<Destino, Long> {

}
