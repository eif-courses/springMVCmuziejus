package eif.viko.lt.personal.project.eifmuziejus.service;

import eif.viko.lt.personal.project.eifmuziejus.entity.Gadget;
import eif.viko.lt.personal.project.eifmuziejus.repository.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GadgetService implements IGadgetService{

  @Autowired
  GadgetRepository repository;

  @Override
  public List<Gadget> findAll() {
    return (List<Gadget>) repository.findAll();
  }

  @Override
  public void save(Gadget gadget) {
    repository.save(gadget);
  }

  @Override
  public void deleteById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public Optional<Gadget> getItemById(Long id) {
    return repository.findById(id);
  }
}
