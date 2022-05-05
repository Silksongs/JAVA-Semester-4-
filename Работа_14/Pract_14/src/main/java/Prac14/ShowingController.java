package Prac14;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowingController {
    @GetMapping("/all/departure")
    public String allDepartures(){
        System.out.println("All departures show");
        return Service.departures.toString();
    }
    @GetMapping("/all/postoffice")
    public String allPostOffices(){
        System.out.println("All post offices show");
        return Service.departures.toString();
    }

    @GetMapping("departure/{type}")
    public String showDeparture(@PathVariable String type){
        Departure departure = Service.findDeparture(type);
        if (departure == null){
            System.out.println("Departure " + type + " not found");
            return "Departure " + type + " not found";
        }
        System.out.println("departure " + departure.getType() + " show");
        return departure.toString();
    }
    @GetMapping("postoffice/{type}")
    public String showPostOffice(@PathVariable String name){
        PostOffice postOffice = Service.findPostOffice(name);
        if (postOffice== null){
            System.out.println("Departure " + name + " not found");
            return "Departure " + name + " not found";
        }
        System.out.println("departure " + postOffice.getName() + " show");
        return postOffice.toString();
    }
}
