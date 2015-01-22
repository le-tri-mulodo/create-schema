/**
 * 
 */
package com.mulodo.miniblog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mulodo.miniblog.dao.UserDAO;
import com.mulodo.miniblog.pojo.User;

/**
 * @author TriLe
 *
 */
public class Main {

    /**
     * @param args
     */

    static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
	// logger.entry(args);
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	userDAO.add(new User());
	logger.exit();
    }

}
