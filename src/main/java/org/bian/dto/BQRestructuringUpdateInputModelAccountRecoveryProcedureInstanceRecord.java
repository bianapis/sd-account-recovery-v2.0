package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringUpdateInputModelAccountRecoveryProcedureInstanceRecord
 */
public class BQRestructuringUpdateInputModelAccountRecoveryProcedureInstanceRecord   {
  private String linkedProductInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to any new/replacement product established during the recovery/restructuring process 
   * @return linkedProductInstanceReference
  **/

  public String getLinkedProductInstanceReference() {
    return linkedProductInstanceReference;
  }

  public void setLinkedProductInstanceReference(String linkedProductInstanceReference) {
    this.linkedProductInstanceReference = linkedProductInstanceReference;
  }


}

