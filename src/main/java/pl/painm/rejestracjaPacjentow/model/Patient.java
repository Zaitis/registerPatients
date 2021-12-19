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
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pesel;
    private String name;
    private String surname;
    private String kartoteka;
    private String przychodnia;
    private String kasaChorych;
    private String city;
    private String street;
    private int houseNumber;
    private int homeNumber;

    public Patient(String pesel, String name, String surname, String kartoteka, String przychodnia, String kasaChorych, String city, String street, int houseNumber, int homeNumber) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.kartoteka = kartoteka;
        this.przychodnia = przychodnia;
        this.kasaChorych = kasaChorych;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.homeNumber = homeNumber;
    }
}
