package com.example.camunda;

import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
@EnableProcessApplication
public class CamundaApplication {
    private final Logger logger = LoggerFactory.getLogger(CamundaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CamundaApplication.class, args);
    }

    @EventListener
    public void notify(final PostDeployEvent event) {
        List<ProcessDefinition> definitions = event.getProcessEngine().getRepositoryService().createProcessDefinitionQuery().list();
        logger.info("========================================================================");
        logger.info("========================================================================");
        logger.info("Found deployed process:");
        definitions.stream().forEach(definition -> logger.info(definition.toString()));
        logger.info("========================================================================");
        logger.info("========================================================================");
    }
}
