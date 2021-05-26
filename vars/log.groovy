import groovy.transform.Field

@Field String equals = "======"

def info(String message) {
    println(equals + "INFO" + equals)
    println message
}

def error(String message) {
    println(equals + "ERROR" + equals)
    println message
}