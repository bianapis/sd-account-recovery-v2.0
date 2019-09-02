package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationExchangeOutputModel
 */
public class BQNegotiationExchangeOutputModel   {
  private String negotiationExchangeActionTaskReference = null;

  private Object negotiationExchangeActionTaskRecord = null;

  private String negotiationExchangeActionResponse = null;

  private String negotiationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Negotiation instance exchange service call 
   * @return negotiationExchangeActionTaskReference
  **/

  public String getNegotiationExchangeActionTaskReference() {
    return negotiationExchangeActionTaskReference;
  }

  public void setNegotiationExchangeActionTaskReference(String negotiationExchangeActionTaskReference) {
    this.negotiationExchangeActionTaskReference = negotiationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return negotiationExchangeActionTaskRecord
  **/

  public Object getNegotiationExchangeActionTaskRecord() {
    return negotiationExchangeActionTaskRecord;
  }

  public void setNegotiationExchangeActionTaskRecord(Object negotiationExchangeActionTaskRecord) {
    this.negotiationExchangeActionTaskRecord = negotiationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return negotiationExchangeActionResponse
  **/

  public String getNegotiationExchangeActionResponse() {
    return negotiationExchangeActionResponse;
  }

  public void setNegotiationExchangeActionResponse(String negotiationExchangeActionResponse) {
    this.negotiationExchangeActionResponse = negotiationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Negotiation instance (e.g. accepted, rejected, verified) 
   * @return negotiationInstanceStatus
  **/

  public String getNegotiationInstanceStatus() {
    return negotiationInstanceStatus;
  }

  public void setNegotiationInstanceStatus(String negotiationInstanceStatus) {
    this.negotiationInstanceStatus = negotiationInstanceStatus;
  }


}

