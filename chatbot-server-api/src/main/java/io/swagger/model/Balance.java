package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-27T06:08:27.613Z[GMT]")


public class Balance   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("asOfDate")
  private OffsetDateTime asOfDate = null;

  @JsonProperty("lastTransactionDate")
  private OffsetDateTime lastTransactionDate = null;

  @JsonProperty("complete")
  private Boolean complete = false;

  public Balance accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  
    public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Balance quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Balance asOfDate(OffsetDateTime asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

  /**
   * Get asOfDate
   * @return asOfDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(OffsetDateTime asOfDate) {
    this.asOfDate = asOfDate;
  }

  public Balance lastTransactionDate(OffsetDateTime lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

  /**
   * Get lastTransactionDate
   * @return lastTransactionDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastTransactionDate() {
    return lastTransactionDate;
  }

  public void setLastTransactionDate(OffsetDateTime lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
  }

  public Balance complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.accountId, balance.accountId) &&
        Objects.equals(this.quantity, balance.quantity) &&
        Objects.equals(this.asOfDate, balance.asOfDate) &&
        Objects.equals(this.lastTransactionDate, balance.lastTransactionDate) &&
        Objects.equals(this.complete, balance.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, quantity, asOfDate, lastTransactionDate, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
