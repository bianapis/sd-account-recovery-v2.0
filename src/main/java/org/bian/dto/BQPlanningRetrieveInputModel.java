package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlanningRetrieveInputModelPlanningInstanceAnalysis;
import org.bian.dto.BQPlanningRetrieveInputModelPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveInputModel
 */
public class BQPlanningRetrieveInputModel   {
  private Object planningRetrieveActionTaskRecord = null;

  private String planningRetrieveActionRequest = null;

  private BQPlanningRetrieveInputModelPlanningInstanceReport planningInstanceReport = null;

  private BQPlanningRetrieveInputModelPlanningInstanceAnalysis planningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return planningRetrieveActionTaskRecord
  **/

  public Object getPlanningRetrieveActionTaskRecord() {
    return planningRetrieveActionTaskRecord;
  }

  public void setPlanningRetrieveActionTaskRecord(Object planningRetrieveActionTaskRecord) {
    this.planningRetrieveActionTaskRecord = planningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return planningRetrieveActionRequest
  **/

  public String getPlanningRetrieveActionRequest() {
    return planningRetrieveActionRequest;
  }

  public void setPlanningRetrieveActionRequest(String planningRetrieveActionRequest) {
    this.planningRetrieveActionRequest = planningRetrieveActionRequest;
  }


  /**
   * Get planningInstanceReport
   * @return planningInstanceReport
  **/

  public BQPlanningRetrieveInputModelPlanningInstanceReport getPlanningInstanceReport() {
    return planningInstanceReport;
  }

  public void setPlanningInstanceReport(BQPlanningRetrieveInputModelPlanningInstanceReport planningInstanceReport) {
    this.planningInstanceReport = planningInstanceReport;
  }


  /**
   * Get planningInstanceAnalysis
   * @return planningInstanceAnalysis
  **/

  public BQPlanningRetrieveInputModelPlanningInstanceAnalysis getPlanningInstanceAnalysis() {
    return planningInstanceAnalysis;
  }

  public void setPlanningInstanceAnalysis(BQPlanningRetrieveInputModelPlanningInstanceAnalysis planningInstanceAnalysis) {
    this.planningInstanceAnalysis = planningInstanceAnalysis;
  }


}

