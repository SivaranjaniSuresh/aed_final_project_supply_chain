/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aishwaryavenkatesan
 */
public class purchaseOrderDirectory {
    
    private ArrayList<purchaseOrder> purchaseOrder;

    public purchaseOrderDirectory(ArrayList<purchaseOrder> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public ArrayList<purchaseOrder> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(ArrayList<purchaseOrder> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
    
    
    
}
