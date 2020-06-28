package net.pryszawa.demo.bpmn.controller;

import lombok.RequiredArgsConstructor;
import net.pryszawa.demo.bpmn.service.BPMNService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/bpmn")
public class BPMNController {

    private final BPMNService bpmnService;

    @PostMapping(path = "/bug", produces = "text/plain")
    public ResponseEntity<String> startNewProcess() {
        String instanceId = bpmnService.startNewBugProcess();
        return ResponseEntity.ok(instanceId);
    }

}
