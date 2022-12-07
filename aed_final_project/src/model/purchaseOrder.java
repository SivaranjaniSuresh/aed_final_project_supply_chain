/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author aishwaryavenkatesan
 */
public class purchaseOrder {
    
    private int poId;
    private int userId;
    private String buyingCompany;
    private String sellingCompany;
    private String createdTime;
    private String fromLocation;
    private String toLocation;
    private String eta;
    private static final Logger LOG = Logger.getLogger(purchaseOrder.class.getName());

    public int getPoId() {
        return poId;
    }

    public void setPoId(int poId) {
        this.poId = poId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBuyingCompany() {
        return buyingCompany;
    }

    public void setBuyingCompany(String buyingCompany) {
        this.buyingCompany = buyingCompany;
    }

    public String getSellingCompany() {
        return sellingCompany;
    }

    public void setSellingCompany(String sellingCompany) {
        this.sellingCompany = sellingCompany;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public purchaseOrder(int poId, int userId, String buyingCompany, String sellingCompany, String createdTime, String fromLocation, String toLocation, String eta) {
        this.poId = poId;
        this.userId = userId;
        this.buyingCompany = buyingCompany;
        this.sellingCompany = sellingCompany;
        this.createdTime = createdTime;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.eta = eta;
    }
    
    
}
