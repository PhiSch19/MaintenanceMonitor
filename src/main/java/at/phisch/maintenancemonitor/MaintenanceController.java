package at.phisch.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
@CrossOrigin
@ApplicationScope
public class MaintenanceController {

    private MaintenanceService maintenanceService = new MaintenanceService();

    @PostMapping("/api/maintenanceMode")
    public void setMaintenance(Maintenance maintenance) {
        maintenanceService.setMaintenance(maintenance);
    }

    @GetMapping("/api/maintenanceMode")
    public Maintenance getMaintenance() {
        return maintenanceService.getMaintenance();
    }

}
