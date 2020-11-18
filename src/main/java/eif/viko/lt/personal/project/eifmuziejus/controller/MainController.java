package eif.viko.lt.personal.project.eifmuziejus.controller;

import eif.viko.lt.personal.project.eifmuziejus.entity.Gadget;
import eif.viko.lt.personal.project.eifmuziejus.service.IGadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class MainController {

  @Autowired
  IGadgetService service;

  @GetMapping("/")
  public String displayGadgets(Model model){

    var gadgets = service.findAll();
    model.addAttribute("gadgets", gadgets);
    return "index";
  }
  @RequestMapping("delete/{id}")
  public String remove(@PathVariable("id") Long id, RedirectAttributes redirectAttributes){


    Optional<Gadget> gadget = service.getItemById(id);

    service.deleteById(id);
    redirectAttributes.addFlashAttribute("message", "Item "+gadget.orElseThrow().getTitle()+ " was successfully deleted!");

    return "redirect:/";
  }




}
