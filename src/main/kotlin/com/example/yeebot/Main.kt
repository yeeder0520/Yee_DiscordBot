package com.example.yeebot

import me.jakejmattson.discordkt.arguments.IntegerArg
import me.jakejmattson.discordkt.commands.commands
import me.jakejmattson.discordkt.dsl.bot

fun main(args: Array<String>) {
    val token = "MTA1NjExODU2NDE5NDYyMzQ5OQ.G7foKP.m_UJhW9AXLNDpVa6Jw4Zsjd9Diwcl6zrojYbuo"
    bot(token) {
        prefix { "+" }
    }
}

fun demo() = commands("Demo") {
    slash("finishjob", "我可以幫你填工時") {
        execute {
            respond("甲賽啦 自己填!")
        }
    }

    slash("Add", "我可以幫你把三個數字相加") {
        execute(IntegerArg("First"), IntegerArg("Second"), IntegerArg("Third")) {
            val (first, second, third) = args
            respond(first + second + third)
        }
    }
}