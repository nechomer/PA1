@ECHO off
mkdir pa1-myoutput
del pa1-myoutput\*.ic.out
FOR %%a in (pa-1-input/*.ic) do (
   echo ********      TESTING %%a      ********
	java -cp bin Main pa-1-input/%%a > pa1-myoutput/%%a.out
	echo.
	echo diff -b pa1-myoutput/%%a.out pa-1-output/%%~na.tok
	diff -b pa1-myoutput/%%a.out pa-1-output/%%~na.tok
   echo =================================================================	
)
