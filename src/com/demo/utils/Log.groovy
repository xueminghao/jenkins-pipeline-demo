package com.demo.utils

import groovy.transform.Field

@Field String equals = "======"

void info(String msg) {
    println(equals + "Info" + equals)
    println(msg)
}

return this
