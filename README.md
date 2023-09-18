# Ptah
![img.png](doc/assets/img.png) | Ptah is an Egyptian creator god who conceived the world and brought it into being through the creative power of speech.
:-------------------------:|:-------------------------:




# Introduction

## Project instruction - Roles , features, user journeys
### admin : create project  / init project 
### project manager : update project properties
### project roles : create contract / raise acceptance check
### all users : accounting

## High level architecture


# Run project

# convert java project to kotlin
1. Tools - > Kotlin - > Configure Kotlin in project.
2. build.gradle->build.gradle.kts
2. deal with lombok
   Generally, no, it doesn't. The reason of that behavior is that Lombok is an annotation processor for javac but when the kotlin compiler runs it uses javac as well but with no annotation processing so this is why kotlin don't see declarations that wasn't yet generated.

The only workaround for now is to define strict compilation order: Java first and after that kotlin. Unfortunately this approach has great disadvantage: you can't use Kotlin code from Java in this case. To workaround it you may need multimodule project that may cause a lot of pain