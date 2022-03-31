def call(Map config = [:]) {
    cat "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
