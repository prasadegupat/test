package com.intellect.hrm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intellect.hrm.domain.HrmsActionDisciplinary;
import com.intellect.hrm.exception.HrmBussinessException;
import com.intellect.hrm.repository.HrmsActionDisciplinaryRepository;
import com.intellect.hrm.repository.search.HrmsActionDisciplinarySearchRepository;
import com.intellect.hrm.service.HrmsActionDisciplinaryService;
import com.intellect.hrm.service.dto.HrmsActionDisciplinaryDTO;

/**
 * Service Implementation for managing HrmsActionDisciplinary.
 */
@Service
@Transactional
public class HrmsActionDisciplinaryServiceImpl implements HrmsActionDisciplinaryService {

	private final Logger log = LoggerFactory.getLogger(HrmsActionDisciplinaryServiceImpl.class);

	private final HrmsActionDisciplinaryRepository hrmsActionDisciplinaryRepository;

	//private final HrmsActionDisciplinaryMapper hrmsActionDisciplinaryMapper;

	private final HrmsActionDisciplinarySearchRepository hrmsActionDisciplinarySearchRepository;

	public HrmsActionDisciplinaryServiceImpl(HrmsActionDisciplinaryRepository hrmsActionDisciplinaryRepository,
			//HrmsActionDisciplinaryMapper hrmsActionDisciplinaryMapper,
			HrmsActionDisciplinarySearchRepository hrmsActionDisciplinarySearchRepository){
		this.hrmsActionDisciplinaryRepository = hrmsActionDisciplinaryRepository;
	//	this.hrmsActionDisciplinaryMapper = hrmsActionDisciplinaryMapper;
		this.hrmsActionDisciplinarySearchRepository = hrmsActionDisciplinarySearchRepository;
	}

	/**
	 * Save a hrmsActionDisciplinary.
	 *
	 * @param hrmsActionDisciplinaryDTO
	 *            the entity to save
	 * @return the persisted entity
	 */
	@Override
	public HrmsActionDisciplinaryDTO save(HrmsActionDisciplinaryDTO hrmsActionDisciplinaryDTO)
			throws HrmBussinessException {
		log.debug("Request to save HrmsActionDisciplinary : {}", hrmsActionDisciplinaryDTO);
		HrmsActionDisciplinary hrmsActionDisciplinary = new HrmsActionDisciplinary();
		hrmsActionDisciplinary.setAction(hrmsActionDisciplinaryDTO.getAction());
		hrmsActionDisciplinary.setCreatedOn(hrmsActionDisciplinaryDTO.getCreatedOn());
		hrmsActionDisciplinary.setCreatedBy(hrmsActionDisciplinaryDTO.getCreatedBy());
		hrmsActionDisciplinary.setModifiedBy(hrmsActionDisciplinaryDTO.getModifiedBy());
		hrmsActionDisciplinary.setModifiedOn(hrmsActionDisciplinaryDTO.getModifiedOn());
		hrmsActionDisciplinary.setDescription(hrmsActionDisciplinaryDTO.getDescription());
		hrmsActionDisciplinary = hrmsActionDisciplinaryRepository.save(hrmsActionDisciplinary);
		hrmsActionDisciplinarySearchRepository.save(hrmsActionDisciplinary);
		return hrmsActionDisciplinaryDTO;
	}

	/**
	 * Get all the hrmsActionDisciplinaries.
	 *
	 * @return the list of entities
	 */
	@Override
	@Transactional(readOnly = true)
	public List<HrmsActionDisciplinaryDTO> findAll() throws HrmBussinessException {
		log.debug("Request to get all HrmsActionDisciplinaries");
		return null;
	}

	/**
	 * Get one hrmsActionDisciplinary by id.
	 *
	 * @param id
	 *            the id of the entity
	 * @return the entity
	 */
	@Override
	@Transactional(readOnly = true)
	public HrmsActionDisciplinaryDTO findOne(Long id) throws HrmBussinessException {
		log.debug("Request to get HrmsActionDisciplinary : {}", id);
		HrmsActionDisciplinary hrmsActionDisciplinary = hrmsActionDisciplinaryRepository.findOne(id);
		return null;

	}

	/**
	 * Delete the hrmsActionDisciplinary by id.
	 *
	 * @param id
	 *            the id of the entity
	 */
	@Override
	public void delete(Long id) throws HrmBussinessException {
		log.debug("Request to delete HrmsActionDisciplinary : {}", id);
		hrmsActionDisciplinaryRepository.delete(id);
		//hrmsActionDisciplinarySearchRepository.delete(id);
	}

	/**
	 * Search for the hrmsActionDisciplinary corresponding to the query.
	 *
	 * @param query
	 *            the query of the search
	 * @return the list of entities
	 */
	@Override
	@Transactional(readOnly = true)
	public List<HrmsActionDisciplinaryDTO> search(String query) throws HrmBussinessException {
		log.debug("Request to search HrmsActionDisciplinaries for query {}", query);
		return null;
	}
}
