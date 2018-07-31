package com.intellect.hrm.web.rest;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.hrm.common.ApplicationConstants;
import com.intellect.hrm.common.ResponseObject;
import com.intellect.hrm.exception.HrmBussinessException;
import com.intellect.hrm.service.HrmsActionDisciplinaryService;
import com.intellect.hrm.service.dto.HrmsActionDisciplinaryDTO;
import com.intellect.hrm.service.util.HrmCommonFunctionUtil;
import com.intellect.hrm.service.util.HrmResponseUtil;

/**
 * REST controller for managing HrmsActionDisciplinary.
 */
@CrossOrigin(origins = { "http://localhost:4200" }, allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/hrm/hrms_action_disciplinary")
public class HrmsActionDisciplinaryResource {

	private final Logger log = LoggerFactory.getLogger(HrmsActionDisciplinaryResource.class);

	private static final String ENTITY_NAME = "hrmsActionDisciplinary";

	private final HrmsActionDisciplinaryService hrmsActionDisciplinaryService;

	public HrmsActionDisciplinaryResource(HrmsActionDisciplinaryService hrmsActionDisciplinaryService) {
		this.hrmsActionDisciplinaryService = hrmsActionDisciplinaryService;
	}

	/**
	 * POST /hrms-action-disciplinaries : Create a new hrmsActionDisciplinary.
	 *
	 * @param hrmsActionDisciplinaryDTO
	 *            the hrmsActionDisciplinaryDTO to create
	 * @return the ResponseEntity with status 201 (Created) and with body the new
	 *         hrmsActionDisciplinaryDTO, or with status 400 (Bad Request) if the
	 *         hrmsActionDisciplinary has already an ID
	 * @throws URISyntaxException
	 *             if the Location URI syntax is incorrect
	 * @author sridhar
	 */
	@PostMapping("/add")
	public ResponseObject addHrmsActionDisciplinary(@RequestHeader(value = "userid", required = true) Long userid,
			@RequestBody HrmsActionDisciplinaryDTO hrmsActionDisciplinaryDTO) throws URISyntaxException {
		log.debug("REST request to save HrmsActionDisciplinary : {}", hrmsActionDisciplinaryDTO);
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		List<HrmsActionDisciplinaryDTO> data = new ArrayList<>();
		try {
			if (hrmsActionDisciplinaryDTO != null) {
				if (hrmsActionDisciplinaryDTO.getId() != null) {
					return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
							ApplicationConstants.BAD_REQUEST, null);
				}
				hrmsActionDisciplinaryDTO = (HrmsActionDisciplinaryDTO) HrmCommonFunctionUtil
						.addTimestampDetails(hrmsActionDisciplinaryDTO, userid);
				HrmsActionDisciplinaryDTO result = hrmsActionDisciplinaryService.save(hrmsActionDisciplinaryDTO);
				data.add(result);
			} // if to check nulls
		} catch (HrmBussinessException hbx) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + hbx.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, hbx.getMessage(), null);
		} catch (Exception e) {
			if (null != e)
				log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.CREATE_RECORD_SUCESS, data);

	}

	/**
	 * PUT /hrms-action-disciplinaries : Updates an existing hrmsActionDisciplinary.
	 *
	 * @param hrmsActionDisciplinaryDTO
	 *            the hrmsActionDisciplinaryDTO to update
	 * @return the ResponseEntity with status 200 (OK) and with body the updated
	 *         hrmsActionDisciplinaryDTO, or with status 400 (Bad Request) if the
	 *         hrmsActionDisciplinaryDTO is not valid, or with status 500 (Internal
	 *         Server Error) if the hrmsActionDisciplinaryDTO couldn't be updated
	 * @throws URISyntaxException
	 *             if the Location URI syntax is incorrect
	 * @author sridhar
	 */
	@PutMapping("/update")
	public ResponseObject updateHrmsActionDisciplinary(@RequestHeader(value = "userid", required = true) Long userid,
			@RequestBody HrmsActionDisciplinaryDTO hrmsActionDisciplinaryDTO) throws URISyntaxException {
		log.debug("REST request to update HrmsActionDisciplinary : {}", hrmsActionDisciplinaryDTO);
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		List<HrmsActionDisciplinaryDTO> data = new ArrayList<>();
		try {
			if (hrmsActionDisciplinaryDTO != null) {
				if (hrmsActionDisciplinaryDTO.getId() == null) {
					return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
							ApplicationConstants.BAD_REQUEST, null);
				}
				hrmsActionDisciplinaryDTO = (HrmsActionDisciplinaryDTO) HrmCommonFunctionUtil
						.getUserAuditUpdate(hrmsActionDisciplinaryDTO, userid);
				HrmsActionDisciplinaryDTO result = hrmsActionDisciplinaryService.save(hrmsActionDisciplinaryDTO);
				data.add(result);
			} // if to check nulls
		} catch (HrmBussinessException hbx) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + hbx.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, hbx.getMessage(), null);
		} catch (Exception e) {
			if (null != e)
				log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.UPDATE_RECORD_SUCESS, data);
	}

	/**
	 * GET /hrms-action-disciplinaries : get all the hrmsActionDisciplinaries.
	 *
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         hrmsActionDisciplinaries in body
	 * @author sridhar
	 */
	@GetMapping("/get_all")
	public ResponseObject getAllHrmsActionDisciplinaries(
			@RequestHeader(value = "userid", required = true) Long userid) {
		log.debug("REST request to get all HrmsActionDisciplinaries");
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		List<HrmsActionDisciplinaryDTO> data = new ArrayList<>();
		try {
			data = hrmsActionDisciplinaryService.findAll();
		} catch (HrmBussinessException hbx) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + hbx.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, hbx.getMessage(), null);
		} catch (Exception e) {
			if (null != e)
				log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.FETCH_RECORD_SUCESS, data);
	}

	/**
	 * GET /hrms-action-disciplinaries/:id : get the "id" hrmsActionDisciplinary.
	 *
	 * @param id
	 *            the id of the hrmsActionDisciplinaryDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         hrmsActionDisciplinaryDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/get")
	public ResponseObject getHrmsActionDisciplinary(@RequestHeader(value = "userid", required = true) Long userid,
			@RequestHeader(value = "id", required = true) Long id) {
		log.debug("REST request to get HrmsActionDisciplinary : {}", id);
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		List<HrmsActionDisciplinaryDTO> data = null;
		try {
			HrmsActionDisciplinaryDTO result = hrmsActionDisciplinaryService.findOne(id);
			data = new ArrayList<>();
			data.add(result);
		} catch (HrmBussinessException ex) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + ex.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, ex.getMessage(), null);
		} catch (Exception e) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.FETCH_RECORD_SUCESS, data);

	}

	/**
	 * DELETE /hrms-action-disciplinaries/:id : delete the "id"
	 * hrmsActionDisciplinary.
	 *
	 * @param id
	 *            the id of the hrmsActionDisciplinaryDTO to delete
	 * @return the ResponseEntity with status 200 (OK)
	 */
	@DeleteMapping("/remove")
	public ResponseObject removeHrmsActionDisciplinary(@RequestHeader(value = "userid", required = true) Long userid,
			@RequestHeader(value = "id", required = true) Long id) {
		log.debug("REST request to delete HrmsActionDisciplinary : {}", id);
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		try {
			hrmsActionDisciplinaryService.delete(id);
		} catch (HrmBussinessException ex) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + ex.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, ex.getMessage(), null);
		} catch (Exception e) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.DELETE_RECORD_SUCESS, null);
	}

	/**
	 * SEARCH /_search/hrms-action-disciplinaries?query=:query : search for the
	 * hrmsActionDisciplinary corresponding to the query.
	 *
	 * @param query
	 *            the query of the hrmsActionDisciplinary search
	 * @return the result of the search
	 */
	@GetMapping("/search")
	public ResponseObject searchHrmsActionDisciplinaries(@RequestHeader(value = "userid", required = true) Long userid,
			@RequestParam String query) {
		log.debug("REST request to search HrmsActionDisciplinaries for query {}", query);
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_START);
		List<HrmsActionDisciplinaryDTO> data = new ArrayList<>();
		try {
			data = hrmsActionDisciplinaryService.search(query);
		} catch (HrmBussinessException ex) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + ex.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, ex.getMessage(), null);
		} catch (Exception e) {
			log.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
			return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR,
					ApplicationConstants.SERVER_ERROR, null);
		}
		log.debug(HrmCommonFunctionUtil.getCurrentMethodName() + ApplicationConstants.METHOD_END);
		return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_SUCCESS,
				ApplicationConstants.FETCH_RECORD_SUCESS, data);
	}

}
