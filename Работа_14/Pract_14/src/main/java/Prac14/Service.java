package Prac14;

import java.util.ArrayList;
import java.util.Objects;

public class Service {
    public static ArrayList<Departure> departures = new ArrayList<>();
    public static ArrayList<PostOffice> postOffices=new ArrayList<>();
    public static boolean deleteDeparture(String type){
        for (Departure departure:departures){
            if (Objects.equals(departure.getType(), type)){
                return departures.remove(departure);
            }
        }
        return false;
    }
    public static boolean deletePostOffice(String name){
        for (PostOffice postOffice:postOffices){
            if (Objects.equals(postOffice.getName(), name)){
                return postOffices.remove(name);
            }
        }
        return false;
    }

    public static boolean add(Departure temp){
        for (Departure departure:departures)
        {
            if(Objects.equals(departure,temp));
            return false;
        }
        return departures.add(temp);
    }
    public static boolean add(PostOffice temp){
        for (PostOffice postOffice:postOffices)
        {
            if(Objects.equals(postOffice,temp));
            return false;
        }
        return postOffices.add(temp);
    }

    public static Departure findDeparture(String type){
        for (Departure departure:departures){
            if (Objects.equals(departure.getType(), type)){
                return departure;
            }
        }
        return null;
    }
    public static PostOffice findPostOffice(String name){
        for (PostOffice postOffice:postOffices){
            if (Objects.equals(postOffice.getName(), name)){
                return postOffice;
            }
        }
        return null;
    }
}
