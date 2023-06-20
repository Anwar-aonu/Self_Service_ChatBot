package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Tag;
import io.swagger.model.Customer_old.StatusEnum;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer_old
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-27T06:08:27.613Z[GMT]")

@Entity
@Table(name = "customer")
public class Customer  {

	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("account")
	private String account = null;

	@JsonProperty("city")
	private String city = null;

	@JsonProperty("balance")
	private Long balance = null;

	@JsonProperty("status")
	private String status = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}



	public Customer status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * pet status in the store
	 * @return status
	 **/
	@ApiModelProperty(value = "Customer Status")

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + ", city=" + city + ", balance="
				+ balance + ", status=" + status + "]";
	}


	/*
	 * @Override public String toString() { return "Customer [id=" + id + ", name="
	 * + name + ", account=" + account + ", city=" + city + ", balance=" + balance +
	 * "]"; }
	 */
	
	

}