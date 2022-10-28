package model

import scala.io.StdIn._

//case class Field()

object Field {
    def main(args:Array[String]) = {
        println("Welcome to Minesweeper \n")
        val salutation = "Hi " + signUp(args)
        println(salutation)
        showGrid()
    }
    // enters player name
    def signUp(playerNames:Array[String]):Person = {
        val name = if (playerNames.length > 0)
            playerNames.head
        else
            readLine("Dude enter your name: ")
        val age = 33
        Person(name,age)
    }

    // test branch features creation
    // input number and shows grid
    def showGrid()= {
        //println("Enter size of grid: ")
        //val size = scala.io.StdIn.readInt()

        //intln(mesh(size,size)) 
        println(mesh(3,3))
    }
    //grid construction
    val eol = sys.props("line.separator")
    def bar(cellWidth: Int = 3, cellNum: Int = 3): String = (("+" + "-" * 3) * cellNum) + "+" + eol
    //def bar(): String = (("+" + "-" * 3) * 3) + "+" + eol
    def cells(cellWidth: Int=3, cellNum: Int=3): String = ("|" + " " * 3) * cellNum + "|" + eol
    //def cells(): String = ("|" + " " * 3) * 3 + "|" + eol
    def mesh(cellWidth: Int=3, cellNum: Int=3): String =(bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)


}

case class Person(name: String, age: Int) {
    override def toString = name + "("+age+")"
}