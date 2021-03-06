package com.jspxcms.plug.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.plug.domain.Browse;

public interface BrowseService {
	/**
	 * 添加收藏
	 * @param userId
	 * @param courseId
	 */
	public Browse addBrowse (Integer userId,Integer courseId);
	
	/**
	 * 按照用户ID查询
	 * @param userId
	 * @param limitCount
	 * @return
	 */
	public List<Browse> findByUserId(Integer userId,Pageable pageable); 
	
	public Browse get(Integer id);
}