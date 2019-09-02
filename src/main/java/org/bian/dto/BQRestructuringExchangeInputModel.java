package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQRestructuringExchangeInputModel
 */
public class BQRestructuringExchangeInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String restructuringInstanceReference = null;

  private Object restructuringExchangeActionTaskRecord = null;

  private CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest restructuringExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring instance 
   * @return restructuringInstanceReference
  **/

  public String getRestructuringInstanceReference() {
    return restructuringInstanceReference;
  }

  public void setRestructuringInstanceReference(String restructuringInstanceReference) {
    this.restructuringInstanceReference = restructuringInstanceReference;
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
   * Get restructuringExchangeActionRequest
   * @return restructuringExchangeActionRequest
  **/

  public CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest getRestructuringExchangeActionRequest() {
    return restructuringExchangeActionRequest;
  }

  public void setRestructuringExchangeActionRequest(CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest restructuringExchangeActionRequest) {
    this.restructuringExchangeActionRequest = restructuringExchangeActionRequest;
  }


}

