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


import com.dao.XinwenshipinDao;
import com.entity.XinwenshipinEntity;
import com.service.XinwenshipinService;
import com.entity.vo.XinwenshipinVO;
import com.entity.view.XinwenshipinView;

@Service("xinwenshipinService")
public class XinwenshipinServiceImpl extends ServiceImpl<XinwenshipinDao, XinwenshipinEntity> implements XinwenshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenshipinEntity> page = this.selectPage(
                new Query<XinwenshipinEntity>(params).getPage(),
                new EntityWrapper<XinwenshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenshipinEntity> wrapper) {
		  Page<XinwenshipinView> page =new Query<XinwenshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenshipinVO> selectListVO(Wrapper<XinwenshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenshipinVO selectVO(Wrapper<XinwenshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenshipinView> selectListView(Wrapper<XinwenshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenshipinView selectView(Wrapper<XinwenshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
