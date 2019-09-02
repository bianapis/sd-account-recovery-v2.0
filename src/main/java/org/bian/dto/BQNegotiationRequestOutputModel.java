package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationRequestOutputModel
 */
public class BQNegotiationRequestOutputModel   {
  private String negotiationRequestActionTaskReference = null;

  private Object negotiationRequestActionTaskRecord = null;

  private String negotiationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Negotiation instance request service call 
   * @return negotiationRequestActionTaskReference
  **/

  public String getNegotiationRequestActionTaskReference() {
    return negotiationRequestActionTaskReference;
  }

  public void setNegotiationRequestActionTaskReference(String negotiationRequestActionTaskReference) {
    this.negotiationRequestActionTaskReference = negotiationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return negotiationRequestActionTaskRecord
  **/

  public Object getNegotiationRequestActionTaskRecord() {
    return negotiationRequestActionTaskRecord;
  }

  public void setNegotiationRequestActionTaskRecord(Object negotiationRequestActionTaskRecord) {
    this.negotiationRequestActionTaskRecord = negotiationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Negotiation service request record 
   * @return negotiationRequestRecordReference
  **/

  public String getNegotiationRequestRecordReference() {
    return negotiationRequestRecordReference;
  }

  public void setNegotiationRequestRecordReference(String negotiationRequestRecordReference) {
    this.negotiationRequestRecordReference = negotiationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

