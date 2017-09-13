package com.sist.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sist.common.DTO;
import com.sist.user.dao.UserDao;
import com.sist.user.domain.UserVO;
/**
 * UserSvcImpl.java
 * @author sist_
 *
 */
@Service
@Transactional
public class UserSvcImpl implements UserSvc {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired 
	private UserDao userDao;
	
	/**
	 * 다건삭제
	 * @param dto
	 * @return int (1:성공,1이 아니면 실패)
	 */
	@Transactional
	public int do_checkedDelete(List<String> list)throws DataAccessException {
		log.debug("2=======================");
		log.debug(list.toString());
		log.debug("2=======================");	
		int flag = 0;
		try {
			for(String id:list) {
				UserVO vo=new UserVO();
				vo.setId(id);
				int one = userDao.do_delete(vo);
				flag+=one;
			}
		}catch(DataAccessException e) {
			log.debug("2DataAccessException=======================");
			log.debug(e.toString());
			log.debug("2=======================");				
			throw e;
		}
		return flag;		
	}
	
	
	/**
	 * 삭제
	 * @param dto
	 * @return int (1:성공,1이 아니면 실패)
	 */
	public int do_delete(DTO dto) {
		log.debug("2=======================");
		log.debug(dto.toString());
		log.debug("2=======================");	
		return userDao.do_delete(dto);		
	}
	
	/**
	 * 수정
	 * @param dto
	 * @return int (1:성공,1이 아니면 실패)
	 */
	public int do_update(DTO dto) {
		log.debug("2=======================");
		log.debug(dto.toString());
		log.debug("2=======================");	
		return userDao.do_update(dto);		
	}
	

	/**
	 * 단건조회
	 * @param dto(id=?)
	 * @return UserVO
	 */
	public DTO do_searchOne(DTO dto) {
		log.debug("2=======================");
		log.debug(dto.toString());
		log.debug("2=======================");	
		return userDao.do_searchOne(dto);	
	}
	
	/**
	 * 전체조회
	 * @param dto
	 * @return  List<UserVO>
	 */
	public List<?> do_search(DTO dto){
		log.debug("2=======================");
		log.debug(dto.toString());
		log.debug("2=======================");	
		return userDao.do_search(dto);
		
	}
	
	@Override
	/**
	 * 사용자 등록 
	 */
	public int do_save(DTO dto) throws DataAccessException {
		log.debug("2=======================");
		log.debug(dto.toString());
		log.debug("2=======================");
		return userDao.do_save(dto);
	}


	@Override
	public int do_saveAll(List<DTO> list) throws DataAccessException {
		log.debug("2=======================");
		log.debug(list.toString());
		log.debug("2=======================");	
		int flag = 0;
		try {
			for(DTO vo: list) {
				UserVO userVO=(UserVO)vo;
				int one = userDao.do_delete(userVO);
				flag+=one;				
			}
			
		}catch(DataAccessException e) {
			log.debug("2DataAccessException=======================");
			log.debug(e.toString());
			log.debug("2=======================");				
			throw e;
		}
		return flag;	
	}

}
