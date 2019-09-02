package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWritedownRetrieveOutputModelWritedownInstanceReport
 */
public class BQWritedownRetrieveOutputModelWritedownInstanceReport   {
  private Object writedownInstanceReportRecord = null;

  private String writedownInstanceReportType = null;

  private String writedownInstanceReportParameters = null;

  private Object writedownInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return writedownInstanceReportRecord
  **/

  public Object getWritedownInstanceReportRecord() {
    return writedownInstanceReportRecord;
  }

  public void setWritedownInstanceReportRecord(Object writedownInstanceReportRecord) {
    this.writedownInstanceReportRecord = writedownInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return writedownInstanceReportType
  **/

  public String getWritedownInstanceReportType() {
    return writedownInstanceReportType;
  }

  public void setWritedownInstanceReportType(String writedownInstanceReportType) {
    this.writedownInstanceReportType = writedownInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return writedownInstanceReportParameters
  **/

  public String getWritedownInstanceReportParameters() {
    return writedownInstanceReportParameters;
  }

  public void setWritedownInstanceReportParameters(String writedownInstanceReportParameters) {
    this.writedownInstanceReportParameters = writedownInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return writedownInstanceReport
  **/

  public Object getWritedownInstanceReport() {
    return writedownInstanceReport;
  }

  public void setWritedownInstanceReport(Object writedownInstanceReport) {
    this.writedownInstanceReport = writedownInstanceReport;
  }


}

