package de.htwg.se.minesweeper
package aview

//test comment
import controller.Controller
import util.Observer
import model.Marker
import model.Move
import scala.io.StdIn.readLine

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  def run = 
    println(controller.field.toString)
    getInputAndPrintLoop()

  override def update = println(controller.field.toString)
        
  //println(field.toString)
  //getInputAndPrintLoop(field)

//def getInputAndPrintLoop(field: Field): Unit =
  //val input = readLine
  //parseInput(input) match
    //case None => field
    //case Some(newfield) =>
      //println(newfield)
      //getInputAndPrintLoop(newfield)
  /* 
  def getInputAndPrintLoop(): Unit =
    analyseInput(readLine) match
      case None =>
      case Some(move) => controller.doAndPublish(controller.put, move)
    getInputAndPrintLoop()

    // just put some comment in to test CI
    */    
        
        
  def analyseInput(input: String): Option[Move]=
    input match
      case "q" => None
      case _ => {
        val chars = input.toCharArray
        val marker = chars(0) match
          case 'F' => Marker.F
            case 'f' => Marker.F
            case 'O' => Marker.O
            case 'o' => Marker.O
            case 's' => Marker.Empty
            case _   => Marker.Empty
        val x = chars(1).toString.toInt
        val y = chars(2).toString.toInt
        Some(Move(marker, x, y))
        /*val ran = new scala.util.Random
        val randX = ran.nextInt(5)
        val randY = ran.nextInt(5)
        val mark = Marker.M
        //controller.put(mark, randX, randY)
        controller.put(mark, 3, 4)
        controller.put(mark, 1, 1)
        controller.put(mark, 5, 5)
        controller.put(mark, 1, 4)
        controller.put(marker, x, y
        //println(controller.toString)*/
      }
        

