package Controller;

import model.Service;

import java.util.List;

public interface ServiceController {

    String addService(Service service);
    String editService(int id,String serviceName,String serviceDescription,String serviceStatus,String serviceType,String serviceImpact);
    String deleteService(int id);
    List<Service> getServices();

}
