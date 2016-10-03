package hu.tb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by Tivadar Bocz on 2016.10.03..
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }
}
