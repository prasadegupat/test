package com.intellect.hrm.service;

import java.util.List;

import com.intellect.hrm.exception.HrmBussinessException;
import com.intellect.hrm.service.dto.HrmsActionDisciplinaryDTO;

/**
 * Service Interface for managing HrmsActionDisciplinary.
 */
public interface HrmsActionDisciplinaryService {

	/**
	 * Save a hrmsActionDisciplinary.
	 *
	 * @param hrmsActionDisciplinaryDTO
	 *            the entity to save
	 * @return the persisted entity
	 */
	HrmsActionDisciplinaryDTO save(HrmsActionDisciplinaryDTO hrmsActionDisciplinaryDTO) throws HrmBussinessException;

	/**
	 * Get all the hrmsActionDisciplinaries.
	 *
	 * @return the list of entities
	 */
	List<HrmsActionDisciplinaryDTO> findAll() throws HrmBussinessException;

	/**
	 * Get the "id" hrmsActionDisciplinary.
	 *
	 * @param id
	 *            the id of the entity
	 * @return the entity
	 */
	HrmsActionDisciplinaryDTO findOne(Long id) throws HrmBussinessException;

	/**
	 * Delete the "id" hrmsActionDisciplinary.
	 *
	 * @param id
	 *            the id of the entity
	 */
	void delete(Long id) throws HrmBussinessException;

	/**
	 * Search for the hrmsActionDisciplinary corresponding to the query.
	 *
	 * @param query
	 *            the query of the search
	 * 
	 * @return the list of entities
	 */
	List<HrmsActionDisciplinaryDTO> search(String query) throws HrmBussinessException;
}
