package cn.kgc.domain;

import org.apache.ibatis.annotations.Param;
import org.junit.experimental.theories.FromDataPoints;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class WoodAll {
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String time;

    private String productname;

    private Integer quantity;

    private Double unitprice;

    private Double totalprices;

    private String purchaser;

    private String cellphone;

    private String engineeringunit;

    private String deliveryaddress;

    private String name;

    private String phone;

    private String statusname;


    public WoodAll() {
    }

    public WoodAll(Integer id, String time, String productname, Integer quantity, Double unitprice, Double totalprices, String purchaser, String cellphone, String engineeringunit, String deliveryaddress, String name, String phone, String statusname) {
        this.id = id;
        this.time = time;
        this.productname = productname;
        this.quantity = quantity;
        this.unitprice = unitprice;
        this.totalprices = totalprices;
        this.purchaser = purchaser;
        this.cellphone = cellphone;
        this.engineeringunit = engineeringunit;
        this.deliveryaddress = deliveryaddress;
        this.name = name;
        this.phone = phone;
        this.statusname = statusname;
    }

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

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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
        this.purchaser = purchaser;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEngineeringunit() {
        return engineeringunit;
    }

    public void setEngineeringunit(String engineeringunit) {
        this.engineeringunit = engineeringunit;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @Override
    public String toString() {
        return "WoodAll{" +
                "id=" + id +
                ", time=" + time +
                ", productname='" + productname + '\'' +
                ", quantity=" + quantity +
                ", unitprice=" + unitprice +
                ", totalprices=" + totalprices +
                ", purchaser='" + purchaser + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", engineeringunit='" + engineeringunit + '\'' +
                ", deliveryaddress='" + deliveryaddress + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", statusname='" + statusname + '\'' +
                '}';
    }
}
