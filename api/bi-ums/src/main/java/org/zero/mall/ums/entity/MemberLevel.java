package org.zero.mall.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 会员等级表
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member_level")
@ApiModel(value="MemberLevel对象", description="会员等级表")
public class MemberLevel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer growthPoint;

    @ApiModelProperty(value = "是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;

    @ApiModelProperty(value = "免运费标准")
    private BigDecimal freeFreightPoint;

    @ApiModelProperty(value = "每次评价获取的成长值")
    private Integer commentGrowthPoint;

    @ApiModelProperty(value = "是否有免邮特权")
    private Integer privilegeFreeFreight;

    @ApiModelProperty(value = "是否有签到特权")
    private Integer privilegeSignIn;

    @ApiModelProperty(value = "是否有评论获奖励特权")
    private Integer privilegeComment;

    @ApiModelProperty(value = "是否有专享活动特权")
    private Integer privilegePromotion;

    @ApiModelProperty(value = "是否有会员价格特权")
    private Integer privilegeMemberPrice;

    @ApiModelProperty(value = "是否有生日特权")
    private Integer privilegeBirthday;

    private String note;


}
