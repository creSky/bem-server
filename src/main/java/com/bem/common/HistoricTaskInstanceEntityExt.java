package com.bem.common;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntityImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public  class HistoricTaskInstanceEntityExt extends HistoricTaskInstanceEntityImpl {
    @Autowired
    private RestTemplate restTemplate;

    private HistoricTaskInstance historicTaskInstance;

    public HistoricTaskInstanceEntityExt(HistoricTaskInstance historicTaskInstance) {
        this.historicTaskInstance=historicTaskInstance;
    }

    @Override
    public String getAssignee() {
        System.out.println(historicTaskInstance.getAssignee());
        String assignName=restTemplate.getForObject("http://AUTH-DATA/auth-data/user/name/sysadmin", String.class);
        System.out.println(assignName);
        return assignName;
    }

}
