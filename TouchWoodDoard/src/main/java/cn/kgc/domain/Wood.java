package cn.kgc.domain;

import java.util.Date;

public class Wood {
    private Integer id;

    private String time;

    private Integer productid;

    private Integer quantity;

    private Double unitprice;

    private Double totalprices;

    private String purchaser;

    private String cellphone;

    private String engineeringunit;

    private String deliveryaddress;

    private Integer seller;

    private Integer tradingstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getTotalprices() {
        return totalprices;
    }

    public void setTotalprices(Double totalprices) {
        this.totalprices = totalprices;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser == null ? null : purchaser.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getEngineeringunit() {
        return engineeringunit;
    }

    public void setEngineeringunit(String engineeringunit) {
        this.engineeringunit = engineeringunit == null ? null : engineeringunit.trim();
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress == null ? null : deliveryaddress.trim();
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Integer getTradingstatus() {
        return tradingstatus;
    }

    public void setTradingstatus(Integer tradingstatus) {
        this.tradingstatus = tradingstatus;
    }
}