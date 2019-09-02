package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQWritedownExchangeInputModel
 */
public class BQWritedownExchangeInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String writedownInstanceReference = null;

  private Object writedownExchangeActionTaskRecord = null;

  private CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest writedownExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Writedown instance 
   * @return writedownInstanceReference
  **/

  public String getWritedownInstanceReference() {
    return writedownInstanceReference;
  }

  public void setWritedownInstanceReference(String writedownInstanceReference) {
    this.writedownInstanceReference = writedownInstanceReference;
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
   * Get writedownExchangeActionRequest
   * @return writedownExchangeActionRequest
  **/

  public CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest getWritedownExchangeActionRequest() {
    return writedownExchangeActionRequest;
  }

  public void setWritedownExchangeActionRequest(CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest writedownExchangeActionRequest) {
    this.writedownExchangeActionRequest = writedownExchangeActionRequest;
  }


}

