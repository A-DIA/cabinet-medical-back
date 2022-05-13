/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class HistoriqueEntity extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "total_payed", nullable = false)
    private Double totalPayed;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "summary", nullable = false)
    String summary;
}
