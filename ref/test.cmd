call genlex.cmd
javac -d bin src/*.java
call do_diffs.cmd > test_results.txt 2>&1