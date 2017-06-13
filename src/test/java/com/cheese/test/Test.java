package com.cheese.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Yang Jian
 *
 * 2017年6月12日
 */
public class Test {
	 private final static SqlSessionFactory sqlSessionFactory;
	    static {
	        String resource = "mybatis-config.xml";
	        Reader reader = null;
	        try {
	            reader = Resources.getResourceAsReader(resource);
	        } catch (IOException e) {
	            System.out.println(e.getMessage());

	        }
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	    }

	    public static SqlSessionFactory getSqlSessionFactory() {
	        return sqlSessionFactory;
	    }	
	    private static Logger logger = LogManager.getLogger(Test.class);  
	    public static void main(String[] args) {
//	    	System.out.println("Test....");
//	    	SqlSession session = sqlSessionFactory.openSession();
//	    	int i = session.insert("test.mybatis.UserMapper.insertTest", 1);
//	    	System.out.println(i);
//	    	session.commit();
	    	logger.info("test");
		}
}
