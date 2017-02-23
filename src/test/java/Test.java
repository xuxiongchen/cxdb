

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cxdb.common.ServiceException;
import com.cxdb.datasource.BaseDao;


public class Test {
	private static Logger logger = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) throws Exception {
		// 生成javabean
		try {
			new BaseDao()
					.generateJavaBean(
							"class_info",
							"j:/test",
							"com.cxdb.model");
		} catch (ServiceException e) {
		}

	}
}
