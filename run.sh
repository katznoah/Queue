topline=$(head -n 1 Queue.txt)
echo $topline | java Queue > new.txt
cat new.txt > Queue.txt
rm new.txt
echo "Queue.txt: "
cat Queue.txt
