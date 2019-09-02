package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis
 */
public class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis   {
  private String accountRecoveryProcedureInstanceAnalysisData = null;

  private String accountRecoveryProcedureInstanceAnalysisReportType = null;

  private Object accountRecoveryProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountRecoveryProcedureInstanceAnalysisData
  **/

  public String getAccountRecoveryProcedureInstanceAnalysisData() {
    return accountRecoveryProcedureInstanceAnalysisData;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisData(String accountRecoveryProcedureInstanceAnalysisData) {
    this.accountRecoveryProcedureInstanceAnalysisData = accountRecoveryProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountRecoveryProcedureInstanceAnalysisReportType
  **/

  public String getAccountRecoveryProcedureInstanceAnalysisReportType() {
    return accountRecoveryProcedureInstanceAnalysisReportType;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisReportType(String accountRecoveryProcedureInstanceAnalysisReportType) {
    this.accountRecoveryProcedureInstanceAnalysisReportType = accountRecoveryProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountRecoveryProcedureInstanceAnalysisReport
  **/

  public Object getAccountRecoveryProcedureInstanceAnalysisReport() {
    return accountRecoveryProcedureInstanceAnalysisReport;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisReport(Object accountRecoveryProcedureInstanceAnalysisReport) {
    this.accountRecoveryProcedureInstanceAnalysisReport = accountRecoveryProcedureInstanceAnalysisReport;
  }


}

