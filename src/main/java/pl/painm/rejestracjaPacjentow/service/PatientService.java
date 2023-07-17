package pl.painm.rejestracjaPacjentow.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.rejestracjaPacjentow.model.Patient;
import pl.painm.rejestracjaPacjentow.repository.PatientRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    private final PatientRepository patientRepository;

    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }


    public Patient getPatient(Long id){
        return patientRepository.findById(id).orElseThrow();
    }


    public void save(Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(Long id){ patientRepository.deleteById(id);}

    public Patient findPatientByPesel(String pesel){return patientRepository.findPatientByPesel(pesel);
    }
}
