package com.intellect.hrm.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * A HrmsActionDisciplinary.
 */
@Entity
@Table(name = "hrms_action_disciplinary")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "hrmsactiondisciplinary")
public class HrmsActionDisciplinary implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "action")
    private String action;

    @Column(name = "description")
    private String description;

    @Column(name = "created_on")
    private Long createdOn;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_on")
    private Long modifiedOn;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "is_active")
    private Integer isActive;
    
    @Column(name = "is_Inactive")
    private Integer isInActive;

    public Integer getIsInActive() {
		return isInActive;
	}

	public void setIsInActive(Integer isInActive) {
		this.isInActive = isInActive;
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public HrmsActionDisciplinary action(String action) {
        this.action = action;
        return this;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public HrmsActionDisciplinary description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public HrmsActionDisciplinary createdOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public HrmsActionDisciplinary createdBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedOn() {
        return modifiedOn;
    }

    public HrmsActionDisciplinary modifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
        return this;
    }

    public void setModifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public HrmsActionDisciplinary modifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public HrmsActionDisciplinary isActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HrmsActionDisciplinary hrmsActionDisciplinary = (HrmsActionDisciplinary) o;
        if (hrmsActionDisciplinary.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), hrmsActionDisciplinary.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "HrmsActionDisciplinary{" +
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
