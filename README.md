# SwipeDeleteDemo
Simple demo of Android's RecyclerView 

In the beginning, if you have created any SQLite3 driven Android applications, you most likely used **ListActivity**. 
You would use an *adapter* mechanism so you can display your database table rows. 
A typical application at the time would have the user long hold a row to pop up a menu to allow the users to do things 
like edit or delete. 

However, **ListActivity** is being deprecated, and you are suppose to use **RecyclerView**.

The ListActivity do not really support swiping. There exist good tutorials and open source code that offer workarounds.
However it is best to rewrite new apps without RecyclerView.
RecyclerView is not a direct replacement and works differently than ListActivity.

This program lists some rows, and demonstrate how to swipe and delete a row.


![screenshot](https://github.com/alexcmak/SwipeDeleteDemo/blob/main/swipe_right.png)
