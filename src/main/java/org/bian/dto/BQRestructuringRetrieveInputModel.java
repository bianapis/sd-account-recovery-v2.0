package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis;
import org.bian.dto.BQRestructuringRetrieveInputModelRestructuringInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveInputModel
 */
public class BQRestructuringRetrieveInputModel   {
  private Object restructuringRetrieveActionTaskRecord = null;

  private String restructuringRetrieveActionRequest = null;

  private BQRestructuringRetrieveInputModelRestructuringInstanceReport restructuringInstanceReport = null;

  private BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis restructuringInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return restructuringRetrieveActionTaskRecord
  **/

  public Object getRestructuringRetrieveActionTaskRecord() {
    return restructuringRetrieveActionTaskRecord;
  }

  public void setRestructuringRetrieveActionTaskRecord(Object restructuringRetrieveActionTaskRecord) {
    this.restructuringRetrieveActionTaskRecord = restructuringRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return restructuringRetrieveActionRequest
  **/

  public String getRestructuringRetrieveActionRequest() {
    return restructuringRetrieveActionRequest;
  }

  public void setRestructuringRetrieveActionRequest(String restructuringRetrieveActionRequest) {
    this.restructuringRetrieveActionRequest = restructuringRetrieveActionRequest;
  }


  /**
   * Get restructuringInstanceReport
   * @return restructuringInstanceReport
  **/

  public BQRestructuringRetrieveInputModelRestructuringInstanceReport getRestructuringInstanceReport() {
    return restructuringInstanceReport;
  }

  public void setRestructuringInstanceReport(BQRestructuringRetrieveInputModelRestructuringInstanceReport restructuringInstanceReport) {
    this.restructuringInstanceReport = restructuringInstanceReport;
  }


  /**
   * Get restructuringInstanceAnalysis
   * @return restructuringInstanceAnalysis
  **/

  public BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis getRestructuringInstanceAnalysis() {
    return restructuringInstanceAnalysis;
  }

  public void setRestructuringInstanceAnalysis(BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis restructuringInstanceAnalysis) {
    this.restructuringInstanceAnalysis = restructuringInstanceAnalysis;
  }


}

