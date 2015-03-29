/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.as.quickstart.hibernate4.bean;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;
import org.slf4j.Logger;

/**
 *
 * @author youyou
 */
@Singleton
public class MakeHtml {
    
    @Inject
    private Logger log;
//    
    
    @Schedule(hour = "*",minute = "*",second = "*/5")
    public void doWork(){
        log.debug("你好啊的当前时间是："+new Date());
        
    }
    
}
