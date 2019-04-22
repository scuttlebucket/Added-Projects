package linkedlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.LinkedList;

/**
 *
 * @author credu
 */
public class Link {

private static ArrayList<Album> albums = new ArrayList<Album>();
        
    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love don't mean a thing", 3.8);
        album.addSong("Holy Man",3.6);
        album.addSong("Hold on",4.2);
        album.addSong("Lady Double Dealer",3.8);
        album.addSong("You can't do it right",4.23);
        album.addSong("High Ball Shooter",3.62);
        album.addSong("The Gypsy",4.3);
        album.addSong("Soldier of Fortune",3.9);
        albums.add(album);
        
        album = new Album("For Those About To Rock", "AC/DC");
        album.addSong("For those about to Rock",3.6);
        album.addSong("I'll put the finger on you",4.23);
        album.addSong("Evil Walks",3.8);
        album.addSong("Let's go",3.55);
        album.addSong("Inject the venom",4.2);
        album.addSong("Snowballed",3.65);
        album.addSong("C.O.D",4.25);
        album.addSong("Night of the long knives",3.4);
        album.addSong("Breaking the Rules",3.75);
        albums.add(album);
        
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy Man", playList);
        albums.get(0).addToPlayList("Speed King", playList);
        albums.get(0).addToPlayList("9", playList);
        albums.get(1).addToPlayList("8", playList);
        albums.get(1).addToPlayList("3", playList);
        albums.get(1).addToPlayList("2", playList);
        albums.get(1).addToPlayList("24", playList); //There is no track 24
        
        play(playList);
    }
        
        private static void play(LinkedList<Song>playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song>listIterator = playList.listIterator();
    if(playList.size()==0){
        System.out.println("No songs in playlist");
        return;
    }else{
        System.out.println("Now playing " + listIterator.next().toString());
        printMenu();
    }
    
        while(!quit){
         int action = scanner.nextInt();
         scanner.nextLine();
         
         switch(action){
             case 0:
                 System.out.println("Playlist complete");
                 quit = true;
                 break;
             case 1:
                 if(!forward){
                   if(listIterator.hasNext()){
                   listIterator.next();
                   }
                   forward = true;
                 }
                 if(listIterator.hasNext()){
                     System.out.println("Now playing" + listIterator.next().toString());
                 }else{
                     System.out.println("We have reached the end of the playlist");
                     forward = false;
                 }
                 break;
             case 2:
                 if(forward){
                   if(listIterator.hasPrevious()){
                         listIterator.previous();
                   }
                   forward = false;
                   if(listIterator.hasPrevious()){
                       System.out.println("Now Playing" + listIterator.previous().toString());
                   }else
                         System.out.println("We are at the start of the playlist");
                         forward = true;
                 }
                 break; 
             case 3:
                 if(forward){
                 if(listIterator.hasPrevious()){
                     System.out.println("Now replaying" + listIterator.previous().toString());
                     forward = false;
                 }else{
                     System.out.println("We are at the start of the list");
                 }
                 }else{
                     if(listIterator.hasNext()){
                     System.out.println("Now replaying" + listIterator.next().toString());
                     forward = true;
                 }else{
                 System.out.println("We have reached the end of the list");
                 }
                 }
                 break;
             case 4: 
              //   printList(playList);
                 break;
             case 5: 
                 printMenu();
                 break;
           
        }
    }
    }

    private static void printMenu(){
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n" + 
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions"
                
        );
    }

    private static void printlist(LinkedList<Song>playList){
    Iterator<Song>iterator = playList.iterator();
    System.out.println("...............");
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
        System.out.println(".................");
    }

}

