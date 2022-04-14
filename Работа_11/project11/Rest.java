package project11;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Rest {
    @RequestMapping("/actuator")
    public @ResponseBody String rest(){
        return "rest";
    }
}
