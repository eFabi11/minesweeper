package se.minesweeper.model

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
        println("Enter size of grid: ")
        val size = scala.io.StdIn.readInt()
        
        println(mesh(size,size))
        
    }
    def levelChoose(){
        printl("Enter the level you want to play 1,2 or 3: ")
        val level = scala.io.StdIn.readInt()

        level match{
            case 1
            case 2
            case 3 
        }

    }
    //grid construction
    val eol = sys.props("line.separator")
    def bar(cellWidth: Int = 5, cellNum: Int = 5): String = (("+" + "-" * 3) * cellNum) + "+" + eol
    def cells(cellWidth: Int=5, cellNum: Int=5): String = ("|" + " " * 3) * cellNum + "|" + eol
    def mesh(cellWidth: Int=5, cellNum: Int=5): String =(bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)


}

case class Person(name: String, age: Int) {
    override def toString = name + "("+age+")"
}