package Prac14;

import org.springframework.web.bind.annotation.*;

import java.sql.Date;


@RestController
@RequestMapping("/add")
public class AddingController {
    @GetMapping("/departure/{typeDate}")
    public String addDeparture(@PathVariable String typeDate){
        String[] splitparameters=typeDate.split("_");
        Departure departure = new Departure(splitparameters[0],new Date(Integer.parseInt(splitparameters[1]),Integer.parseInt(splitparameters[2]),Integer.parseInt(splitparameters[3])));
        boolean check = Service.add(departure);
        if (check){
            System.out.println("Departure " + departure.getType() + " created");
            return "Departure " + departure.getType() + " created";
        } else {
            System.out.println("Departure with this name already exists");
            return "Departure with this name already exists";
        }
    }
    @GetMapping("/postoffice/{post}")
    public String addPost(@PathVariable String post){
        String[] splitparameters=post.split("_");
        PostOffice postOffice=new PostOffice(splitparameters[0],splitparameters[1]);
        boolean check = Service.add(postOffice);
        if (check){
            System.out.println("PostOffice with name " + postOffice.getName() + " created");
            return "PostOffice with name " + postOffice.getName() + " created";
        } else {
            System.out.println("PostOffice with this name already exists");
            return "PostOffice with this name already exists";
        }
    }

}
