package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis;
import org.bian.dto.CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveInputModel
 */
public class CRAccountRecoveryProcedureRetrieveInputModel   {
  private Object accountRecoveryProcedureRetrieveActionTaskRecord = null;

  private String accountRecoveryProcedureRetrieveActionRequest = null;

  private CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportRecord = null;

  private CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountRecoveryProcedureRetrieveActionRequest
  **/

  public String getAccountRecoveryProcedureRetrieveActionRequest() {
    return accountRecoveryProcedureRetrieveActionRequest;
  }

  public void setAccountRecoveryProcedureRetrieveActionRequest(String accountRecoveryProcedureRetrieveActionRequest) {
    this.accountRecoveryProcedureRetrieveActionRequest = accountRecoveryProcedureRetrieveActionRequest;
  }


  /**
   * Get accountRecoveryProcedureInstanceReportRecord
   * @return accountRecoveryProcedureInstanceReportRecord
  **/

  public CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord getAccountRecoveryProcedureInstanceReportRecord() {
    return accountRecoveryProcedureInstanceReportRecord;
  }

  public void setAccountRecoveryProcedureInstanceReportRecord(CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportRecord) {
    this.accountRecoveryProcedureInstanceReportRecord = accountRecoveryProcedureInstanceReportRecord;
  }


  /**
   * Get accountRecoveryProcedureInstanceAnalysis
   * @return accountRecoveryProcedureInstanceAnalysis
  **/

  public CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis getAccountRecoveryProcedureInstanceAnalysis() {
    return accountRecoveryProcedureInstanceAnalysis;
  }

  public void setAccountRecoveryProcedureInstanceAnalysis(CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysis) {
    this.accountRecoveryProcedureInstanceAnalysis = accountRecoveryProcedureInstanceAnalysis;
  }


}

