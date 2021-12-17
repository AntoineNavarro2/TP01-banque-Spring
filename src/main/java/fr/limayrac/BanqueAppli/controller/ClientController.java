package fr.limayrac.BanqueAppli.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/client", method = RequestMethod.GET)
public class ClientController {

    private static final Logger logger = LoggerFactory.getLogger(ComptesController.class);


    @RequestMapping(path = "/lister")
    public ModelAndView ListeCompte(HttpServletRequest req , HttpServletResponse res){
        logger.info("Liste des comptes!");

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("Viglienco","Angel");
        model.put("Navarro","Antoine");
        model.put("Smith","Joe");

        return new ModelAndView("listerclient","data",model);
    }

    @RequestMapping(path = "/lister/Antoine")
    public ModelAndView DetailCompte(HttpServletRequest req , HttpServletResponse res){
        logger.info("Liste des comptes!");

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("Navarro","Antoine de la vega");


        return new ModelAndView("detailclient","data",model);
    }




}
