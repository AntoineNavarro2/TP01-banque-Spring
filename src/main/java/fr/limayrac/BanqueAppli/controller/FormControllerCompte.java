package fr.limayrac.BanqueAppli.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.limayrac.BanqueAppli.model.Compte;

@Controller
@RequestMapping(value = "/comptes")
public class FormControllerCompte {
    private static final Logger logger = LoggerFactory.getLogger(FormControllerCompte.class);


    @GetMapping(path = "/creer")
    public String afficheForm(Model model){
        Compte compte = new Compte();
        model.addAttribute("compte",compte);
        return "inscriptionFormCompte";
    }


    @PostMapping(path ="/creer")
    public String submitForm(@ModelAttribute("compte")Compte compte){
        logger.info(compte.toString());
        return "inscriptionSuccessCompte";
    }
}
