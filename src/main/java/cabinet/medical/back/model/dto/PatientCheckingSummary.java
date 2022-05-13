/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.dto;

import cabinet.medical.back.commons.enumeration.GenderEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class PatientCheckingSummary {
    String FirstName;
    String lastName;
    int Age;
    GenderEnum gender;
    Map<LocalDateTime, List<SingleMedicalActeDto>> localDateTimeListMap;
}
