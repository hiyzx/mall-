package org.zero.mall.common.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zero.mall.common.enums.CodeEnum;
import org.zero.mall.common.enums.StringEnum;

/**
 * 基础的返回类
 *
 * @author yezhaoxing
 * @date 2017/4/29
 */
@ApiModel("基础返回vo对象")
@Data
@NoArgsConstructor
public class BaseReturnVo {

    final static String SUCCESS_DEFAULT_DESC = "success";
    @ApiModelProperty("返回码")
    private String resCode;
    @ApiModelProperty("返回说明")
    private String resDes;

    public BaseReturnVo(StringEnum codeEnum, String msg) {
        this.resCode = codeEnum.getCodeEnum();
        this.resDes = msg;
    }

    public static BaseReturnVo success() {
        return new BaseReturnVo(CodeEnum.SUCCESS, SUCCESS_DEFAULT_DESC);
    }
}
