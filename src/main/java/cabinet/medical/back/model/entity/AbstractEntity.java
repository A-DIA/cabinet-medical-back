/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.UUID;

@Getter
public abstract class AbstractEntity {

    @Id
    @Column(name = "id", nullable = false)
    protected UUID id = UUID.randomUUID();

}
