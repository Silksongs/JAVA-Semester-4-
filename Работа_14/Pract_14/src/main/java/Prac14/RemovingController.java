package Prac14;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/remove")
public class RemovingController {
    @GetMapping("/all/departure")
    public String removeAllDepartures(){
        Service.departures = new ArrayList<>();
        System.out.println("All departures removed");
        return "All departures removed";
    }
    @GetMapping("/all/postoffice")
    public String removeAllPost(){
        Service.postOffices = new ArrayList<>();
        System.out.println("All post offices removed");
        return "All post offices removed";
    }

    @GetMapping("departure/{type}")
    public String removeDeparture(@PathVariable String type){
        boolean check = Service.deleteDeparture(type);
        if (check){
            System.out.println("Departure " + type + " has been removed");
            return "Departure " + type + " has been removed";
        } else {
            System.out.println("Departure with name " + type + " not found");
            return "Departure with name " + type + " not found";
        }
    }
    @GetMapping("postoffice/{type}")
    public String removePostOffice(@PathVariable String type){
        boolean check = Service.deletePostOffice(type);
        if (check){
            System.out.println("Post office " + type + " has been removed");
            return "Post office " + type + " has been removed";
        } else {
            System.out.println("Post office with name " + type + " not found");
            return "Post office with name " + type + " not found";
        }
    }
}
