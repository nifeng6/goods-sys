package net.codetip.goodssys.domain;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Ugoods {

  private Integer id;
  private String user;
  private String goods;
  private String address;
  private String phone;
  private String price;
  @DateTimeFormat(pattern = "yyyy-MM-dd")//通过valid注解获取当前时间，我真是个小天才
  private Date dateTime;
  private Integer uid;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public String getGoods() {
    return goods;
  }

  public void setGoods(String goods) {
    this.goods = goods;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

}
