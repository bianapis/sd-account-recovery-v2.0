package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWritedownUpdateInputModelWritedownInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWritedownUpdateOutputModel
 */
public class BQWritedownUpdateOutputModel   {
  private BQWritedownUpdateInputModelWritedownInstanceRecord writedownInstanceRecord = null;

  private String writedownUpdateActionTaskReference = null;

  private Object writedownUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return writedownUpdateActionTaskReference
  **/

  public String getWritedownUpdateActionTaskReference() {
    return writedownUpdateActionTaskReference;
  }

  public void setWritedownUpdateActionTaskReference(String writedownUpdateActionTaskReference) {
    this.writedownUpdateActionTaskReference = writedownUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

