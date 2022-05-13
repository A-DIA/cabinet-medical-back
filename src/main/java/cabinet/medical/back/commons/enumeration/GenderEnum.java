/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.commons.enumeration;

public enum GenderEnum {
    FEMALE("Female"),
    MALE("male");
    final String value;

    GenderEnum(String value){
        this.value = value;
    }

    GenderEnum fromValue(String text){
        for(GenderEnum b : GenderEnum.values()){
            if(b.value.equals(text)) return b;
        }
        return null;
    }
}
