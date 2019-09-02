/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AccountRecoveryApiService {

	SDAccountRecoveryActivateOutputModel activate(SDAccountRecoveryActivateInputModel request);
	
	SDAccountRecoveryConfigureOutputModel configure(String sdReferenceId, SDAccountRecoveryConfigureInputModel request);
	
	BQNegotiationExchangeOutputModel exchangeNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationExchangeInputModel request);
	
	BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request);
	
	CRAccountRecoveryProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAccountRecoveryProcedureExchangeInputModel request);
	
	BQWritedownExchangeOutputModel exchangeWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWritedownExchangeInputModel request);
	
	SDAccountRecoveryFeedbackOutputModel feedback(String sdReferenceId, SDAccountRecoveryFeedbackInputModel request);
	
	CRAccountRecoveryProcedureInitiateOutputModel initiate(String sdReferenceId, CRAccountRecoveryProcedureInitiateInputModel request);
	
	BQNegotiationRequestOutputModel requestNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationRequestInputModel request);
	
	CRAccountRecoveryProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAssessmentRetrieveOutputModel retrieveAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQNegotiationRetrieveOutputModel retrieveNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPlanningRetrieveOutputModel retrievePlanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWritedownRetrieveOutputModel retrieveWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDAccountRecoveryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRAccountRecoveryProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAccountRecoveryProcedureUpdateInputModel request);
	
	BQAssessmentUpdateOutputModel updateAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssessmentUpdateInputModel request);
	
	BQNegotiationUpdateOutputModel updateNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationUpdateInputModel request);
	
	BQPlanningUpdateOutputModel updatePlanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlanningUpdateInputModel request);
	
	BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request);
	
	BQWritedownUpdateOutputModel updateWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWritedownUpdateInputModel request);
	
}
