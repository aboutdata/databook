package com.anhao.domain;

/**
 * ʵ���� - ��ɫ
*
 */

public class Role extends ABaseEntity {

    private static final long serialVersionUID = -2611029643225710436L;

    private String name;// ��ɫ���
    private String value;// ��ɫ��ʶ
    private Boolean isSystem;// �Ƿ�Ϊϵͳ���ý�ɫ
    private String description;// ����

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
