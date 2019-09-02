package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.BQWritedownRetrieveOutputModelWritedownInstanceAnalysis;
import org.bian.dto.BQWritedownRetrieveOutputModelWritedownInstanceReport;
import org.bian.dto.BQWritedownUpdateInputModelWritedownInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWritedownRetrieveOutputModel
 */
public class BQWritedownRetrieveOutputModel   {
  private BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private BQWritedownUpdateInputModelWritedownInstanceRecord writedownInstanceRecord = null;

  private String writedownRetrieveActionTaskReference = null;

  private Object writedownRetrieveActionTaskRecord = null;

  private String writedownRetrieveActionResponse = null;

  private BQWritedownRetrieveOutputModelWritedownInstanceReport writedownInstanceReport = null;

  private BQWritedownRetrieveOutputModelWritedownInstanceAnalysis writedownInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * Get writedownInstanceRecord
   * @return writedownInstanceRecord
  **/

  public BQWritedownUpdateInputModelWritedownInstanceRecord getWritedownInstanceRecord() {
    return writedownInstanceRecord;
  }

  public void setWritedownInstanceRecord(BQWritedownUpdateInputModelWritedownInstanceRecord writedownInstanceRecord) {
    this.writedownInstanceRecord = writedownInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Writedown instance retrieve service call 
   * @return writedownRetrieveActionTaskReference
  **/

  public String getWritedownRetrieveActionTaskReference() {
    return writedownRetrieveActionTaskReference;
  }

  public void setWritedownRetrieveActionTaskReference(String writedownRetrieveActionTaskReference) {
    this.writedownRetrieveActionTaskReference = writedownRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return writedownRetrieveActionResponse
  **/

  public String getWritedownRetrieveActionResponse() {
    return writedownRetrieveActionResponse;
  }

  public void setWritedownRetrieveActionResponse(String writedownRetrieveActionResponse) {
    this.writedownRetrieveActionResponse = writedownRetrieveActionResponse;
  }


  /**
   * Get writedownInstanceReport
   * @return writedownInstanceReport
  **/

  public BQWritedownRetrieveOutputModelWritedownInstanceReport getWritedownInstanceReport() {
    return writedownInstanceReport;
  }

  public void setWritedownInstanceReport(BQWritedownRetrieveOutputModelWritedownInstanceReport writedownInstanceReport) {
    this.writedownInstanceReport = writedownInstanceReport;
  }


  /**
   * Get writedownInstanceAnalysis
   * @return writedownInstanceAnalysis
  **/

  public BQWritedownRetrieveOutputModelWritedownInstanceAnalysis getWritedownInstanceAnalysis() {
    return writedownInstanceAnalysis;
  }

  public void setWritedownInstanceAnalysis(BQWritedownRetrieveOutputModelWritedownInstanceAnalysis writedownInstanceAnalysis) {
    this.writedownInstanceAnalysis = writedownInstanceAnalysis;
  }


}

