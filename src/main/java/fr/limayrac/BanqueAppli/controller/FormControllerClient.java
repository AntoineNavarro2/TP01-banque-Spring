package fr.limayrac.BanqueAppli.controller;


import fr.limayrac.BanqueAppli.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/client")
public class FormControllerClient {
        private static final Logger logger = LoggerFactory.getLogger(fr.limayrac.BanqueAppli.controller.FormControllerClient.class);


        @GetMapping(path = "/creer")
        public String afficheForm(Model model){
            Client user = new Client();
            model.addAttribute("user",user);
            String[] listeProfession={"boulanger","patissier","cuisinier","plombier"};
            model.addAttribute("listeProfession",listeProfession);
            return "inscriptionFormClient";
        }


        @PostMapping(path ="/creer")
        public String submitForm(@ModelAttribute("user")Client user){
            logger.info(user.toString());
            return "inscriptionSuccessClient";
        }
}
