package com.ptah.controller.project

import com.ptah.auth.WithAuthority
import com.ptah.dto.project.ProjectDto
import com.ptah.service.project.ProjectService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/project")
class ProjectController(var projectService: ProjectService) {
    @PostMapping
    @WithAuthority("platform_admin")
    fun create(@RequestBody projectDto: ProjectDto) {
        projectService.create(projectDto)
    }

    @PutMapping
    @WithAuthority("project_owner")
    fun update(@RequestBody projectDto: ProjectDto) {
        projectService.create(projectDto)
    }
}
