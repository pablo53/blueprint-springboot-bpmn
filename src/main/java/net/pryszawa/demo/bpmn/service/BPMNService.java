package net.pryszawa.demo.bpmn.service;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BPMNService {

    private final RuntimeService runtimeService;

    @Transactional
    public String startNewBugProcess() {
        ProcessInstance inst = runtimeService.startProcessInstanceByKey("BugProcess");
        return inst.getProcessInstanceId();
    }

}
