package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GeshouxinxiEntity;
import com.entity.view.GeshouxinxiView;

import com.service.GeshouxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 歌手信息
 * 后端接口
 * @author 
 * @email 
 * @date 2025-03-12 23:22:19
 */
@RestController
@RequestMapping("/geshouxinxi")
public class GeshouxinxiController {
    @Autowired
    private GeshouxinxiService geshouxinxiService;

    @Autowired
    private StoreupService storeupService;





    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GeshouxinxiEntity geshouxinxi,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<GeshouxinxiEntity> ew = new EntityWrapper<GeshouxinxiEntity>();


        //查询结果
		PageUtils page = geshouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, geshouxinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GeshouxinxiEntity geshouxinxi, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<GeshouxinxiEntity> ew = new EntityWrapper<GeshouxinxiEntity>();

        //查询结果
		PageUtils page = geshouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, geshouxinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GeshouxinxiEntity geshouxinxi){
       	EntityWrapper<GeshouxinxiEntity> ew = new EntityWrapper<GeshouxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( geshouxinxi, "geshouxinxi")); 
        return R.ok().put("data", geshouxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GeshouxinxiEntity geshouxinxi){
        EntityWrapper< GeshouxinxiEntity> ew = new EntityWrapper< GeshouxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( geshouxinxi, "geshouxinxi")); 
		GeshouxinxiView geshouxinxiView =  geshouxinxiService.selectView(ew);
		return R.ok("查询歌手信息成功").put("data", geshouxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GeshouxinxiEntity geshouxinxi = geshouxinxiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(geshouxinxi,deSens);
        return R.ok().put("data", geshouxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GeshouxinxiEntity geshouxinxi = geshouxinxiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(geshouxinxi,deSens);
        return R.ok().put("data", geshouxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GeshouxinxiEntity geshouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(geshouxinxi);
        geshouxinxiService.insert(geshouxinxi);
        return R.ok().put("data",geshouxinxi.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GeshouxinxiEntity geshouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(geshouxinxi);
        geshouxinxiService.insert(geshouxinxi);
        return R.ok().put("data",geshouxinxi.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GeshouxinxiEntity geshouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(geshouxinxi);
        //全部更新
        geshouxinxiService.updateById(geshouxinxi);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        geshouxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
