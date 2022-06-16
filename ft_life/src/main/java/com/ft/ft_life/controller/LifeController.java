package com.ft.ft_life.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ft.ft_common.Response;
import com.ft.ft_life.entity.Life;
import com.ft.ft_life.service.LifeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 说说控制器
 * {@code @author:} 一枚方糖
 */
@RestController
@RequestMapping("/life")
@Api(value = "说说控制器", tags = "说说控制器")
public class LifeController {

    @Resource
    private LifeService lifeService;

    @PostMapping("/add")
    @ApiOperation("添加说说")
    public Response add(@RequestBody Life life) {
        return Response.ok().data("data", lifeService.save(life));
    }

    @PostMapping("/del")
    @ApiOperation("删除说说")
    public Response del(@RequestParam(value = "id") String id) {
        return Response.ok().data("data", lifeService.removeById(id));
    }

    @GetMapping("/list")
    @ApiOperation("列表说说")
    public Response list(int cur, int size) {
        Page<Life> page = new Page<>(cur, size);
        lifeService.page(page, new LambdaQueryWrapper<Life>().orderByDesc(Life::getTime));
        return Response.ok().data("list", page.getRecords()).data("total", page.getTotal());
    }

    @GetMapping("/look")
    @ApiOperation("查看说说")
    public Response look(String id) {
        return Response.ok().data("data", lifeService.getById(id));
    }

    @PostMapping("/edit")
    @ApiOperation("编辑说说")
    public Response edit(@RequestBody Life life) {
        return Response.ok().data("data", lifeService.updateById(life));

    }
}