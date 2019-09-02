package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNegotiationUpdateInputModelNegotiationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQNegotiationUpdateInputModel
 */
public class BQNegotiationUpdateInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String negotiationInstanceReference = null;

  private BQNegotiationUpdateInputModelNegotiationInstanceRecord negotiationInstanceRecord = null;

  private Object negotiationUpdateActionTaskRecord = null;

  private String negotiationUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/

  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Negotiation instance 
   * @return negotiationInstanceReference
  **/

  public String getNegotiationInstanceReference() {
    return negotiationInstanceReference;
  }

  public void setNegotiationInstanceReference(String negotiationInstanceReference) {
    this.negotiationInstanceReference = negotiationInstanceReference;
  }


  /**
   * Get negotiationInstanceRecord
   * @return negotiationInstanceRecord
  **/

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord getNegotiationInstanceRecord() {
    return negotiationInstanceRecord;
  }

  public void setNegotiationInstanceRecord(BQNegotiationUpdateInputModelNegotiationInstanceRecord negotiationInstanceRecord) {
    this.negotiationInstanceRecord = negotiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return negotiationUpdateActionTaskRecord
  **/

  public Object getNegotiationUpdateActionTaskRecord() {
    return negotiationUpdateActionTaskRecord;
  }

  public void setNegotiationUpdateActionTaskRecord(Object negotiationUpdateActionTaskRecord) {
    this.negotiationUpdateActionTaskRecord = negotiationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return negotiationUpdateActionRequest
  **/

  public String getNegotiationUpdateActionRequest() {
    return negotiationUpdateActionRequest;
  }

  public void setNegotiationUpdateActionRequest(String negotiationUpdateActionRequest) {
    this.negotiationUpdateActionRequest = negotiationUpdateActionRequest;
  }


}

