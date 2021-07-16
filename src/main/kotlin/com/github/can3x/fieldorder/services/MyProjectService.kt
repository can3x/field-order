package com.github.can3x.fieldorder.services

import com.github.can3x.fieldorder.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
