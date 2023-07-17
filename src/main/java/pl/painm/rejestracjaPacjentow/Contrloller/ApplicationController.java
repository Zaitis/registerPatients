package pl.painm.rejestracjaPacjentow.Contrloller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping("/index")
    public  static String goHome(){
        return "index";
    }

    @GetMapping("/add-doctor")
    public  static String goAddDoctor(){
        return "add-doctor";
    }

    @GetMapping("/add-patient")
    public  static String goAddPatient(){
        return "add-patient";
    }

    @GetMapping("/find-doctor")
    public  static String goFindDoctor(){
        return "find-doctor";
    }

    @GetMapping("/find-patient")
    public  static String goFindPatient(){
        return "find-patient";
    }

    @GetMapping("/new-visit")
    public  static String goNewVisit(){
        return "new-visit";
    }

    @GetMapping("/style.css")
    public String goStyle(){
        return "style.css";
    }


}
