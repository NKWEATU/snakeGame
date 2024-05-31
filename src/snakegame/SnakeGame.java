/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;
public class SnakeGame  extends JFrame{

    public SnakeGame(){
    
    initUI();
    }
    
    private void initUI() {
    
    add(new Board());
    
    setResizable(false);
    pack();
    
    setTitle("Snake Game");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
         
    public static void main(String[] args) {
        
        
        EventQueue.invokeLater(() ->{
        
            JFrame ex = new SnakeGame();
            ex.setVisible(true);
        
        
        
        });
        
        
        
        
    }

    

    
   
}
