package org.zero.mall.ums.util;

import cn.hutool.core.collection.CollectionUtil;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yezhaoxing
 * @date 2019/12/4
 */
public class BeanHelper {

    /**
     * 批量复制集合数据
     */
    public static <T> List<T> copyList(List<?> sourceList, Class<T> clazz) {
        List<T> targetList = new ArrayList<>();
        if (CollectionUtil.isNotEmpty(sourceList)) {
            for (Object o : sourceList) {
                T target = BeanUtils.instantiateClass(clazz);
                BeanUtils.copyProperties(o, target);
                targetList.add(target);
            }
        }
        return targetList;
    }
}
