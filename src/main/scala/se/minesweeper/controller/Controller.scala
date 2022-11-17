package se.minesweeper
package controller

import model.Field
import model.Marker
import util.Observable


case class Controller(var field: Field) extends Observable:
  def put(marker: Marker, x: Int, y: Int): Unit =
    field = field.put(marker, x, y)
    notifyObservers
  override def toString: String = field.toString