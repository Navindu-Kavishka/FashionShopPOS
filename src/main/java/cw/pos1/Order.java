/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.pos1;


public class Order {

    private String orderId;
    private String pnum;
    private String size;
    private int qty;
    private String savestat;
    private double tAmount;

    public Order() {

    }

    public Order(String orderId, String pnum, String size, int qty, String savestat, double tAmount) {
        this.orderId = orderId;
        this.pnum = pnum;
        this.qty = qty;
        this.savestat = savestat;
        this.size = size;
        this.tAmount = tAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getPnum() {
        return pnum;
    }

    public int getQty() {
        return qty;
    }

    public String getSavestat() {
        return savestat;
    }

    public String getSize() {
        return size;
    }

    public double getTamount() {
        return tAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setSavestat(String savestat) {
        this.savestat = savestat;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTamount(double tAmount) {
        this.tAmount = tAmount;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Order ord1=(Order) obj;
//        return this.pnum==ord1.pnum;
//    }

    @Override
    public String toString() {
        return orderId+"-"+pnum+"-"+size+"-"+qty+"-"+savestat+"-"+tAmount;
    }
    
    
    
    

}
