package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord
 */
public class CRAccountRecoveryProcedureRetrieveInputModelAccountRecoveryProcedureInstanceReportRecord   {
  private String accountRecoveryProcedureInstanceReportReference = null;

  private String accountRecoveryProcedureInstanceReportType = null;

  private String accountRecoveryProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return accountRecoveryProcedureInstanceReportReference
  **/

  public String getAccountRecoveryProcedureInstanceReportReference() {
    return accountRecoveryProcedureInstanceReportReference;
  }

  public void setAccountRecoveryProcedureInstanceReportReference(String accountRecoveryProcedureInstanceReportReference) {
    this.accountRecoveryProcedureInstanceReportReference = accountRecoveryProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountRecoveryProcedureInstanceReportParameters
  **/

  public String getAccountRecoveryProcedureInstanceReportParameters() {
    return accountRecoveryProcedureInstanceReportParameters;
  }

  public void setAccountRecoveryProcedureInstanceReportParameters(String accountRecoveryProcedureInstanceReportParameters) {
    this.accountRecoveryProcedureInstanceReportParameters = accountRecoveryProcedureInstanceReportParameters;
  }


}

