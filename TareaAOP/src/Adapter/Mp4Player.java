/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author ivand
 */
public class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        // no hace nada
    }

    public void playMp4(String fileName) {
        System.out.println("Reproduciendo mp4: " + fileName);
    }
}
