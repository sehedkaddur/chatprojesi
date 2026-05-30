package repository;
import model.Mesaj;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MesajRepository extends JpaRepository<Mesaj, Long> { }