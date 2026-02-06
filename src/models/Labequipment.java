package models;

public class LabEquipment extends InventoryItem {

    private String labName;
    private String calibrationDate;

    public LabEquipment(String id, String name, boolean isAvailable,
                        String labName, String calibrationDate) {

        super(id, name, isAvailable);
        this.labName = labName;
        this.calibrationDate = calibrationDate;
    }

    @Override
    public String getItemType() {
        return "LabEquipment";
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Lab: " + labName +
               ", Calibration Date: " + calibrationDate;
    }
}
