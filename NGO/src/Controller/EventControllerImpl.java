package Controller;

import Repositories.EventDb;
import model.Event;

import java.util.List;

public class EventControllerImpl implements EventController {

    private static final EventDb eventDb = new EventDb();

    @Override
    public String addEvent(Event event) {
        return eventDb.addEventDb(event);
    }

    @Override
    public String deleteEvent(int id) {
        return eventDb.deleteEventByIdDb(id);
    }

    @Override
    public String editEvent(int id,String e_name, String e_description, String e_location, String e_date, String e_time) {
        return eventDb.updateEventByIdDb(id,e_name, e_description, e_location, e_date, e_time );
    }

    @Override
    public List<Event> getEvents() {
        return eventDb.getAllEventsDb();
    }
}
