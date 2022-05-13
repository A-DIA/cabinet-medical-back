/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class EcbcDto {
    List<SingleMedicalActeDto> singleMedicalActe;
}
