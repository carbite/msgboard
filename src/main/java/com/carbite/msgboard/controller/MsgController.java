package com.carbite.msgboard.controller;

import com.carbite.msgboard.entity.Msg;
import com.carbite.msgboard.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/index")
public class MsgController
{
    @Autowired
    private MsgService msgService;

    @RequestMapping(value = "/list")
    public List<Msg> list()
    {
        return msgService.findAllMsg();
    }

    @RequestMapping(value = "/add",method=RequestMethod.POST)
    public void add(Msg msg)
    {
        msgService.addMsg(msg);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable("id") String id)
    {
        msgService.deleteMsg(id);
    }
}
