package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxinwenshipinDao;
import com.entity.DiscussxinwenshipinEntity;
import com.service.DiscussxinwenshipinService;
import com.entity.vo.DiscussxinwenshipinVO;
import com.entity.view.DiscussxinwenshipinView;

@Service("discussxinwenshipinService")
public class DiscussxinwenshipinServiceImpl extends ServiceImpl<DiscussxinwenshipinDao, DiscussxinwenshipinEntity> implements DiscussxinwenshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinwenshipinEntity> page = this.selectPage(
                new Query<DiscussxinwenshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussxinwenshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinwenshipinEntity> wrapper) {
		  Page<DiscussxinwenshipinView> page =new Query<DiscussxinwenshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinwenshipinVO> selectListVO(Wrapper<DiscussxinwenshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinwenshipinVO selectVO(Wrapper<DiscussxinwenshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinwenshipinView> selectListView(Wrapper<DiscussxinwenshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinwenshipinView selectView(Wrapper<DiscussxinwenshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
