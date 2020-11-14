# cisc_3130

##Lab 1
A simple java program that prints out "Hello World" in Java.

##Lab 2
This program reads in a spotify csv file that was exported from https://spotifycharts.com/. The chart consist of the top 200 songs of a day(Mine used was from 9/03/2020). The program then separates the info and organize them by artist name + any all there tracks (in the top 200 chart) with the number of time streamed. 

##Lab 3
Similar program as lab two. Each artist in the spotify csv file is created into a object. Each artist object nests a track object that stores every track on the spotify top chart. Artist names are sorted alphabetically in the ArrayList.

##Lab 4
Read in 3 months worth of csv file and store each song to an arraylist. Then remove the duplicates by converting it to a hashset then storing the value to a queue. We use poll() to remove a value from the queue (song played) and add it to a stack to refer too. 

##Lab 5
Read in 4 months worth of csv file and created a BST with nodes (song) w/ keys (song title). Also added a method to find the average # stream count for each artist. Then we Traverse the songs in the tree and print it out into a file. 

##Lab 6
Created a grade calulator for CISC3130. The calculator calculates the grade you will get for CISC3130 class base on what you scored on exams and the assignments you completed. The result spits out a letter grade, your score, and also the amount of points you need to score a better grade.