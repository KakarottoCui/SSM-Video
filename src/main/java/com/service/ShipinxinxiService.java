package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinxinxiView;


/**
 * 视频信息
 *
 * @author 
 * @email 
 * @date 2021-03-23 18:16:50
 */
public interface ShipinxinxiService extends IService<ShipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinxinxiVO> selectListVO(Wrapper<ShipinxinxiEntity> wrapper);
   	
   	ShipinxinxiVO selectVO(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
   	
   	List<ShipinxinxiView> selectListView(Wrapper<ShipinxinxiEntity> wrapper);
   	
   	ShipinxinxiView selectView(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinxinxiEntity> wrapper);
   	
}

