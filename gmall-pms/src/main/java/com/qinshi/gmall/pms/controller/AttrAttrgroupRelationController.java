package com.qinshi.gmall.pms.controller;

import com.qinshi.core.bean.PageVo;
import com.qinshi.core.bean.QueryCondition;
import com.qinshi.core.bean.Resp;
import com.qinshi.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.qinshi.gmall.pms.service.AttrAttrgroupRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "属性&属性分组关联 管理")
@RequestMapping("pms/attrattrgrouprelation")
public class AttrAttrgroupRelationController {

    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    @PostMapping("/delete/attr")
    public Resp<String> deleteAttr(@RequestBody List<AttrAttrgroupRelationEntity> relationEntities){
        attrAttrgroupRelationService.deleteAttr(relationEntities);
        return Resp.ok("删除成功");
    }


    @GetMapping("/list")
    @ApiOperation("分页查询(排序)")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition){
        PageVo pageVo = attrAttrgroupRelationService.queryPage(queryCondition);
        return Resp.ok(pageVo);
    }


}
