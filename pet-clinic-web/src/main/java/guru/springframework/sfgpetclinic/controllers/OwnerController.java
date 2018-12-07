package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author David Mojicevic on 12/7/18.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {


    @RequestMapping({"", "/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
