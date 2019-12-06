package org.zero.mall.pms.model.dto;

import lombok.Data;

/**
 * @author yezhaoxing
 * @date 2019/12/5
 */
@Data
public class CatalogQueryDto {

    private Long parentId;

    private Long currentPage;

    private Long pageSize;
}
