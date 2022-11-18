package de.htwg.se.minesweeper.model

case class Field(matrix: Matrix[Marker]):
  def this(size: Int, filling: Marker) = this(new Matrix(size, filling))
  val size = matrix.size
  val eol = sys.props("line.separator")
  def bar(cellWidth: Int = 3, cellNum: Int = 3): String = (("+" + "-" * 3) * cellNum) + "+" + eol
  def cells(row: Int, cellWidth: Int = 3) =
    matrix.row(row).map(_.toString).map(" " * ((cellWidth - 1) / 2) + _ + " " * ((cellWidth - 1) / 2)).mkString("|", "|", "|") + eol
  def mesh(cellWidth: Int = 3) =
    (0 until size).map(cells(_, cellWidth)).mkString(bar(cellWidth, size), bar(cellWidth, size), bar(cellWidth, size))
  override def toString = mesh()
  //def generateRandomMines(marker: Marker, randX: Int, randY: Int) = put(marker, randX, randY)
  def put(marker: Marker, x: Int, y: Int) = copy(matrix.replaceCell(x, y, marker))
