/*******************************************************************************
 * // SPDX-FileCopyrightText: 2022 Aliou DIAITE
 * // SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package cabinet.medical.back.commons.enumeration;

public enum RoleEnum {

    ADMINISTRATOR("Administrator"),
    SUPERVISOR("Supervisor"),
    USER("User");

    final String value;

    RoleEnum(String value){
        this.value = value;
    }

    RoleEnum fromValue(String text){
        for(RoleEnum b : RoleEnum.values()){
            if(b.value.equals(text)) return b;
        }
        return null;
    }
}
