package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringExchangeOutputModel
 */
public class BQRestructuringExchangeOutputModel   {
  private String restructuringExchangeActionTaskReference = null;

  private Object restructuringExchangeActionTaskRecord = null;

  private String restructuringExchangeActionResponse = null;

  private String restructuringInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Restructuring instance exchange service call 
   * @return restructuringExchangeActionTaskReference
  **/

  public String getRestructuringExchangeActionTaskReference() {
    return restructuringExchangeActionTaskReference;
  }

  public void setRestructuringExchangeActionTaskReference(String restructuringExchangeActionTaskReference) {
    this.restructuringExchangeActionTaskReference = restructuringExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return restructuringExchangeActionTaskRecord
  **/

  public Object getRestructuringExchangeActionTaskRecord() {
    return restructuringExchangeActionTaskRecord;
  }

  public void setRestructuringExchangeActionTaskRecord(Object restructuringExchangeActionTaskRecord) {
    this.restructuringExchangeActionTaskRecord = restructuringExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return restructuringExchangeActionResponse
  **/

  public String getRestructuringExchangeActionResponse() {
    return restructuringExchangeActionResponse;
  }

  public void setRestructuringExchangeActionResponse(String restructuringExchangeActionResponse) {
    this.restructuringExchangeActionResponse = restructuringExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Restructuring instance (e.g. accepted, rejected, verified) 
   * @return restructuringInstanceStatus
  **/

  public String getRestructuringInstanceStatus() {
    return restructuringInstanceStatus;
  }

  public void setRestructuringInstanceStatus(String restructuringInstanceStatus) {
    this.restructuringInstanceStatus = restructuringInstanceStatus;
  }


}

