package at.phisch.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
@CrossOrigin
@ApplicationScope
public class MaintenanceController {

    private MaintenanceService maintenanceService = new MaintenanceService();

    @PostMapping
    public void setMaintenance(Maintenance maintenance) {
        maintenanceService.setMaintenance(maintenance);
    }

}
