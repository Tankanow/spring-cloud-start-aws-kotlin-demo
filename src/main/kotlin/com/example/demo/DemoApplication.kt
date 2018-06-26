package com.example.demo

import com.amazonaws.services.s3.AmazonS3
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class DemoApplication(val amazonS3: AmazonS3): CommandLineRunner {
    override fun run(vararg args: String?) {
        this.amazonS3.listBuckets().forEach { println(it) }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
