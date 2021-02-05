package com.qinshi.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinshi.core.bean.PageVo;
import com.qinshi.core.bean.Query;
import com.qinshi.core.bean.QueryCondition;
import com.qinshi.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.qinshi.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.qinshi.gmall.pms.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );
        return new PageVo(page);
    }

    @Override
    public void deleteAttr(List<AttrAttrgroupRelationEntity> relationEntities) {

    }
}
