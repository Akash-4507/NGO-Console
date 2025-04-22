package model;

public class Service {
    private static int counter = 0;
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private String serviceStatus;
    private String serviceType;
    private String serviceImpact;

    public Service(String serviceName, String serviceDescription, String serviceStatus, String serviceType, String serviceImpact) {
        this.serviceId = ++counter;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceStatus = serviceStatus;
        this.serviceType = serviceType;
        this.serviceImpact = serviceImpact;
    }

    public int getServiceId() {
        return serviceId;
    }



    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceImpact() {
        return serviceImpact;
    }

    public void setServiceImpact(String serviceImpact) {
        this.serviceImpact = serviceImpact;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceStatus='" + serviceStatus + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", serviceImpact='" + serviceImpact + '\'' +
                '}';
    }
}
