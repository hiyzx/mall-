package org.zero.mall.common.enums;

/**
 * 状态码
 *
 * @author yezhaoxing
 * @date 2017/4/29
 */
public enum CodeEnum implements StringEnum {


    SUCCESS("200"),

    NOT_LOGIN("403"),

    FORBIDDEN("401");



    private String codeEnum;

    CodeEnum(String value) {
        this.codeEnum = value;
    }

    @Override
    public String getCodeEnum() {
        return codeEnum;
    }

}
