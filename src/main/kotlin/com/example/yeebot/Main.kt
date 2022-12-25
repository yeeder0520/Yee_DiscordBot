package com.example.yeebot

import dev.kord.core.event.message.MessageCreateEvent
import me.jakejmattson.discordkt.arguments.IntegerArg
import me.jakejmattson.discordkt.commands.commands
import me.jakejmattson.discordkt.dsl.bot
import me.jakejmattson.discordkt.dsl.listeners

fun main(args: Array<String>) {
    val token = "MTA1NjExODU2NDE5NDYyMzQ5OQ.GbqwTo.gQOBCdcmUeu2EdvWIlIkbe6a_tFQH5W_NX4eQg"
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

fun testListeners() = listeners {
    on<MessageCreateEvent> {
        println(message.content)
        println(message.author)
        println(message.data)
        println(message.channel)
    }
}