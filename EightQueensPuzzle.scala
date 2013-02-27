package com.adstream.gdam.settings

object EightQueensPuzzle {

  object Rows extends Enumeration {
    val _1, _2, _3, _4, _5, _6, _7, _8 = Value
  }

  object Columns extends Enumeration {
    val A, B, C, D, E, F, G, H = Value
  }

  object CellStates extends Enumeration {
    val Free, Attacked, Busy = Value
  }

  type Row = Rows.Value
  type Column = Columns.Value

  case class Position(column: Column, row: Row)

  type CellState = CellStates.Value
  type Board = Map[Position, CellState]

  def putQueen(board: Board, position: Position): Board = {
    val q = Rows.values.partition(row =>)
    (
      Rows.values.map(row => Position(position.column, row)) ++
      Columns.values.map(column => Position(column, position.row))
    ).map(
      position => (position, CellStates.Attacked)
    ).toMap ++ board ++ Map(position -> CellStates.Busy)
  }

  def queensCount(board: Board): Int = {
    board.count(_._2 == CellStates.Busy)
  }

  def f(board: Board) {

  }


  def main(args: Array[String]) {
    println("ok")
  }

}

