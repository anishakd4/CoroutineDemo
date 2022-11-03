import kotlinx.coroutines.*

//fun main(args: Array<String>) {
//    println("${Thread.currentThread().name} -> is running")
//}


//fun main() {
//    val thread = Thread {
//        println("${Thread.currentThread().name} -> is running")
//    }
//    thread.start()
//}


//fun main() {
//    runBlocking {
//        launch {
//            delay(1000L)
//            println("World!")
//            println("${Thread.currentThread().name} -> is running")
//        }
//        println("Hello")
//        println("${Thread.currentThread().name} -> is running")
//    }
//}

//fun main() {
//    runBlocking {
//        delay(1000L)
//        println("World!")
//        println("${Thread.currentThread().name} -> is running")
//    }
//    runBlocking {
//        delay(1000L)
//        println("World!")
//        println("${Thread.currentThread().name} -> is running")
//    }
//    runBlocking {
//        delay(1000L)
//        println("World!")
//        println("${Thread.currentThread().name} -> is running")
//    }
//    println("Hello, ")
//}

//fun main() {
//    GlobalScope.launch {
//        delay(1000L)
//        println("World! in 1st launch")
//        println("${Thread.currentThread().name} -> is running in 1st launch")
//    }
//    GlobalScope.launch {
//        delay(1000L)
//        println("World! in 2nd launch")
//        println("${Thread.currentThread().name} -> is running in 2nd launch")
//    }
//    GlobalScope.launch {
//        delay(1000L)
//        println("World! in 3rd launch")
//        println("${Thread.currentThread().name} -> is running in 3rd launch")
//    }
//    println("Hello,")
//    Thread.sleep(2000L)
//}

//fun main() {
//    runBlocking {
//        val resultDeferred = async {
//            delay(1000L)
//            println("${Thread.currentThread().name} -> is running")
//            86
//        }
//        val result = resultDeferred.await()
//        println(result)
//        println(resultDeferred.await())
//        println("${Thread.currentThread().name} -> is running")
//    }
//}

//fun main (){
//    runBlocking {
//        launch {
//            println("${Thread.currentThread().name} -> is running")
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        launch(Dispatchers.Default) {
//            println("${Thread.currentThread().name} -> is running")
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        launch(Dispatchers.IO) {
//            println("${Thread.currentThread().name} -> is running")
//        }
//    }
//}

fun main() {
    runBlocking {
        launch(Dispatchers.Unconfined) {
            println("${Thread.currentThread().name} -> is running")
        }
    }
}