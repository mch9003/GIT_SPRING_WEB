package com.sist.user.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import com.sist.common.DTO;
/**
 * UserSvc.java
 * 
 * @author sist_
 *
 */
@Transactional
public interface UserSvc {
	/**
	 * checked된것 삭제
	 * @param list
	 * @return int
	 */
	@Transactional
	public int do_checkedDelete(List<String> list);
	/**
	 * 삭제
	 * @param dto
	 * @return int (1:성공,1이 아니면 실패)
	 */
	public int do_delete(DTO dto);  
	
	/**
	 * 수정
	 * @param dto
	 * @return int (1:성공,1이 아니면 실패)
	 */
	public int do_update(DTO dto);
	
	/**
	 * 1이면 성공 그렇치 않으면 실패
	 * @param dto
	 * @return 1 
	 * @throws DataAccessException
	 */
	public int do_save(DTO dto)throws DataAccessException;
	
	/**
	 * 1이면 성공 그렇치 않으면 실패
	 * @param dto
	 * @return 1 
	 * @throws DataAccessException
	 */
	public int do_saveAll(List<DTO> list)throws DataAccessException;
	
	/**
	 * 전체조회
	 * @param dto
	 * @return  List<UserVO>
	 */
	public List<?> do_search(DTO dto) ;
	
	/**
	 * 단건조회
	 * @param dto(id=?)
	 * @return UserVO
	 */
	public DTO do_searchOne(DTO dto);
	
}
