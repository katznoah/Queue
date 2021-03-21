# Queue
----
Creating a queue
----
How it will work:
- HTML form taking input
- Input appended to Queue.txt by PHP fopen() and fwrite()
- Process will run (run.sh) and read from Queue
- Process will use the top of Queue as input to program
- Process will remove all occurrances of the completed request from Queue
- Uses run.c to loop run.sh
----
