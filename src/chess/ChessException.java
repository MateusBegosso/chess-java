/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Mateus
 */
public class ChessException extends RuntimeException{
    private static final long seriaVersionUID = 1L;
    
    public ChessException(String msg) {
        super(msg);
    }
}
