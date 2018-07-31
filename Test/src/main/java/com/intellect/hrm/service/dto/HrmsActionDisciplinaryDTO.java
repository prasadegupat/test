package com.intellect.hrm.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the HrmsActionDisciplinary entity.
 */
public class HrmsActionDisciplinaryDTO implements Serializable {

    private Long id;

    private String action;

    private String description;

    private Long createdOn;

    private Long createdBy;

    private Long modifiedOn;

    private Long modifiedBy;

    private Integer isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HrmsActionDisciplinaryDTO hrmsActionDisciplinaryDTO = (HrmsActionDisciplinaryDTO) o;
        if (hrmsActionDisciplinaryDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), hrmsActionDisciplinaryDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "HrmsActionDisciplinaryDTO{" +
            "id=" + getId() +
            ", action='" + getAction() + "'" +
            ", description='" + getDescription() + "'" +
            ", createdOn=" + getCreatedOn() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedOn=" + getModifiedOn() +
            ", modifiedBy=" + getModifiedBy() +
            ", isActive=" + getIsActive() +
            "}";
    }
}
