package Repositories;

import model.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceDb {
    private static final List<Service> services = new ArrayList<Service>();

    public String addServiceDb(Service service) {
        services.add(service);
        return "Service added";
    }

    public String updateServiceById(int id,String serviceName,String serviceDescription,String serviceStatus,String serviceType,String serviceImpact) {
        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getServiceId() == id) {
               services.get(i).setServiceName(serviceName);
               services.get(i).setServiceDescription(serviceDescription);
               services.get(i).setServiceStatus(serviceStatus);
               services.get(i).setServiceType(serviceType);
               services.get(i).setServiceImpact(serviceImpact);

                return "Service updated successfully.";
            }
        }
        return "Service not found.";
    }


    public String deleteServiceByIdDb(int id) {
        for (Service service : services) {
            if (service.getServiceId() == id) {
                services.remove(service);
                return "Service deleted successfully.";
            }
        }
        return "Service ID not found.";
    }




    public List<Service> getAllServicesDb() {
        return services;
    }
}
