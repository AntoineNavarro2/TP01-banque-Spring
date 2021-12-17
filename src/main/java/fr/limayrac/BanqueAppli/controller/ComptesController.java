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
@RequestMapping(value = "/comptes", method = RequestMethod.GET)
public class ComptesController {

    private static final Logger logger = LoggerFactory.getLogger(ComptesController.class);


    @RequestMapping(path = "/lister")
    public ModelAndView ListeCompte(HttpServletRequest req , HttpServletResponse res){
        logger.info("Liste des comptes!");

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("1123","2300");
        model.put("1124","2400");
        model.put("1125","2500");

        return new ModelAndView("lister","data",model);
    }

    @RequestMapping(path = "/lister/1123")
    public ModelAndView DetailCompte(HttpServletRequest req , HttpServletResponse res){
        logger.info("Liste des comptes!");

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("1123-21545","2300$");


        return new ModelAndView("detail","data",model);
    }




}
