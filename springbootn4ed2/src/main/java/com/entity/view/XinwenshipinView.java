package com.entity.view;

import com.entity.XinwenshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-13 12:59:43
 */
@TableName("xinwenshipin")
public class XinwenshipinView  extends XinwenshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenshipinView(){
	}
 
 	public XinwenshipinView(XinwenshipinEntity xinwenshipinEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
