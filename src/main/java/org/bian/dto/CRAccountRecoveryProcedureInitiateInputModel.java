package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureInitiateInputModel
 */
public class CRAccountRecoveryProcedureInitiateInputModel   {
  private String accountRecoveryServicingSessionReference = null;

  private Object accountRecoveryProcedureInitiateActionRecord = null;

  private String accountRecoveryProcedureInstanceStatus = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return accountRecoveryProcedureInitiateActionRecord
  **/

  public Object getAccountRecoveryProcedureInitiateActionRecord() {
    return accountRecoveryProcedureInitiateActionRecord;
  }

  public void setAccountRecoveryProcedureInitiateActionRecord(Object accountRecoveryProcedureInitiateActionRecord) {
    this.accountRecoveryProcedureInitiateActionRecord = accountRecoveryProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Recovery Procedure instance (e.g. initialised, pending, active) 
   * @return accountRecoveryProcedureInstanceStatus
  **/

  public String getAccountRecoveryProcedureInstanceStatus() {
    return accountRecoveryProcedureInstanceStatus;
  }

  public void setAccountRecoveryProcedureInstanceStatus(String accountRecoveryProcedureInstanceStatus) {
    this.accountRecoveryProcedureInstanceStatus = accountRecoveryProcedureInstanceStatus;
  }


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


}

