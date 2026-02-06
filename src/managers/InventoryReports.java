package managers;

import models.Equipment;

public class InventoryReports {

    public void generateInventoryReport(Equipment[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }

    public void findExpiredWarranties(Equipment[] items) {
        int i = 0;
        while (i < items.length) {
            if (items[i] != null && items[i].getWarrantyMonths() == 0) {
                System.out.println(items[i]);
            }
            i++;
        }
    }

    public void displayAssignmentsByDepartment(Equipment[] items) {
        for (Equipment e : items) {
            if (e != null) {
                System.out.println(e.getCategory() + " - " + e.getName());
            }
        }
    }

    public void calculateUtilisationRate(Equipment[] items) {
        int used = 0;

        for (Equipment e : items) {
            if (e != null && !e.isAvailable()) {
                used++;
            }
        }

        System.out.println("Utilisation Rate: " +
                (used * 100.0 / items.length) + "%");
    }

    public void generateMaintenanceSchedule(Equipment[] items) {
        int i = 0;
        do {
            if (i < items.length && items[i] != null) {
                System.out.println("Scheduled maintenance for: " +
                        items[i].getName());
            }
            i++;
        } while (i < items.length);
    }
}
