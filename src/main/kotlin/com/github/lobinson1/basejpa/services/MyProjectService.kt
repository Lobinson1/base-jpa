package com.github.lobinson1.basejpa.services

import com.intellij.openapi.project.Project
import com.github.lobinson1.basejpa.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
