package pl.painm.rejestracjaPacjentow.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pesel;
    private String firstName;
    private String lastName;
    private String patientFile;
    private String clinic;
    private String healthInsurance;
    private String city;
    private String street;
    private int houseNumber;
    private int homeNumber;
}
