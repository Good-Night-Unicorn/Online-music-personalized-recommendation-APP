package com.dao;

import com.entity.GequxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GequxinxiVO;
import com.entity.view.GequxinxiView;


/**
 * 歌曲信息
 * 
 * @author 
 * @email 
 * @date 2025-03-12 23:22:19
 */
public interface GequxinxiDao extends BaseMapper<GequxinxiEntity> {
	
	List<GequxinxiVO> selectListVO(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
	GequxinxiVO selectVO(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
	List<GequxinxiView> selectListView(@Param("ew") Wrapper<GequxinxiEntity> wrapper);

	List<GequxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GequxinxiEntity> wrapper);

	
	GequxinxiView selectView(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GequxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GequxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GequxinxiEntity> wrapper);



}
