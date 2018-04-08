package com.example.myapp.ShoppingLists.Repository.Entity;

public class ProductEntity {
    private final long id;
    private final long groupId;
    private final long shoppingListId;
    private final long categoryId;
    private final String name;
    private final String unit;
    private final double quantity;
    private final Boolean checked;
    private final Boolean isDeleted;
    private final String lastModified;

    public ProductEntity(long id, long groupId, long shoppingListId, long categoryId, String name, String unit, double quantity, Boolean checked, Boolean isDeleted, String lastModified) {
        this.id = id;
        this.groupId = groupId;
        this.shoppingListId = shoppingListId;
        this.categoryId = categoryId;
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.checked = checked;
        this.isDeleted = isDeleted;
        this.lastModified = lastModified;
    }

    public long getId() {
        return id;
    }

    public long getGroupId() {
        return groupId;
    }

    public long getShoppingListId() {
        return shoppingListId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public Boolean getChecked() {
        return checked;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public String getLastModified() {
        return lastModified;
    }
}
