package se.minesweeper.model

enum Marker(stringRepresentation: String):
  override def toString = stringRepresentation
  case F extends Marker("F")
  case O extends Marker("O") 
  case M extends Marker("*")
  case Empty extends Marker(" ")