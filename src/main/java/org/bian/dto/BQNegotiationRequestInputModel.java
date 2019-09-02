package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNegotiationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQNegotiationRequestInputModel
 */
public class BQNegotiationRequestInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String negotiationInstanceReference = null;

  private Object negotiationRequestActionTaskRecord = null;

  private BQNegotiationRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQNegotiationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQNegotiationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

