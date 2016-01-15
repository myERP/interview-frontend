package com.oneup.addressbook.shared;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {

  private String name;
  private String email;
  private String phone;
  private Date birthday;
  private ContactGroup group;

  public Contact() {}

  public Contact(String name, String email, String phone, Date birthday, ContactGroup group) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.birthday = birthday;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public ContactGroup getGroup() {
    return group;
  }

  public void setGroup(ContactGroup group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + ", birthday=" + birthday + ", group="
        + group + "]";
  }
}
