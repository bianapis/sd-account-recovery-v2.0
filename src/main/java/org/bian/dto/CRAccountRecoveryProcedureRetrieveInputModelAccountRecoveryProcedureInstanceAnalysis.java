package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis
 */
public class CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceAnalysis   {
  private String accountRecoveryProcedureInstanceAnalysisReference = null;

  private String accountRecoveryProcedureInstanceAnalysisReportType = null;

  private String accountRecoveryProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountRecoveryProcedureInstanceAnalysisReference
  **/

  public String getAccountRecoveryProcedureInstanceAnalysisReference() {
    return accountRecoveryProcedureInstanceAnalysisReference;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisReference(String accountRecoveryProcedureInstanceAnalysisReference) {
    this.accountRecoveryProcedureInstanceAnalysisReference = accountRecoveryProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountRecoveryProcedureInstanceAnalysisParameters
  **/

  public String getAccountRecoveryProcedureInstanceAnalysisParameters() {
    return accountRecoveryProcedureInstanceAnalysisParameters;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisParameters(String accountRecoveryProcedureInstanceAnalysisParameters) {
    this.accountRecoveryProcedureInstanceAnalysisParameters = accountRecoveryProcedureInstanceAnalysisParameters;
  }


}

