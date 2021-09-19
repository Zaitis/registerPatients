package pl.painm.rejestracjaPacjentow.Contrloller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.painm.rejestracjaPacjentow.model.Doctor;
import pl.painm.rejestracjaPacjentow.service.DoctorService;

@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/doctor", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String addDoctor(Doctor doctor){
        System.out.println(doctor);
        doctorService.saveAs(doctor);
        return "/index";
}
}
