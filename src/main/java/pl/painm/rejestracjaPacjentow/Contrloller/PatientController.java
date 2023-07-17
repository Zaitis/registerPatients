package pl.painm.rejestracjaPacjentow.Contrloller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.painm.rejestracjaPacjentow.model.Patient;
import pl.painm.rejestracjaPacjentow.service.PatientService;


@Controller
public class PatientController {
    @Autowired
    PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


@RequestMapping(value = "/patient", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public String  addPatient(Patient patient){
     patient.setPatientFile("BRAK");
        patientService.save(patient);
    System.out.println("Pacjent dodany do bazy danych");
    return "findpatient";

}


    @GetMapping("/patients")
    public String goPatients(Model model){
        model.addAttribute("patients", patientService.getPatients());
        patientService.getPatients();
        return "patients";
    }

@GetMapping("/patients/{id}")
public Patient getPacjent(@PathVariable("id") Long id){
    System.out.println(patientService.getPatient(id));
    return patientService.getPatient(id);
     }


@DeleteMapping("/patients/{id}")
public void deletePacjent(@PathVariable("id") Long id){
   patientService.deletePatient(id);
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String searchPatient(@RequestParam(name= "pesel") String pesel, Model md){
    System.out.println( patientService.findPatientByPesel(pesel));
        md.addAttribute("patients", patientService.findPatientByPesel(pesel));
        System.out.println(md.getAttribute("patients"));
        return "patients";
}
}
