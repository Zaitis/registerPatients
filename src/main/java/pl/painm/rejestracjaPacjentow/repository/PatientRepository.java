package pl.painm.rejestracjaPacjentow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.painm.rejestracjaPacjentow.model.Patient;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
   @Query("SELECT p FROM Patient p")
    List<Patient> findAllPatients();

   @Query("SELECT p FROM Patient p where idPatient= ?1")
   Patient findPatient(Long id);

   @Query("SELECT p FROM Patient p where pesel=?1")
    Patient findPatientbyPesel(String pesel);


}


