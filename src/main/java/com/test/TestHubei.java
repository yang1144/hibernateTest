package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHubei {
    /**
     * Created by Administrator on 2018.11.17.
     */

        private SessionFactory sessionFactory;
        private Session session;
        private Transaction transaction;

        @Before
        public void init() {
            Configuration configuration = new Configuration().configure();//创建配置对象
            sessionFactory = configuration.buildSessionFactory();//创建会话工厂
            session = sessionFactory.openSession();//开启会话
            transaction = session.beginTransaction();//开启事务
        }

        @After
        public void destory() {
            transaction.commit();//事务提交
            session.close();//关闭会话
            sessionFactory.close();//关闭会话工厂
        }

        @Test
        public void testHubei() {
            //生成对象
            Hubei hbei = new Hubei(1, "女朋友", 2333.33);
            //保存对象进数据库
            session.save(hbei);
        }
    }


