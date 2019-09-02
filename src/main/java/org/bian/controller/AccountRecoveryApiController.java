/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class AccountRecoveryApiController {

	@Autowired
	AccountRecoveryApiService service;
	
	@Process.Activate
	public BianResponse<SDAccountRecoveryActivateOutputModel> activate(@RequestBody BianRequest<SDAccountRecoveryActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDAccountRecoveryConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAccountRecoveryConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("negotiation")
	@Process.Exchange
	public BianResponse<BQNegotiationExchangeOutputModel> exchangeNegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNegotiationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeNegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Process.Exchange
	public BianResponse<BQRestructuringExchangeOutputModel> exchangeRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRestructuringExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeRestructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRAccountRecoveryProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountRecoveryProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("writedown")
	@Process.Exchange
	public BianResponse<BQWritedownExchangeOutputModel> exchangeWritedown(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWritedownExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeWritedown(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDAccountRecoveryFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAccountRecoveryFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRAccountRecoveryProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRAccountRecoveryProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("negotiation")
	@Process.Request
	public BianResponse<BQNegotiationRequestOutputModel> requestNegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNegotiationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestNegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRAccountRecoveryProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("assessment")
	@Process.Retrieve
	public BianResponse<BQAssessmentRetrieveOutputModel> retrieveAssessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("negotiation")
	@Process.Retrieve
	public BianResponse<BQNegotiationRetrieveOutputModel> retrieveNegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveNegotiation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("planning")
	@Process.Retrieve
	public BianResponse<BQPlanningRetrieveOutputModel> retrievePlanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePlanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("restructuring")
	@Process.Retrieve
	public BianResponse<BQRestructuringRetrieveOutputModel> retrieveRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRestructuring(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("writedown")
	@Process.Retrieve
	public BianResponse<BQWritedownRetrieveOutputModel> retrieveWritedown(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWritedown(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDAccountRecoveryRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRAccountRecoveryProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAccountRecoveryProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assessment")
	@Process.Update
	public BianResponse<BQAssessmentUpdateOutputModel> updateAssessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("negotiation")
	@Process.Update
	public BianResponse<BQNegotiationUpdateOutputModel> updateNegotiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNegotiationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateNegotiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("planning")
	@Process.Update
	public BianResponse<BQPlanningUpdateOutputModel> updatePlanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePlanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Process.Update
	public BianResponse<BQRestructuringUpdateOutputModel> updateRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRestructuringUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRestructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("writedown")
	@Process.Update
	public BianResponse<BQWritedownUpdateOutputModel> updateWritedown(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWritedownUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateWritedown(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
