package com.dao;

import com.entity.DiscussxinwenshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinwenshipinVO;
import com.entity.view.DiscussxinwenshipinView;


/**
 * 新闻视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-13 12:59:43
 */
public interface DiscussxinwenshipinDao extends BaseMapper<DiscussxinwenshipinEntity> {
	
	List<DiscussxinwenshipinVO> selectListVO(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
	
	DiscussxinwenshipinVO selectVO(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
	
	List<DiscussxinwenshipinView> selectListView(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);

	List<DiscussxinwenshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
	
	DiscussxinwenshipinView selectView(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
	
}
