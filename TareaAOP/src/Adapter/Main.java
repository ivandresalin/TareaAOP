/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author ivand
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "pelicula.vlc");
        audioPlayer.play("avi", "archivo.avi");
    }
}