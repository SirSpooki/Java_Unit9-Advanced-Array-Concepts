import java.util.*;
public class RecordingSort{
public static void main(String[] args) {
//declaring the variables that are needed to take the input from user i.e tilte,song name,pay time
String title;
String name;
int time;
//instance for scanner class to take input from user
Scanner scan=new Scanner(System.in);
//5 recording objects to store 5 recording details
Recording[] Recordingobj = new Recording[5];
//loop 5 times to take the input from user 5 times
for(int i=0;i<5;i++)
{
//sog name input
System.out.print("Enter Song Name: ");
title=scan.nextLine();
//Artist name input
System.out.print("Enter Artist Name: ");
name=scan.nextLine();
//duration input
System.out.print("Enter the duration: ");
time=scan.nextInt();
scan.nextLine();
//creating a instance of the class to store the values in the recoding class
Recordingobj[i]=new Recording();
//calling the setSong() method to store the song tile
Recordingobj[i].setSong(title);
//calling the setSong() method to store the Artist name
Recordingobj[i].setArtist(name);
//to Store the playtime
Recordingobj[i].setPlayTime(time);
}
//we done with creating five recordings so call the below functions to print by the respective field
//calling the sortByArtist method to print the recording sort by the artist
sortByArtist(Recordingobj);
//calling the sortBySong method to print the recording sort by the song
sortBySong(Recordingobj);
//calling the sortByTime method to print the recording sort by the Playtime
sortByTime(Recordingobj);
}

public static void sortByArtist(Recording[] array) {
//Comparator is used to sort the collection of objects based on their values by comparing the each array values mutually
//and then Arrays.sort(a,comparator) is a function used to sort the array of objects based on the value induced by comparator
Arrays.sort(array, new Comparator<Recording>() {
@Override
// compare is absract method which can be override by taking two parameters of class reference types
//first and second are class references which takes the present and next values of specified method or class memebers
//comparing the artist names from getArtist() method by CompreTo method
public int compare(Recording first, Recording second) {
return first.getArtist().compareTo(second.getArtist());
}
});
//after the above comparator executed the recordings gets sorted by the Artist names
//printing the sorted recordings
System.out.println("------Sort by Artist-----");
for(int i=0;i<5;i++)
{
//array[i].getSong() means, from ith object, we trying to get the song details from getSong() method
System.out.println("Title: "+array[i].getSong()+" Artist: "+array[i].getArtist()+" Time: "+array[i].getPlayTime()+"\n");
}
}

public static void sortBySong(Recording[] array) {
//Comparator
Arrays.sort(array, new Comparator<Recording>() {
@Override
//comparing the song tiltles from getSong() method by CompreTo method
public int compare(Recording first, Recording second) {
return first.getSong().compareTo(second.getSong());
}
});
//after the above comparator executed the recordings gets sorted by the Artist names
//printing the sorted recordings
//printing the results i.e sort by song
System.out.println("------Sort by Song-----");
for(int i=0;i<5;i++)
{
System.out.println("Title: "+array[i].getSong()+" Artist: "+array[i].getArtist()+" Time: "+array[i].getPlayTime()+"\n");
}
}

public static void sortByTime(Recording[] array) {
Arrays.sort(array, new Comparator<Recording>() {
@Override
//comparing the playtimes from getPlayTime() by doing the subraction of two values
public int compare(Recording first, Recording second) {
return first.getPlayTime()-second.getPlayTime();
}
});
//after the above comparator executed the recordings gets sorted by the Artist names
//printing the sorted recordings
//printing the results i.e sort by time
System.out.println("------Sort by Time-----");
for(int i=0;i<5;i++)
{
System.out.println("Title: "+array[i].getSong()+" Artist: "+array[i].getArtist()+" Time: "+array[i].getPlayTime()+"\n");
}
}
}
