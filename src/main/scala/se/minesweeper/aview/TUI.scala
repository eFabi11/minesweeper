package se.minesweeper
package aview

import controller.Controller
import model.Marker
import scala.io.StdIn.readLine
import util.Observer

class TUI(controller: Controller) extends Observer:
    controller.add(this)
    def run = 
        println(controller.field.toString)
        getInputAndPrintLoop()

    override def update = println(controller.field.toString)
        

    def getInputAndPrintLoop(): Unit =
        val input = readLine
        input match
            case "q" =>
            case _ => {
                val chars = input.toCharArray
                val marker = chars(0) match
                    case 'F' => Marker.F
                    case 'f' => Marker.F
                    case 'O' => Marker.O
                    case 'o' => Marker.O
                    case _   => Marker.Empty
                val x = chars(1).toString.toInt
                val y = chars(2).toString.toInt
                controller.put(marker, x, y)
                println(controller.toString)
                getInputAndPrintLoop()
            }
        

