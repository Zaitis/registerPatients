package pl.painm.rejestracjaPacjentow.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.rejestracjaPacjentow.model.Doctor;
import pl.painm.rejestracjaPacjentow.repository.DoctorRepository;

@Service
@RequiredArgsConstructor
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;


    public void  saveAs(Doctor doctor) {
        doctorRepository.save(doctor);

    }
}

