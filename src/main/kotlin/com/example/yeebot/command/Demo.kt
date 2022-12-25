//package knowledgeking.command
//
//
//fun demo() = commands("Demo") {
//    slash("Hello", "A 'Hello World' command.") {
//        execute {
//            respond("Hello World!")
//        }
//    }
//
//    slash("Add", "Add two numbers together.") {
//        execute(IntegerArg("First"), IntegerArg("Second")) {
//            val (first, second) = args
//            respond(first + second)
//        }
//    }
//}
