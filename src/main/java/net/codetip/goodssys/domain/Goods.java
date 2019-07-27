package net.codetip.goodssys.domain;


import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {

  private Integer id;
  private String name;
  private BigDecimal price;
  private Integer number;
  private String miaoshu;
  @DateTimeFormat(pattern = "yyyy-MM-dd")//通过valid注解获取当前时间，我真是个小天才
  private Date createTime;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public String getMiaoshu() {
    return miaoshu;
  }

  public void setMiaoshu(String miaoshu) {
    this.miaoshu = miaoshu;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
