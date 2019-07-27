package net.codetip.goodssys.domain;


import java.util.Date;

public class Blog {

  private Integer id;
  private String title;
  private String content;
  private Integer uid;
  private Date createTime;
  private String label;
  private String author;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

}
