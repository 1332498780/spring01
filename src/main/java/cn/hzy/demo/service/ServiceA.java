package cn.hzy.demo.service;

import cn.hzy.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.function.Consumer;

@Service
public class ServiceA {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TransactionTemplate transactionTemplate;


    @Transactional
    public void a(){

        studentDao.insert(4);
        try {
            studentDao.insert(1);
        }catch (Exception e){

        }
    }

    /***
     * 编程式事务
     */
    public void b(){
        transactionTemplate.executeWithoutResult(new Consumer<TransactionStatus>() {
            public void accept(TransactionStatus transactionStatus) {
                try {
                    studentDao.insert(5);
                    studentDao.insert(1);
                }catch (Exception e){
                    //回滚
                    transactionStatus.setRollbackOnly();
                }
            }
        });
    }

}
