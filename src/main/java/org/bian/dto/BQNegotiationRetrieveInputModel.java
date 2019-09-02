package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNegotiationRetrieveInputModelNegotiationInstanceAnalysis;
import org.bian.dto.BQNegotiationRetrieveInputModelNegotiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQNegotiationRetrieveInputModel
 */
public class BQNegotiationRetrieveInputModel   {
  private Object negotiationRetrieveActionTaskRecord = null;

  private String negotiationRetrieveActionRequest = null;

  private BQNegotiationRetrieveInputModelNegotiationInstanceReport negotiationInstanceReport = null;

  private BQNegotiationRetrieveInputModelNegotiationInstanceAnalysis negotiationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return negotiationRetrieveActionRequest
  **/

  public String getNegotiationRetrieveActionRequest() {
    return negotiationRetrieveActionRequest;
  }

  public void setNegotiationRetrieveActionRequest(String negotiationRetrieveActionRequest) {
    this.negotiationRetrieveActionRequest = negotiationRetrieveActionRequest;
  }


  /**
   * Get negotiationInstanceReport
   * @return negotiationInstanceReport
  **/

  public BQNegotiationRetrieveInputModelNegotiationInstanceReport getNegotiationInstanceReport() {
    return negotiationInstanceReport;
  }

  public void setNegotiationInstanceReport(BQNegotiationRetrieveInputModelNegotiationInstanceReport negotiationInstanceReport) {
    this.negotiationInstanceReport = negotiationInstanceReport;
  }


  /**
   * Get negotiationInstanceAnalysis
   * @return negotiationInstanceAnalysis
  **/

  public BQNegotiationRetrieveInputModelNegotiationInstanceAnalysis getNegotiationInstanceAnalysis() {
    return negotiationInstanceAnalysis;
  }

  public void setNegotiationInstanceAnalysis(BQNegotiationRetrieveInputModelNegotiationInstanceAnalysis negotiationInstanceAnalysis) {
    this.negotiationInstanceAnalysis = negotiationInstanceAnalysis;
  }


}

