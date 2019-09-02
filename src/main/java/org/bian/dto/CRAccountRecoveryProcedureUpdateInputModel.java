package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureUpdateInputModel
 */
public class CRAccountRecoveryProcedureUpdateInputModel   {
  private String accountRecoveryServicingSessionReference = null;

  private String accountRecoveryProcedureInstanceReference = null;

  private CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private Object accountRecoveryProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return accountRecoveryServicingSessionReference
  **/

  public String getAccountRecoveryServicingSessionReference() {
    return accountRecoveryServicingSessionReference;
  }

  public void setAccountRecoveryServicingSessionReference(String accountRecoveryServicingSessionReference) {
    this.accountRecoveryServicingSessionReference = accountRecoveryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/

  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountRecoveryProcedureUpdateActionTaskRecord
  **/

  public Object getAccountRecoveryProcedureUpdateActionTaskRecord() {
    return accountRecoveryProcedureUpdateActionTaskRecord;
  }

  public void setAccountRecoveryProcedureUpdateActionTaskRecord(Object accountRecoveryProcedureUpdateActionTaskRecord) {
    this.accountRecoveryProcedureUpdateActionTaskRecord = accountRecoveryProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

