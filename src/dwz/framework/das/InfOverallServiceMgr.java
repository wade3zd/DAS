package dwz.framework.das;

import java.util.Date;
import java.util.List;
import dwz.persistence.beans.InfOverall;

public interface InfOverallServiceMgr {
	String SERVICE_NAME = "InfOverallServiceMgr";
	String findByDate(String startDate,String endDate);
}
