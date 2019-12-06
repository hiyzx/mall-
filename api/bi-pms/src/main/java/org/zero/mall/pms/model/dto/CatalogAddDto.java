package org.zero.mall.pms.model.dto;

import lombok.Data;

/**
 * @author yezhaoxing
 * @date 2019/12/5
 */
@Data
public class CatalogAddDto {

    private Long parentId;

    private Long type;

    private String name;
}
