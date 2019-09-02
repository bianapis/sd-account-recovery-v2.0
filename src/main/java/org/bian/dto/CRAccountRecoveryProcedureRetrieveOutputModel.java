package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis;
import org.bian.dto.CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveOutputModel
 */
public class CRAccountRecoveryProcedureRetrieveOutputModel   {
  private CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private String accountRecoveryProcedureRetrieveActionTaskReference = null;

  private Object accountRecoveryProcedureRetrieveActionTaskRecord = null;

  private String accountRecoveryProcedureRetrieveActionResponse = null;

  private CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportRecord = null;

  private CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Recovery Procedure instance retrieve service call 
   * @return accountRecoveryProcedureRetrieveActionTaskReference
  **/

  public String getAccountRecoveryProcedureRetrieveActionTaskReference() {
    return accountRecoveryProcedureRetrieveActionTaskReference;
  }

  public void setAccountRecoveryProcedureRetrieveActionTaskReference(String accountRecoveryProcedureRetrieveActionTaskReference) {
    this.accountRecoveryProcedureRetrieveActionTaskReference = accountRecoveryProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountRecoveryProcedureRetrieveActionTaskRecord
  **/

  public Object getAccountRecoveryProcedureRetrieveActionTaskRecord() {
    return accountRecoveryProcedureRetrieveActionTaskRecord;
  }

  public void setAccountRecoveryProcedureRetrieveActionTaskRecord(Object accountRecoveryProcedureRetrieveActionTaskRecord) {
    this.accountRecoveryProcedureRetrieveActionTaskRecord = accountRecoveryProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountRecoveryProcedureRetrieveActionResponse
  **/

  public String getAccountRecoveryProcedureRetrieveActionResponse() {
    return accountRecoveryProcedureRetrieveActionResponse;
  }

  public void setAccountRecoveryProcedureRetrieveActionResponse(String accountRecoveryProcedureRetrieveActionResponse) {
    this.accountRecoveryProcedureRetrieveActionResponse = accountRecoveryProcedureRetrieveActionResponse;
  }


  /**
   * Get accountRecoveryProcedureInstanceReportRecord
   * @return accountRecoveryProcedureInstanceReportRecord
  **/

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord getAccountRecoveryProcedureInstanceReportRecord() {
    return accountRecoveryProcedureInstanceReportRecord;
  }

  public void setAccountRecoveryProcedureInstanceReportRecord(CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportRecord) {
    this.accountRecoveryProcedureInstanceReportRecord = accountRecoveryProcedureInstanceReportRecord;
  }


  /**
   * Get accountRecoveryProcedureInstanceAnalysis
   * @return accountRecoveryProcedureInstanceAnalysis
  **/

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis getAccountRecoveryProcedureInstanceAnalysis() {
    return accountRecoveryProcedureInstanceAnalysis;
  }

  public void setAccountRecoveryProcedureInstanceAnalysis(CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysis) {
    this.accountRecoveryProcedureInstanceAnalysis = accountRecoveryProcedureInstanceAnalysis;
  }


}

