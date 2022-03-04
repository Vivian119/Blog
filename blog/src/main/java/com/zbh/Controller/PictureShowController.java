package com.zbh.Controller;

import com.zbh.Service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈照片墙显示控制器〉
 *
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String picture(Model model){
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

}