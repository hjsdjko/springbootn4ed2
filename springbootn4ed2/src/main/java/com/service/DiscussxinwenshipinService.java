package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinwenshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinwenshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinwenshipinView;


/**
 * 新闻视频评论表
 *
 * @author 
 * @email 
 * @date 2021-05-13 12:59:43
 */
public interface DiscussxinwenshipinService extends IService<DiscussxinwenshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwenshipinVO> selectListVO(Wrapper<DiscussxinwenshipinEntity> wrapper);
   	
   	DiscussxinwenshipinVO selectVO(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
   	
   	List<DiscussxinwenshipinView> selectListView(Wrapper<DiscussxinwenshipinEntity> wrapper);
   	
   	DiscussxinwenshipinView selectView(@Param("ew") Wrapper<DiscussxinwenshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwenshipinEntity> wrapper);
   	
}

