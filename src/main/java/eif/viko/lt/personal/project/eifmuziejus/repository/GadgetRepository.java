package eif.viko.lt.personal.project.eifmuziejus.repository;

import eif.viko.lt.personal.project.eifmuziejus.entity.Gadget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadgetRepository extends CrudRepository<Gadget, Long> { }
