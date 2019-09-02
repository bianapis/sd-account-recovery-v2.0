package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord
 */
public class CRAccountRecoveryProcedureInitiateOutputModelAccountRecoveryProcedureInstanceRecord   {
  private String linkedProductInstanceReference = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType dateType = null;

  private String accountStatus = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts accountRecoveryCaseWorkProducts = null;

  private String accountRecoveryCaseResolutionSchedule = null;

  private String accountRecoveryCaseStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to any new/replacement product established during the recovery/restructuring process 
   * @return linkedProductInstanceReference
  **/

  public String getLinkedProductInstanceReference() {
    return linkedProductInstanceReference;
  }

  public void setLinkedProductInstanceReference(String linkedProductInstanceReference) {
    this.linkedProductInstanceReference = linkedProductInstanceReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status of the recovery account (e.g. pre-opened, active, dormant, pending for closing, blocked) 
   * @return accountStatus
  **/

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  /**
   * Get accountRecoveryCaseWorkProducts
   * @return accountRecoveryCaseWorkProducts
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts getAccountRecoveryCaseWorkProducts() {
    return accountRecoveryCaseWorkProducts;
  }

  public void setAccountRecoveryCaseWorkProducts(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts accountRecoveryCaseWorkProducts) {
    this.accountRecoveryCaseWorkProducts = accountRecoveryCaseWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for processing/resolution 
   * @return accountRecoveryCaseResolutionSchedule
  **/

  public String getAccountRecoveryCaseResolutionSchedule() {
    return accountRecoveryCaseResolutionSchedule;
  }

  public void setAccountRecoveryCaseResolutionSchedule(String accountRecoveryCaseResolutionSchedule) {
    this.accountRecoveryCaseResolutionSchedule = accountRecoveryCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the recovery case (e.g. in assessment, write-down, planning, negotiation, restructuring) 
   * @return accountRecoveryCaseStatus
  **/

  public String getAccountRecoveryCaseStatus() {
    return accountRecoveryCaseStatus;
  }

  public void setAccountRecoveryCaseStatus(String accountRecoveryCaseStatus) {
    this.accountRecoveryCaseStatus = accountRecoveryCaseStatus;
  }


}

