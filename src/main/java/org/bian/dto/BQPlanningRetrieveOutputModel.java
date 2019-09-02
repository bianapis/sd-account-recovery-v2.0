package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlanningRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.BQPlanningRetrieveOutputModelPlanningInstanceAnalysis;
import org.bian.dto.BQPlanningRetrieveOutputModelPlanningInstanceReport;
import org.bian.dto.BQPlanningUpdateInputModelPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveOutputModel
 */
public class BQPlanningRetrieveOutputModel   {
  private BQPlanningRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private BQPlanningUpdateInputModelPlanningInstanceRecord planningInstanceRecord = null;

  private String planningRetrieveActionTaskReference = null;

  private Object planningRetrieveActionTaskRecord = null;

  private String planningRetrieveActionResponse = null;

  private BQPlanningRetrieveOutputModelPlanningInstanceReport planningInstanceReport = null;

  private BQPlanningRetrieveOutputModelPlanningInstanceAnalysis planningInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public BQPlanningRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(BQPlanningRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * Get planningInstanceRecord
   * @return planningInstanceRecord
  **/

  public BQPlanningUpdateInputModelPlanningInstanceRecord getPlanningInstanceRecord() {
    return planningInstanceRecord;
  }

  public void setPlanningInstanceRecord(BQPlanningUpdateInputModelPlanningInstanceRecord planningInstanceRecord) {
    this.planningInstanceRecord = planningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Planning instance retrieve service call 
   * @return planningRetrieveActionTaskReference
  **/

  public String getPlanningRetrieveActionTaskReference() {
    return planningRetrieveActionTaskReference;
  }

  public void setPlanningRetrieveActionTaskReference(String planningRetrieveActionTaskReference) {
    this.planningRetrieveActionTaskReference = planningRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return planningRetrieveActionResponse
  **/

  public String getPlanningRetrieveActionResponse() {
    return planningRetrieveActionResponse;
  }

  public void setPlanningRetrieveActionResponse(String planningRetrieveActionResponse) {
    this.planningRetrieveActionResponse = planningRetrieveActionResponse;
  }


  /**
   * Get planningInstanceReport
   * @return planningInstanceReport
  **/

  public BQPlanningRetrieveOutputModelPlanningInstanceReport getPlanningInstanceReport() {
    return planningInstanceReport;
  }

  public void setPlanningInstanceReport(BQPlanningRetrieveOutputModelPlanningInstanceReport planningInstanceReport) {
    this.planningInstanceReport = planningInstanceReport;
  }


  /**
   * Get planningInstanceAnalysis
   * @return planningInstanceAnalysis
  **/

  public BQPlanningRetrieveOutputModelPlanningInstanceAnalysis getPlanningInstanceAnalysis() {
    return planningInstanceAnalysis;
  }

  public void setPlanningInstanceAnalysis(BQPlanningRetrieveOutputModelPlanningInstanceAnalysis planningInstanceAnalysis) {
    this.planningInstanceAnalysis = planningInstanceAnalysis;
  }


}

