package Controller;

import model.Event;

import java.util.List;

public interface EventController {

    String addEvent(Event event);
    String deleteEvent(int id);
    String editEvent(int id,String e_name, String e_description, String e_location, String e_date, String e_time);
    List<Event> getEvents();



}
