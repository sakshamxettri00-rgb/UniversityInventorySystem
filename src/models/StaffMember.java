package models;

public class StaffMember {

    private int staffId;
    private String name;
    private String email;
    private Equipment[] assignedEquipment;
    private int count;

    public StaffMember(int staffId, String name, String email) {
        this.staffId = staffId;
        this.name = name;
        this.email = email;
        this.assignedEquipment = new Equipment[5];
        this.count = 0;
    }

    public int getAssignedEquipmentCount() {
        return count;
    }

    public Equipment[] getAssignedEquipment() {
        return assignedEquipment;
    }

    public void addAssignedEquipment(Equipment equipment) {
        if (count < assignedEquipment.length) {
            assignedEquipment[count] = equipment;
            count++;
        }
    }

    public void removeAssignedEquipment(String assetId) {
        for (int i = 0; i < count; i++) {
            if (assignedEquipment[i].getAssetId().equals(assetId)) {
                assignedEquipment[i] = assignedEquipment[count - 1];
                assignedEquipment[count - 1] = null;
                count--;
                break;
            }
        }
    }
}
