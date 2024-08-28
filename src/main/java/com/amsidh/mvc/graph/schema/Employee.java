package com.amsidh.mvc.graph.schema;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class Employee {
  private Integer id;

  private String name;

  private String emailId;

  public Employee() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  @Override
  public String toString() {
    return "Employee{id='" + id + "', name='" + name + "', emailId='" + emailId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee that = (Employee) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(emailId, that.emailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, emailId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Integer id;

    private String name;

    private String emailId;

    public Employee build() {
      Employee result = new Employee();
      result.id = this.id;
      result.name = this.name;
      result.emailId = this.emailId;
      return result;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder emailId(String emailId) {
      this.emailId = emailId;
      return this;
    }
  }
}
