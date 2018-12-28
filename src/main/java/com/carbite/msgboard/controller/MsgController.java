package com.carbite.msgboard.controller;

import com.carbite.msgboard.dao.impl.MsgDAOImpl;
import com.carbite.msgboard.document.MsgDocument;
import com.carbite.msgboard.dao.MsgDAO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MsgController
{
    @Autowired
    private MsgDAO msgDAO;

    @RequestMapping(value = "/index")
    public String index(Model model)
    {
        List<MsgDocument> msgs = msgDAO.findAll();
        model.addAttribute("msgs",msgs);
        return "index";
    }

    @RequestMapping(value = "/add")
    public String add(MsgDocument msg)
    {
        msgDAO.saveMsg(msg);
        return "redirect:/index";
    }

    @RequestMapping(value = "/delete")
    public String delete(String id)
    {
        System.out.println(id);
        msgDAO.deleteById(id);
        return "redirect:/index";
    }
}
