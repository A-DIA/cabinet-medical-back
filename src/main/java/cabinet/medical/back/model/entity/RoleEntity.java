/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.entity;

import cabinet.medical.back.commons.enumeration.RoleEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class RoleEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "role", nullable = false)
    private RoleEnum role;

    @OneToMany(mappedBy = "roleEntity", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<UserEntity> userEntities = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleEntity)) return false;
        RoleEntity that = (RoleEntity) o;
        return getRole() == that.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRole());
    }
}
