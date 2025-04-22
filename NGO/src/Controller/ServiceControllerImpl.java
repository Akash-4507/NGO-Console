package Controller;

import Repositories.ServiceDb;
import model.Service;

import java.util.List;

public class ServiceControllerImpl implements ServiceController {

    private static final ServiceDb serviceDb = new ServiceDb();

    @Override
    public String addService(Service service) {
        return serviceDb.addServiceDb(service);

    }

    @Override
    public String editService(int id,String serviceName,String serviceDescription,String serviceStatus,String serviceType,String serviceImpact) {
        return serviceDb.updateServiceById(id,serviceName,serviceDescription,serviceStatus,serviceType,serviceImpact);
    }

    @Override
    public String deleteService(int id) {
        return serviceDb.deleteServiceByIdDb(id);
    }

    @Override
    public List<Service> getServices() {
       return serviceDb.getAllServicesDb();

    }
}
