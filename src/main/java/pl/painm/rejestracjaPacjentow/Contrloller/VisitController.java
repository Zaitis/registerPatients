package pl.painm.rejestracjaPacjentow.Contrloller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.painm.rejestracjaPacjentow.service.VisitService;

@Controller
public class VisitController {

    @Autowired
    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }


}
