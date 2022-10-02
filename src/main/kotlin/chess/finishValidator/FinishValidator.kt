package chess.finishValidator

import chess.board.Board

interface FinishValidator {
   fun check(board: Board): String;
}