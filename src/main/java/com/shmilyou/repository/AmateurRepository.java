package com.shmilyou.repository;

import com.shmilyou.entity.Amateur;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with 岂止是一丝涟漪     530060499@qq.com    2018/8/18
 */
public interface AmateurRepository extends BaseRepository<Amateur> {

    /**
     * like模糊查询
     *
     * @param place
     * @return
     */
    List<Amateur> queryByPlace(String place);

    /**
     * 根据标签查询爱好者（连表)
     *
     * @param tagName   标签名
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Amateur> queryByTagName(String tagName, int pageIndex, int pageSize);

    /**
     * 根据【标签id】查询爱好者（连表）
     * @param tagId
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Amateur> queryByTagId(@Param("tagId") String tagId, @Param("pageIndex") int pageIndex,
                               @Param("pageSize") int pageSize);
}
