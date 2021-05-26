package com.demo.tasks

import com.demo.models.Param

def run(Param param) {
    println("Staring building")
    println("Building for ${param.name}")
    println("Fetching repo ${param.repo}")
    println("Done")
}

return this
