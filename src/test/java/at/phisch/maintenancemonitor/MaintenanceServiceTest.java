package at.phisch.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceServiceTest {

    @Test
    void setMaintenanceToFalse() {
        MaintenanceService service = new MaintenanceService();
        Maintenance maintenance = new Maintenance();
        maintenance.setMaintenance(false);
        service.setMaintenance(maintenance);
        assertNotNull(service.getMaintenance());
        assertFalse(service.getMaintenance().isMaintenance());
        assertNull(service.getMaintenance().getMessage());
    }

    @Test
    void setMaintenanceToTrue() {
        MaintenanceService service = new MaintenanceService();
        Maintenance maintenance = new Maintenance();
        maintenance.setMaintenance(true);
        maintenance.setMessage("test");
        service.setMaintenance(maintenance);
        assertNotNull(service.getMaintenance());
        assertTrue(service.getMaintenance().isMaintenance());
        assertEquals("test", service.getMaintenance().getMessage());
    }

   @Test
    void setMaintenanceToFalseWithMessage() {
        MaintenanceService service = new MaintenanceService();
        Maintenance maintenance = new Maintenance();
        maintenance.setMaintenance(false);
        maintenance.setMessage("test");
        service.setMaintenance(maintenance);
        assertNotNull(service.getMaintenance());
        assertFalse(service.getMaintenance().isMaintenance());
        assertNull(service.getMaintenance().getMessage());
    }
}