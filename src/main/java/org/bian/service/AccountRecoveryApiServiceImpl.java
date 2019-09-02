/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AccountRecoveryApiServiceImpl implements AccountRecoveryApiService {

	public SDAccountRecoveryActivateOutputModel activate(SDAccountRecoveryActivateInputModel request){
		return JsonReader.read("activate-SDAccountRecoveryActivateOutputModel.json",new TypeReference<SDAccountRecoveryActivateOutputModel>(){});
	}
	
	public SDAccountRecoveryConfigureOutputModel configure(String sdReferenceId, SDAccountRecoveryConfigureInputModel request){
		return JsonReader.read("configure-SDAccountRecoveryConfigureOutputModel.json",new TypeReference<SDAccountRecoveryConfigureOutputModel>(){});
	}
	
	public BQNegotiationExchangeOutputModel exchangeNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationExchangeInputModel request){
		return JsonReader.read("exchange-BQNegotiationExchangeOutputModel.json",new TypeReference<BQNegotiationExchangeOutputModel>(){});
	}
	
	public BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request){
		return JsonReader.read("exchange-BQRestructuringExchangeOutputModel.json",new TypeReference<BQRestructuringExchangeOutputModel>(){});
	}
	
	public CRAccountRecoveryProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAccountRecoveryProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRAccountRecoveryProcedureExchangeOutputModel.json",new TypeReference<CRAccountRecoveryProcedureExchangeOutputModel>(){});
	}
	
	public BQWritedownExchangeOutputModel exchangeWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWritedownExchangeInputModel request){
		return JsonReader.read("exchange-BQWritedownExchangeOutputModel.json",new TypeReference<BQWritedownExchangeOutputModel>(){});
	}
	
	public SDAccountRecoveryFeedbackOutputModel feedback(String sdReferenceId, SDAccountRecoveryFeedbackInputModel request){
		return JsonReader.read("feedback-SDAccountRecoveryFeedbackOutputModel.json",new TypeReference<SDAccountRecoveryFeedbackOutputModel>(){});
	}
	
	public CRAccountRecoveryProcedureInitiateOutputModel initiate(String sdReferenceId, CRAccountRecoveryProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRAccountRecoveryProcedureInitiateOutputModel.json",new TypeReference<CRAccountRecoveryProcedureInitiateOutputModel>(){});
	}
	
	public BQNegotiationRequestOutputModel requestNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationRequestInputModel request){
		return JsonReader.read("request-BQNegotiationRequestOutputModel.json",new TypeReference<BQNegotiationRequestOutputModel>(){});
	}
	
	public CRAccountRecoveryProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRAccountRecoveryProcedureRetrieveOutputModel.json",new TypeReference<CRAccountRecoveryProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssessmentRetrieveOutputModel retrieveAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssessmentRetrieveOutputModel.json",new TypeReference<BQAssessmentRetrieveOutputModel>(){});
	}
	
	public BQNegotiationRetrieveOutputModel retrieveNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQNegotiationRetrieveOutputModel.json",new TypeReference<BQNegotiationRetrieveOutputModel>(){});
	}
	
	public BQPlanningRetrieveOutputModel retrievePlanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPlanningRetrieveOutputModel.json",new TypeReference<BQPlanningRetrieveOutputModel>(){});
	}
	
	public BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRestructuringRetrieveOutputModel.json",new TypeReference<BQRestructuringRetrieveOutputModel>(){});
	}
	
	public BQWritedownRetrieveOutputModel retrieveWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWritedownRetrieveOutputModel.json",new TypeReference<BQWritedownRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDAccountRecoveryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAccountRecoveryRetrieveOutputModel.json",new TypeReference<SDAccountRecoveryRetrieveOutputModel>(){});
	}
	
	public CRAccountRecoveryProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAccountRecoveryProcedureUpdateInputModel request){
		return JsonReader.read("update-CRAccountRecoveryProcedureUpdateOutputModel.json",new TypeReference<CRAccountRecoveryProcedureUpdateOutputModel>(){});
	}
	
	public BQAssessmentUpdateOutputModel updateAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQAssessmentUpdateOutputModel.json",new TypeReference<BQAssessmentUpdateOutputModel>(){});
	}
	
	public BQNegotiationUpdateOutputModel updateNegotiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNegotiationUpdateInputModel request){
		return JsonReader.read("update-BQNegotiationUpdateOutputModel.json",new TypeReference<BQNegotiationUpdateOutputModel>(){});
	}
	
	public BQPlanningUpdateOutputModel updatePlanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlanningUpdateInputModel request){
		return JsonReader.read("update-BQPlanningUpdateOutputModel.json",new TypeReference<BQPlanningUpdateOutputModel>(){});
	}
	
	public BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request){
		return JsonReader.read("update-BQRestructuringUpdateOutputModel.json",new TypeReference<BQRestructuringUpdateOutputModel>(){});
	}
	
	public BQWritedownUpdateOutputModel updateWritedown(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWritedownUpdateInputModel request){
		return JsonReader.read("update-BQWritedownUpdateOutputModel.json",new TypeReference<BQWritedownUpdateOutputModel>(){});
	}
	
}
