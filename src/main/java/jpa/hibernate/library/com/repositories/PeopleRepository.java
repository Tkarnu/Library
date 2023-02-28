package jpa.hibernate.library.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jpa.hibernate.library.com.models.Persona;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Persona, Integer> {
    Optional<Persona> findByFullName(String fullName);
}
