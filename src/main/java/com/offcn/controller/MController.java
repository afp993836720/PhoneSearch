package com.offcn.controller;

import com.offcn.pojo.Mobile;
import com.offcn.service.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author afp
 * @date 2018/10/11--22:10
 */
@Controller
public class MController {
    @Autowired
    private MService mService;
    @RequestMapping("/find")
    public String find(String number, Model model){
        Mobile mobile = mService.find(number);
        String msg="";

        if(mobile!=null){
            msg="你查询的号码:"+number+" 归属于:"+mobile.getArea()+" 属于:"+mobile.getType();
        }

        model.addAttribute("msg", msg);

        return "mobile";

    }


}
