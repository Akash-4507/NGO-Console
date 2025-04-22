package Repositories;

import model.Event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventDb {
    private static final List<Event> events = new ArrayList<Event>();

    public String addEventDb(Event event) {
        events.add(event);
        return " added successfully";
    }


    public String deleteEventByIdDb(int id) {
        Iterator<Event> iterator = events.iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.getE_id() == id) {
                iterator.remove();
                return "Event deleted successfully.";
            }
        }
        return "Event ID not found.";
    }



    public String updateEventByIdDb(int id,String e_name, String e_description, String e_location, String e_date, String e_time) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getE_id() == id) {
                events.get(i).setE_name(e_name);
                events.get(i).setE_description(e_description);
                events.get(i).setE_location(e_location);
                events.get(i).setE_date(e_date);
                events.get(i).setE_time(e_time);
                return "Event updated successfully.";
            }
        }
        return "Event ID not found.";
    }



    public List<Event> getAllEventsDb() {
        return events;
    }
}
