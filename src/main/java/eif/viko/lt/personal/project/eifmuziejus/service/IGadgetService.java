package eif.viko.lt.personal.project.eifmuziejus.service;

import eif.viko.lt.personal.project.eifmuziejus.entity.Gadget;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IGadgetService {
  List<Gadget> findAll();
  void save(Gadget gadget);
  void deleteById(Long id);
  Optional<Gadget> getItemById(Long id);
}
