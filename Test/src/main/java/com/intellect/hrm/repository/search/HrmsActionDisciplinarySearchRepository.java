package com.intellect.hrm.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.intellect.hrm.domain.HrmsActionDisciplinary;

/**
 * Spring Data Elasticsearch repository for the HrmsActionDisciplinary entity.
 */
public interface HrmsActionDisciplinarySearchRepository extends ElasticsearchRepository<HrmsActionDisciplinary, Long> {
}
