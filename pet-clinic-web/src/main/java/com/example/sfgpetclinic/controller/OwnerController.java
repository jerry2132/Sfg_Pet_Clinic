package com.example.sfgpetclinic.controller;

import com.example.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping({"/owner"})
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner(Model model)
    {
        model.addAttribute("owner", ownerService.findAll());
        return "owner/index";
    }
}
