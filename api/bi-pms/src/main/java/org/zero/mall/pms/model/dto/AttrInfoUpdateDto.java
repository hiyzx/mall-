package org.zero.mall.pms.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 属性表
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@Data
public class AttrInfoUpdateDto implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    @ApiModelProperty(value = "属性名称")
    private String attrName;
}
