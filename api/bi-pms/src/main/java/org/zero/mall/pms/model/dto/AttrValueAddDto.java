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
public class AttrValueAddDto implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "属性值名称")
    private String attrName;

    private Long attrId;
}
