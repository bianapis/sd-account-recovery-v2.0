package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQNegotiationExchangeInputModel
 */
public class BQNegotiationExchangeInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String negotiationInstanceReference = null;

  private Object negotiationExchangeActionTaskRecord = null;

  private CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest negotiationExchangeActionRequest = null;


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
   * Get negotiationExchangeActionRequest
   * @return negotiationExchangeActionRequest
  **/

  public CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest getNegotiationExchangeActionRequest() {
    return negotiationExchangeActionRequest;
  }

  public void setNegotiationExchangeActionRequest(CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest negotiationExchangeActionRequest) {
    this.negotiationExchangeActionRequest = negotiationExchangeActionRequest;
  }


}

