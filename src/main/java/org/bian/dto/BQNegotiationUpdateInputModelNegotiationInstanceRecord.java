package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationUpdateInputModelNegotiationInstanceRecord
 */
public class BQNegotiationUpdateInputModelNegotiationInstanceRecord   {
  private String accountRecoveryGuidelines = null;

  private String correspondenceReference = null;

  private String correspondenceContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private Object accountRecoveryCaseNegotiationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines bank's policies and guidelines for account recovery/write down handling 
   * @return accountRecoveryGuidelines
  **/

  public String getAccountRecoveryGuidelines() {
    return accountRecoveryGuidelines;
  }

  public void setAccountRecoveryGuidelines(String accountRecoveryGuidelines) {
    this.accountRecoveryGuidelines = accountRecoveryGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to negotiation/confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of correspondence content as appropriate 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to legal documents created & referenced during the account recovery negotiation process 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of document copy/content as appropriate 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the negotiation task within the account recovery process 
   * @return accountRecoveryCaseNegotiationTaskRecord
  **/

  public Object getAccountRecoveryCaseNegotiationTaskRecord() {
    return accountRecoveryCaseNegotiationTaskRecord;
  }

  public void setAccountRecoveryCaseNegotiationTaskRecord(Object accountRecoveryCaseNegotiationTaskRecord) {
    this.accountRecoveryCaseNegotiationTaskRecord = accountRecoveryCaseNegotiationTaskRecord;
  }


}

