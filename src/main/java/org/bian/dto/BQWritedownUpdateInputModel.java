package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWritedownUpdateInputModelWritedownInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWritedownUpdateInputModel
 */
public class BQWritedownUpdateInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String writedownInstanceReference = null;

  private BQWritedownUpdateInputModelWritedownInstanceRecord writedownInstanceRecord = null;

  private Object writedownUpdateActionTaskRecord = null;

  private String writedownUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/

  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Writedown instance 
   * @return writedownInstanceReference
  **/

  public String getWritedownInstanceReference() {
    return writedownInstanceReference;
  }

  public void setWritedownInstanceReference(String writedownInstanceReference) {
    this.writedownInstanceReference = writedownInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return writedownUpdateActionTaskRecord
  **/

  public Object getWritedownUpdateActionTaskRecord() {
    return writedownUpdateActionTaskRecord;
  }

  public void setWritedownUpdateActionTaskRecord(Object writedownUpdateActionTaskRecord) {
    this.writedownUpdateActionTaskRecord = writedownUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return writedownUpdateActionRequest
  **/

  public String getWritedownUpdateActionRequest() {
    return writedownUpdateActionRequest;
  }

  public void setWritedownUpdateActionRequest(String writedownUpdateActionRequest) {
    this.writedownUpdateActionRequest = writedownUpdateActionRequest;
  }


}

