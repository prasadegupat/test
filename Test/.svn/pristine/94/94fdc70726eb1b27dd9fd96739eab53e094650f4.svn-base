package com.intellect.hrm.service.mapper;

import org.mapstruct.Mapper;

import com.intellect.hrm.domain.HrmsActionDisciplinary;
import com.intellect.hrm.service.dto.HrmsActionDisciplinaryDTO;

/**
 * Mapper for the entity HrmsActionDisciplinary and its DTO HrmsActionDisciplinaryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface HrmsActionDisciplinaryMapper extends EntityMapper<HrmsActionDisciplinaryDTO, HrmsActionDisciplinary> {

    default HrmsActionDisciplinary fromId(Long id) {
        if (id == null) {
            return null;
        }
        HrmsActionDisciplinary hrmsActionDisciplinary = new HrmsActionDisciplinary();
        hrmsActionDisciplinary.setId(id);
        return hrmsActionDisciplinary;
    }
}
