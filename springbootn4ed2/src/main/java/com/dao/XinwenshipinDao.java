package com.dao;

import com.entity.XinwenshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenshipinVO;
import com.entity.view.XinwenshipinView;


/**
 * 新闻视频
 * 
 * @author 
 * @email 
 * @date 2021-05-13 12:59:43
 */
public interface XinwenshipinDao extends BaseMapper<XinwenshipinEntity> {
	
	List<XinwenshipinVO> selectListVO(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
	
	XinwenshipinVO selectVO(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
	
	List<XinwenshipinView> selectListView(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);

	List<XinwenshipinView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
	
	XinwenshipinView selectView(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
	
}
