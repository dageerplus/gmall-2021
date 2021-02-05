package com.qinshi.gmall.pms.vo;


import com.qinshi.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.qinshi.gmall.pms.entity.AttrEntity;
import com.qinshi.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class GroupVO extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;

    private List<AttrAttrgroupRelationEntity> relations;
}
