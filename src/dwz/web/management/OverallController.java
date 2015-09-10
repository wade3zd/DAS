package dwz.web.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import dwz.framework.das.InfOverallServiceMgr;
import dwz.framework.enums.Gender;
import dwz.framework.sys.exception.ServiceException;
import dwz.framework.user.User;
import dwz.framework.user.UserServiceMgr;
import dwz.framework.user.UserStatus;
import dwz.persistence.BaseConditionVO;
import dwz.web.BaseController;

@Controller("management.overallController")
@RequestMapping(value="/management/overall")
public class OverallController extends BaseController{
	@Autowired
	private InfOverallServiceMgr infOverall;
	Gson gson=new Gson();  
	@RequestMapping("")
	@ResponseBody 
	public String list( Model model) {
		String meg = infOverall.findByDate("2015-09-01","2015-09-08");		
		model.addAttribute("message", meg);
		return gson.toJson(meg);
	}
	
	
}
