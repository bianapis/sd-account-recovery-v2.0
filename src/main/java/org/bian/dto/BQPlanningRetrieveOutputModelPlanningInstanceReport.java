package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveOutputModelPlanningInstanceReport
 */
public class BQPlanningRetrieveOutputModelPlanningInstanceReport   {
  private Object planningInstanceReportRecord = null;

  private String planningInstanceReportType = null;

  private String planningInstanceReportParameters = null;

  private Object planningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return planningInstanceReportRecord
  **/

  public Object getPlanningInstanceReportRecord() {
    return planningInstanceReportRecord;
  }

  public void setPlanningInstanceReportRecord(Object planningInstanceReportRecord) {
    this.planningInstanceReportRecord = planningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return planningInstanceReportType
  **/

  public String getPlanningInstanceReportType() {
    return planningInstanceReportType;
  }

  public void setPlanningInstanceReportType(String planningInstanceReportType) {
    this.planningInstanceReportType = planningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return planningInstanceReportParameters
  **/

  public String getPlanningInstanceReportParameters() {
    return planningInstanceReportParameters;
  }

  public void setPlanningInstanceReportParameters(String planningInstanceReportParameters) {
    this.planningInstanceReportParameters = planningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return planningInstanceReport
  **/

  public Object getPlanningInstanceReport() {
    return planningInstanceReport;
  }

  public void setPlanningInstanceReport(Object planningInstanceReport) {
    this.planningInstanceReport = planningInstanceReport;
  }


}

