package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureInitiateOutputModel
 */
public class CRAccountRecoveryProcedureInitiateOutputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String accountRecoveryProcedureInitiateActionReference = null;

  private Object accountRecoveryProcedureInitiateActionRecord = null;

  private String accountRecoveryProcedureInstanceStatus = null;

  private CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountRecoveryProcedureInitiateActionReference
  **/

  public String getAccountRecoveryProcedureInitiateActionReference() {
    return accountRecoveryProcedureInitiateActionReference;
  }

  public void setAccountRecoveryProcedureInitiateActionReference(String accountRecoveryProcedureInitiateActionReference) {
    this.accountRecoveryProcedureInitiateActionReference = accountRecoveryProcedureInitiateActionReference;
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

  public CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


}

