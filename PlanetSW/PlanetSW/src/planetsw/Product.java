package planetsw;

import java.util.Scanner;

public class Product 
{
    
    static int it=0;
    int ProductID=++it;
    private String name;
    private double price;
    private String category;
    private Brand BrandName;
    private boolean checkNormal;
    private int viewCounter=0;
    private int buyCounter=0;
    private int amount;
    private int OwnerID;
    private int storeID;
    

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrandName(Brand BrandName) {
        this.BrandName = BrandName;
    }

    public void setCheckNormal(boolean checkNormal) {
        this.checkNormal = checkNormal;
    }

    public void setViewCounter(int viewCounter) {
        this.viewCounter = viewCounter;
    }

    public void setBuyCounter(int buyCounter) {
        this.buyCounter = buyCounter;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Brand getBrandName() {
        return BrandName;
    }

    public boolean isCheckNormal() {
        return checkNormal;
    }

    public int getViewCounter() {
        return viewCounter;
    }

    public int getBuyCounter() {
        return buyCounter;
    }

    public int getAmount() {
        return amount;
    }

    public int getProductID() {
        return ProductID;
    }
    
}
