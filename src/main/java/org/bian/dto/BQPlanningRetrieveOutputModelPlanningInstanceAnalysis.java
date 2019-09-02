package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveOutputModelPlanningInstanceAnalysis
 */
public class BQPlanningRetrieveOutputModelPlanningInstanceAnalysis   {
  private Object planningInstanceAnalysisRecord = null;

  private String planningInstanceAnalysisReportType = null;

  private String planningInstanceAnalysisParameters = null;

  private Object planningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return planningInstanceAnalysisRecord
  **/

  public Object getPlanningInstanceAnalysisRecord() {
    return planningInstanceAnalysisRecord;
  }

  public void setPlanningInstanceAnalysisRecord(Object planningInstanceAnalysisRecord) {
    this.planningInstanceAnalysisRecord = planningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return planningInstanceAnalysisReportType
  **/

  public String getPlanningInstanceAnalysisReportType() {
    return planningInstanceAnalysisReportType;
  }

  public void setPlanningInstanceAnalysisReportType(String planningInstanceAnalysisReportType) {
    this.planningInstanceAnalysisReportType = planningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return planningInstanceAnalysisParameters
  **/

  public String getPlanningInstanceAnalysisParameters() {
    return planningInstanceAnalysisParameters;
  }

  public void setPlanningInstanceAnalysisParameters(String planningInstanceAnalysisParameters) {
    this.planningInstanceAnalysisParameters = planningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return planningInstanceAnalysisReport
  **/

  public Object getPlanningInstanceAnalysisReport() {
    return planningInstanceAnalysisReport;
  }

  public void setPlanningInstanceAnalysisReport(Object planningInstanceAnalysisReport) {
    this.planningInstanceAnalysisReport = planningInstanceAnalysisReport;
  }


}

