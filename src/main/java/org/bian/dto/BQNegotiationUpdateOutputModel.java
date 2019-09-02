package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNegotiationUpdateInputModelNegotiationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQNegotiationUpdateOutputModel
 */
public class BQNegotiationUpdateOutputModel   {
  private BQNegotiationUpdateInputModelNegotiationInstanceRecord negotiationInstanceRecord = null;

  private String negotiationUpdateActionTaskReference = null;

  private Object negotiationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get negotiationInstanceRecord
   * @return negotiationInstanceRecord
  **/

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord getNegotiationInstanceRecord() {
    return negotiationInstanceRecord;
  }

  public void setNegotiationInstanceRecord(BQNegotiationUpdateInputModelNegotiationInstanceRecord negotiationInstanceRecord) {
    this.negotiationInstanceRecord = negotiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return negotiationUpdateActionTaskReference
  **/

  public String getNegotiationUpdateActionTaskReference() {
    return negotiationUpdateActionTaskReference;
  }

  public void setNegotiationUpdateActionTaskReference(String negotiationUpdateActionTaskReference) {
    this.negotiationUpdateActionTaskReference = negotiationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return negotiationUpdateActionTaskRecord
  **/

  public Object getNegotiationUpdateActionTaskRecord() {
    return negotiationUpdateActionTaskRecord;
  }

  public void setNegotiationUpdateActionTaskRecord(Object negotiationUpdateActionTaskRecord) {
    this.negotiationUpdateActionTaskRecord = negotiationUpdateActionTaskRecord;
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

