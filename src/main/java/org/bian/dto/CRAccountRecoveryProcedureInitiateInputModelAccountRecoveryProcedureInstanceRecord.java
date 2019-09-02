package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType;
import org.bian.dto.CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordInvolvedPartyReference;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord
 */
public class CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecord   {
  private String accountRecoveryCaseType = null;

  private String productInstanceReference = null;

  private String linkedProductInstanceReference = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String accountNumber = null;

  private String bankBranchLocationReference = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType dateType = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordInvolvedPartyReference involvedPartyReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String accountLimitType = null;

  private String accountLimit = null;

  private String allowedAccess = null;

  private String taxReference = null;

  private String accountStatus = null;

  private String collateralAssetAllocationProfile = null;

  private Object collateralAssetAllocationInstanceRecord = null;

  private String collateralType = null;

  private String collateralAssetDescription = null;

  private Object transactionRecord = null;

  private CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts accountRecoveryCaseWorkProducts = null;

  private String accountRecoveryCaseStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the type of recovery case (e.g. lapsed payment, collateral revaluation, credit) 
   * @return accountRecoveryCaseType
  **/

  public String getAccountRecoveryCaseType() {
    return accountRecoveryCaseType;
  }

  public void setAccountRecoveryCaseType(String accountRecoveryCaseType) {
    this.accountRecoveryCaseType = accountRecoveryCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the product instance associated with the account recovery case 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer associated with account recovery case - likely product 'owner' 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The assigned customer relationship manager or unit for the case 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the underlying account for the product instance being recovered 
   * @return accountNumber
  **/

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Location where the business is booked for reporting purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * Get involvedPartyReference
   * @return involvedPartyReference
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordInvolvedPartyReference getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordInvolvedPartyReference involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account being recovered (e.g. checking, mortgage) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the account 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Limits that are applied to the account (e.g. transaction credit/debit, netting, position) 
   * @return accountLimitType
  **/

  public String getAccountLimitType() {
    return accountLimitType;
  }

  public void setAccountLimitType(String accountLimitType) {
    this.accountLimitType = accountLimitType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Current position against limits 
   * @return accountLimit
  **/

  public String getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(String accountLimit) {
    this.accountLimit = accountLimit;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any additional parties given access to the account (allowed roles and actions against the product) 
   * @return allowedAccess
  **/

  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a tax identifier associated with the customer/account for tax reporting 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status of the recovery account (e.g. pre-opened, active, dormant, pending for closing, blocked) 
   * @return accountStatus
  **/

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Lists the customer's collateral asset allocation status against different loan products known to the bank 
   * @return collateralAssetAllocationProfile
  **/

  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record detailing how a customer's collateral assets are allocated 
   * @return collateralAssetAllocationInstanceRecord
  **/

  public Object getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (e.g. building, machinery, inventory, financial instrument, art) 
   * @return collateralType
  **/

  public String getCollateralType() {
    return collateralType;
  }

  public void setCollateralType(String collateralType) {
    this.collateralType = collateralType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the asset 
   * @return collateralAssetDescription
  **/

  public String getCollateralAssetDescription() {
    return collateralAssetDescription;
  }

  public void setCollateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of all transactions made against the account - not itemized here but referenced from fulfillment processing 
   * @return transactionRecord
  **/

  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


  /**
   * Get accountRecoveryCaseWorkProducts
   * @return accountRecoveryCaseWorkProducts
  **/

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts getAccountRecoveryCaseWorkProducts() {
    return accountRecoveryCaseWorkProducts;
  }

  public void setAccountRecoveryCaseWorkProducts(CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts accountRecoveryCaseWorkProducts) {
    this.accountRecoveryCaseWorkProducts = accountRecoveryCaseWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the recovery case (e.g. in assessment, write-down, planning, negotiation, restructuring) 
   * @return accountRecoveryCaseStatus
  **/

  public String getAccountRecoveryCaseStatus() {
    return accountRecoveryCaseStatus;
  }

  public void setAccountRecoveryCaseStatus(String accountRecoveryCaseStatus) {
    this.accountRecoveryCaseStatus = accountRecoveryCaseStatus;
  }


}

