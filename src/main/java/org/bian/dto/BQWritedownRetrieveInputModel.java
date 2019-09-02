package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWritedownRetrieveInputModelWritedownInstanceAnalysis;
import org.bian.dto.BQWritedownRetrieveInputModelWritedownInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWritedownRetrieveInputModel
 */
public class BQWritedownRetrieveInputModel   {
  private Object writedownRetrieveActionTaskRecord = null;

  private String writedownRetrieveActionRequest = null;

  private BQWritedownRetrieveInputModelWritedownInstanceReport writedownInstanceReport = null;

  private BQWritedownRetrieveInputModelWritedownInstanceAnalysis writedownInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return writedownRetrieveActionTaskRecord
  **/

  public Object getWritedownRetrieveActionTaskRecord() {
    return writedownRetrieveActionTaskRecord;
  }

  public void setWritedownRetrieveActionTaskRecord(Object writedownRetrieveActionTaskRecord) {
    this.writedownRetrieveActionTaskRecord = writedownRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return writedownRetrieveActionRequest
  **/

  public String getWritedownRetrieveActionRequest() {
    return writedownRetrieveActionRequest;
  }

  public void setWritedownRetrieveActionRequest(String writedownRetrieveActionRequest) {
    this.writedownRetrieveActionRequest = writedownRetrieveActionRequest;
  }


  /**
   * Get writedownInstanceReport
   * @return writedownInstanceReport
  **/

  public BQWritedownRetrieveInputModelWritedownInstanceReport getWritedownInstanceReport() {
    return writedownInstanceReport;
  }

  public void setWritedownInstanceReport(BQWritedownRetrieveInputModelWritedownInstanceReport writedownInstanceReport) {
    this.writedownInstanceReport = writedownInstanceReport;
  }


  /**
   * Get writedownInstanceAnalysis
   * @return writedownInstanceAnalysis
  **/

  public BQWritedownRetrieveInputModelWritedownInstanceAnalysis getWritedownInstanceAnalysis() {
    return writedownInstanceAnalysis;
  }

  public void setWritedownInstanceAnalysis(BQWritedownRetrieveInputModelWritedownInstanceAnalysis writedownInstanceAnalysis) {
    this.writedownInstanceAnalysis = writedownInstanceAnalysis;
  }


}

