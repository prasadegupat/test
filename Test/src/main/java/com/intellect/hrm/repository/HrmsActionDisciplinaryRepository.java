package com.intellect.hrm.repository;

import com.intellect.hrm.domain.HrmsActionDisciplinary;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the HrmsActionDisciplinary entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HrmsActionDisciplinaryRepository extends JpaRepository<HrmsActionDisciplinary, Long> {

}
