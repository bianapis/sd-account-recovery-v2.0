package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureUpdateOutputModel
 */
public class CRAccountRecoveryProcedureUpdateOutputModel   {
  private CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private String accountRecoveryProcedureUpdateActionTaskReference = null;

  private Object accountRecoveryProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(CRAccountRecoveryProcedureUpdateInputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountRecoveryProcedureUpdateActionTaskReference
  **/

  public String getAccountRecoveryProcedureUpdateActionTaskReference() {
    return accountRecoveryProcedureUpdateActionTaskReference;
  }

  public void setAccountRecoveryProcedureUpdateActionTaskReference(String accountRecoveryProcedureUpdateActionTaskReference) {
    this.accountRecoveryProcedureUpdateActionTaskReference = accountRecoveryProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountRecoveryProcedureUpdateActionTaskRecord
  **/

  public Object getAccountRecoveryProcedureUpdateActionTaskRecord() {
    return accountRecoveryProcedureUpdateActionTaskRecord;
  }

  public void setAccountRecoveryProcedureUpdateActionTaskRecord(Object accountRecoveryProcedureUpdateActionTaskRecord) {
    this.accountRecoveryProcedureUpdateActionTaskRecord = accountRecoveryProcedureUpdateActionTaskRecord;
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

