package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWritedownExchangeOutputModel
 */
public class BQWritedownExchangeOutputModel   {
  private String writedownExchangeActionTaskReference = null;

  private Object writedownExchangeActionTaskRecord = null;

  private String writedownExchangeActionResponse = null;

  private String writedownInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Writedown instance exchange service call 
   * @return writedownExchangeActionTaskReference
  **/

  public String getWritedownExchangeActionTaskReference() {
    return writedownExchangeActionTaskReference;
  }

  public void setWritedownExchangeActionTaskReference(String writedownExchangeActionTaskReference) {
    this.writedownExchangeActionTaskReference = writedownExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return writedownExchangeActionTaskRecord
  **/

  public Object getWritedownExchangeActionTaskRecord() {
    return writedownExchangeActionTaskRecord;
  }

  public void setWritedownExchangeActionTaskRecord(Object writedownExchangeActionTaskRecord) {
    this.writedownExchangeActionTaskRecord = writedownExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return writedownExchangeActionResponse
  **/

  public String getWritedownExchangeActionResponse() {
    return writedownExchangeActionResponse;
  }

  public void setWritedownExchangeActionResponse(String writedownExchangeActionResponse) {
    this.writedownExchangeActionResponse = writedownExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Writedown instance (e.g. accepted, rejected, verified) 
   * @return writedownInstanceStatus
  **/

  public String getWritedownInstanceStatus() {
    return writedownInstanceStatus;
  }

  public void setWritedownInstanceStatus(String writedownInstanceStatus) {
    this.writedownInstanceStatus = writedownInstanceStatus;
  }


}

