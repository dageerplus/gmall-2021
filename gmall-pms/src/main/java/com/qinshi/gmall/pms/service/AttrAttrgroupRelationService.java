package com.qinshi.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinshi.core.bean.PageVo;
import com.qinshi.core.bean.QueryCondition;
import com.qinshi.gmall.pms.entity.AttrAttrgroupRelationEntity;

import java.util.List;

public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);

    void deleteAttr(List<AttrAttrgroupRelationEntity> relationEntities);
}
