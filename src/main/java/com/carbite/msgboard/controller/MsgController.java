package com.carbite.msgboard.controller;

import com.carbite.msgboard.document.MsgDocument;
import com.carbite.msgboard.jpa.MsgJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MsgController
{
    @Autowired
    private MsgJPA msgJPA;

    @RequestMapping(value = "/index")
    public String index(Model model)
    {
        List<MsgDocument> msgs = msgJPA.findAll();
        model.addAttribute("msgs",msgs);
        return "index";
    }

    @RequestMapping(value = "/add")
    public String add(MsgDocument msg)
    {
        msgJPA.save(msg);
        return "redirect:/index";
    }

    @RequestMapping(value = "/delete")
    public String delete(String id)
    {
        System.out.println(id);
        msgJPA.deleteById(id);
        return "redirect:/index";
    }
}
