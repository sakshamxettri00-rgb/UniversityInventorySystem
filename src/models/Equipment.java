package models;

import java.util.Objects;

public class Equipment extends InventoryItem {

    private String assetId;
    private String brand;
    private int warrantyMonths;
    private String category;

    public Equipment(String id, String name, boolean isAvailable,
                     String assetId, String brand,
                     int warrantyMonths, String category) {

        super(id, name, isAvailable);
        this.assetId = assetId;
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
        this.category = category;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public String getCategory() {
        return category;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getItemType() {
        return "Equipment";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Equipment)) return false;
        Equipment other = (Equipment) obj;
        return Objects.equals(this.assetId, other.assetId);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Asset ID: " + assetId +
               ", Brand: " + brand +
               ", Warranty: " + warrantyMonths +
               ", Category: " + category;
    }
}
