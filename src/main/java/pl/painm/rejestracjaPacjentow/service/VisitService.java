package pl.painm.rejestracjaPacjentow.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.rejestracjaPacjentow.repository.VisitRepository;

@Service
@RequiredArgsConstructor
public class VisitService {

    @Autowired
    private final VisitRepository visitRepository;
}
