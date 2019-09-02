package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNegotiationRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis;
import org.bian.dto.BQNegotiationRetrieveOutputModelNegotiationInstanceRecord;
import org.bian.dto.BQNegotiationRetrieveOutputModelNegotiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQNegotiationRetrieveOutputModel
 */
public class BQNegotiationRetrieveOutputModel   {
  private BQNegotiationRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private BQNegotiationRetrieveOutputModelNegotiationInstanceRecord negotiationInstanceRecord = null;

  private String negotiationRetrieveActionTaskReference = null;

  private Object negotiationRetrieveActionTaskRecord = null;

  private String negotiationRetrieveActionResponse = null;

  private BQNegotiationRetrieveOutputModelNegotiationInstanceReport negotiationInstanceReport = null;

  private BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis negotiationInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public BQNegotiationRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(BQNegotiationRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * Get negotiationInstanceRecord
   * @return negotiationInstanceRecord
  **/

  public BQNegotiationRetrieveOutputModelNegotiationInstanceRecord getNegotiationInstanceRecord() {
    return negotiationInstanceRecord;
  }

  public void setNegotiationInstanceRecord(BQNegotiationRetrieveOutputModelNegotiationInstanceRecord negotiationInstanceRecord) {
    this.negotiationInstanceRecord = negotiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Negotiation instance retrieve service call 
   * @return negotiationRetrieveActionTaskReference
  **/

  public String getNegotiationRetrieveActionTaskReference() {
    return negotiationRetrieveActionTaskReference;
  }

  public void setNegotiationRetrieveActionTaskReference(String negotiationRetrieveActionTaskReference) {
    this.negotiationRetrieveActionTaskReference = negotiationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return negotiationRetrieveActionTaskRecord
  **/

  public Object getNegotiationRetrieveActionTaskRecord() {
    return negotiationRetrieveActionTaskRecord;
  }

  public void setNegotiationRetrieveActionTaskRecord(Object negotiationRetrieveActionTaskRecord) {
    this.negotiationRetrieveActionTaskRecord = negotiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return negotiationRetrieveActionResponse
  **/

  public String getNegotiationRetrieveActionResponse() {
    return negotiationRetrieveActionResponse;
  }

  public void setNegotiationRetrieveActionResponse(String negotiationRetrieveActionResponse) {
    this.negotiationRetrieveActionResponse = negotiationRetrieveActionResponse;
  }


  /**
   * Get negotiationInstanceReport
   * @return negotiationInstanceReport
  **/

  public BQNegotiationRetrieveOutputModelNegotiationInstanceReport getNegotiationInstanceReport() {
    return negotiationInstanceReport;
  }

  public void setNegotiationInstanceReport(BQNegotiationRetrieveOutputModelNegotiationInstanceReport negotiationInstanceReport) {
    this.negotiationInstanceReport = negotiationInstanceReport;
  }


  /**
   * Get negotiationInstanceAnalysis
   * @return negotiationInstanceAnalysis
  **/

  public BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis getNegotiationInstanceAnalysis() {
    return negotiationInstanceAnalysis;
  }

  public void setNegotiationInstanceAnalysis(BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis negotiationInstanceAnalysis) {
    this.negotiationInstanceAnalysis = negotiationInstanceAnalysis;
  }


}

