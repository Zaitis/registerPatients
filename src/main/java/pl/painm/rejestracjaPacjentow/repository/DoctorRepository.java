package pl.painm.rejestracjaPacjentow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.painm.rejestracjaPacjentow.model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {



}
