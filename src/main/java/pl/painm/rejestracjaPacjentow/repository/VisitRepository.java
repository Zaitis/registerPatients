package pl.painm.rejestracjaPacjentow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.painm.rejestracjaPacjentow.model.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
}
