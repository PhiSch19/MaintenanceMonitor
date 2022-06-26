package at.phisch.maintenancemonitor;

import org.springframework.web.context.annotation.ApplicationScope;

public class MaintenanceService {

    private Maintenance maintenance = new Maintenance();

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

}
