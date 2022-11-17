import scala.io.StdIn._

case class Person(name: String, age: Int) {
    override def toString = name + "("+age+")"
}

def signUp(playerNames:Array[String]):Person = {
        val name = if (playerNames.length > 0)
            playerNames.head
        else
            readLine("Dude enter your name: ")
        val age = 33
        Person(name,age)

    }

println(signUp(Array("Marc")))

def showGrid()= {
        println(mesh(3,3))
    }
println(showGrid())


    def mesh(cellWidth: Int=3, cellNum: Int=3): String =(bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)
