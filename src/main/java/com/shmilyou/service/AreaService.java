package com.shmilyou.service;

import com.shmilyou.entity.Area;

import java.util.List;

/**
 * Created with 岂止是一丝涟漪     530060499@qq.com    2018/8/22
 */
public interface AreaService extends BaseService<Area> {

    /**
     * 根据地区全称搜索
     *
     * @param fullAreaName
     * @return
     */
    Area queryByFullName(String fullAreaName);

    /**
     * 加载下级地区
     *
     * @param parentId
     */
    List<Area> queryByParentId(Integer parentId);
}
