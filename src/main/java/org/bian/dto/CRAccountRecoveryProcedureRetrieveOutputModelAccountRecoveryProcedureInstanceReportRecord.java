package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord
 */
public class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord   {
  private String accountRecoveryProcedureInstanceReportData = null;

  private String accountRecoveryProcedureInstanceReportType = null;

  private Object accountRecoveryProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountRecoveryProcedureInstanceReportData
  **/

  public String getAccountRecoveryProcedureInstanceReportData() {
    return accountRecoveryProcedureInstanceReportData;
  }

  public void setAccountRecoveryProcedureInstanceReportData(String accountRecoveryProcedureInstanceReportData) {
    this.accountRecoveryProcedureInstanceReportData = accountRecoveryProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountRecoveryProcedureInstanceReportType
  **/

  public String getAccountRecoveryProcedureInstanceReportType() {
    return accountRecoveryProcedureInstanceReportType;
  }

  public void setAccountRecoveryProcedureInstanceReportType(String accountRecoveryProcedureInstanceReportType) {
    this.accountRecoveryProcedureInstanceReportType = accountRecoveryProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountRecoveryProcedureInstanceReport
  **/

  public Object getAccountRecoveryProcedureInstanceReport() {
    return accountRecoveryProcedureInstanceReport;
  }

  public void setAccountRecoveryProcedureInstanceReport(Object accountRecoveryProcedureInstanceReport) {
    this.accountRecoveryProcedureInstanceReport = accountRecoveryProcedureInstanceReport;
  }


}

