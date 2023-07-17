package pl.painm.rejestracjaPacjentow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.painm.rejestracjaPacjentow.model.Patient;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

  // @Query("SELECT p FROM Patient p where pesel=?1")
    Patient findPatientByPesel(String pesel);


}


