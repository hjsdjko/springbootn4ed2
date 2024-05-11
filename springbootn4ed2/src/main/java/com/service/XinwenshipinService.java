package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenshipinView;


/**
 * 新闻视频
 *
 * @author 
 * @email 
 * @date 2021-05-13 12:59:43
 */
public interface XinwenshipinService extends IService<XinwenshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenshipinVO> selectListVO(Wrapper<XinwenshipinEntity> wrapper);
   	
   	XinwenshipinVO selectVO(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
   	
   	List<XinwenshipinView> selectListView(Wrapper<XinwenshipinEntity> wrapper);
   	
   	XinwenshipinView selectView(@Param("ew") Wrapper<XinwenshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenshipinEntity> wrapper);
   	
}

