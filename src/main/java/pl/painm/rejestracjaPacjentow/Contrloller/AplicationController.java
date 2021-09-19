package pl.painm.rejestracjaPacjentow.Contrloller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {


    @GetMapping("/index")
    public  static String goHome(){
        return "index";
    }

    @GetMapping("/adddoctor")
    public  static String goAddDoctor(){
        return "adddoctor";
    }

    @GetMapping("/addpatient")
    public  static String goAddPatient(){
        return "addpatient";
    }

    @GetMapping("/finddoctor")
    public  static String goFindDoctor(){
        return "finddoctor";
    }

    @GetMapping("/findpatient")
    public  static String goFindPatient(){
        return "findpatient";
    }

    @GetMapping("/newvisit")
    public  static String goNewVisit(){
        return "newvisit";
    }

    @GetMapping("/style.css")
    public String goStyle(){
        return "style.css";
    }


}
