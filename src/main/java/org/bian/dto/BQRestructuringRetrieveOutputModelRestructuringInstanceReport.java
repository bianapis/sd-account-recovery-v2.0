package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveOutputModelRestructuringInstanceReport
 */
public class BQRestructuringRetrieveOutputModelRestructuringInstanceReport   {
  private Object restructuringInstanceReportRecord = null;

  private String restructuringInstanceReportType = null;

  private String restructuringInstanceReportParameters = null;

  private Object restructuringInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return restructuringInstanceReportRecord
  **/

  public Object getRestructuringInstanceReportRecord() {
    return restructuringInstanceReportRecord;
  }

  public void setRestructuringInstanceReportRecord(Object restructuringInstanceReportRecord) {
    this.restructuringInstanceReportRecord = restructuringInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return restructuringInstanceReportType
  **/

  public String getRestructuringInstanceReportType() {
    return restructuringInstanceReportType;
  }

  public void setRestructuringInstanceReportType(String restructuringInstanceReportType) {
    this.restructuringInstanceReportType = restructuringInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return restructuringInstanceReportParameters
  **/

  public String getRestructuringInstanceReportParameters() {
    return restructuringInstanceReportParameters;
  }

  public void setRestructuringInstanceReportParameters(String restructuringInstanceReportParameters) {
    this.restructuringInstanceReportParameters = restructuringInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return restructuringInstanceReport
  **/

  public Object getRestructuringInstanceReport() {
    return restructuringInstanceReport;
  }

  public void setRestructuringInstanceReport(Object restructuringInstanceReport) {
    this.restructuringInstanceReport = restructuringInstanceReport;
  }


}

