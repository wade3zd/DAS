package dwz.framework.overall.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.mail.EmailException;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dwz.common.MailTemplateKey;
import dwz.framework.config.AppConfiguration;
import dwz.framework.config.Constants;
import dwz.framework.das.InfOverallServiceMgr;
import dwz.framework.mail.Mail;
import dwz.framework.mail.MailManager;
import dwz.framework.sys.business.AbstractBusinessObjectServiceMgr;
import dwz.framework.sys.business.BusinessFactory;
import dwz.framework.sys.exception.ServiceException;
import dwz.framework.user.User;
import dwz.framework.user.UserServiceMgr;
import dwz.framework.user.UserStatus;
import dwz.persistence.BaseConditionVO;
import dwz.persistence.beans.InfOverall;
import dwz.persistence.beans.SysUser;
import dwz.persistence.mapper.SysUserMapper;
import dwz.persistence.mapper_overall.OverallMapper;

@Transactional(rollbackFor = Exception.class)
@Service(InfOverallServiceMgr.SERVICE_NAME)
public class OverallImpl 
		implements InfOverallServiceMgr {
	
	@Autowired
	private OverallMapper overallMapper;
	

/*	public List<User> searchUser(BaseConditionVO vo) {
		List<User> bos = new ArrayList<User>();
		RowBounds rb = new RowBounds(vo.getStartIndex(), vo.getPageSize());
		List<SysUser> pos = userMapper.findPageBreakByCondition(vo, rb);
		for (SysUser po : pos) {
			bos.add(new User(po));
		}
		return bos;
	}*/

	@Override
	public String findByDate(String stratDate, String endDate) {
		// TODO Auto-generated method stub
		String res="";
		List<InfOverall> infs = new ArrayList<InfOverall>();
		infs=overallMapper.findByDate(stratDate, endDate);
		for(InfOverall inf:infs){
			res=res+inf.toString()+"||";
		}
		return res;
	}

}
