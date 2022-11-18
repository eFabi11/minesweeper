package de.htwg.se.minesweeper

import aview.TUI
import model.Field
import controller.Controller
import model.Matrix
import model.Marker

@main def run: Unit =
    println("Welcome to Minesweeper")
    val field = new Field(3, Marker.Empty)
    val controller = Controller(field)
    val tui = TUI(controller)
    tui.run