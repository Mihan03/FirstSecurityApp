package ru.feoktitsov.springcourse.FirstSecurityApp.services;

import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.feoktitsov.springcourse.FirstSecurityApp.models.Person;
import ru.feoktitsov.springcourse.FirstSecurityApp.repositories.PeopleRepository;

@Service
public class RegistrationService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void register(Person person)  {
        peopleRepository.save(person);
    }
}
