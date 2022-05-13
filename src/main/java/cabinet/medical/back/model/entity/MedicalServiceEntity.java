/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
public class MedicalServiceEntity extends AbstractEntity{

    @Column(name = "label", nullable = false)
    private String label;

    @OneToMany(mappedBy = "medicalServiceEntity", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<MedicalActeEntity> acteMedicalEntities = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicalServiceEntity)) return false;
        MedicalServiceEntity that = (MedicalServiceEntity) o;
        return getLabel().equals(that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel());
    }
}
