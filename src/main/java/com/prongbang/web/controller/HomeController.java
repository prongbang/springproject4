/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prongbang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author prongbang
 */

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap model){
        
        return "login";
    }
    
    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String home(ModelMap model){
        
        model.addAttribute("message", "prongbang");
        
        return "index";
    }
    
}
