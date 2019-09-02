package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis;
import org.bian.dto.BQRestructuringRetrieveOutputModelRestructuringInstanceReport;
import org.bian.dto.BQRestructuringUpdateOutputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveOutputModel
 */
public class BQRestructuringRetrieveOutputModel   {
  private BQRestructuringRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private BQRestructuringUpdateOutputModelRestructuringInstanceRecord restructuringInstanceRecord = null;

  private String restructuringRetrieveActionTaskReference = null;

  private Object restructuringRetrieveActionTaskRecord = null;

  private String restructuringRetrieveActionResponse = null;

  private BQRestructuringRetrieveOutputModelRestructuringInstanceReport restructuringInstanceReport = null;

  private BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis restructuringInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public BQRestructuringRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(BQRestructuringRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringUpdateOutputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringUpdateOutputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Restructuring instance retrieve service call 
   * @return restructuringRetrieveActionTaskReference
  **/

  public String getRestructuringRetrieveActionTaskReference() {
    return restructuringRetrieveActionTaskReference;
  }

  public void setRestructuringRetrieveActionTaskReference(String restructuringRetrieveActionTaskReference) {
    this.restructuringRetrieveActionTaskReference = restructuringRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return restructuringRetrieveActionResponse
  **/

  public String getRestructuringRetrieveActionResponse() {
    return restructuringRetrieveActionResponse;
  }

  public void setRestructuringRetrieveActionResponse(String restructuringRetrieveActionResponse) {
    this.restructuringRetrieveActionResponse = restructuringRetrieveActionResponse;
  }


  /**
   * Get restructuringInstanceReport
   * @return restructuringInstanceReport
  **/

  public BQRestructuringRetrieveOutputModelRestructuringInstanceReport getRestructuringInstanceReport() {
    return restructuringInstanceReport;
  }

  public void setRestructuringInstanceReport(BQRestructuringRetrieveOutputModelRestructuringInstanceReport restructuringInstanceReport) {
    this.restructuringInstanceReport = restructuringInstanceReport;
  }


  /**
   * Get restructuringInstanceAnalysis
   * @return restructuringInstanceAnalysis
  **/

  public BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis getRestructuringInstanceAnalysis() {
    return restructuringInstanceAnalysis;
  }

  public void setRestructuringInstanceAnalysis(BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis restructuringInstanceAnalysis) {
    this.restructuringInstanceAnalysis = restructuringInstanceAnalysis;
  }


}

