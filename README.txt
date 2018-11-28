https://zhuanlan.zhihu.com/p/35245956

how to learn
p/34418394

// comparator
https://www.hackerrank.com/challenges/java-priority-queue/problem

目前学习任务
数据库先
JDBC

// regex in java
https://www.tutorialspoint.com/java/java_regular_expressions.htm

1> import the package (java.sql.*)
2> a. load driver 
   b. register   -->  Class.forName("com.mysql.jdbc.Driver")
3> establish the connection   -->  Connection
4> create the statement 
5> execute the query
6> process result
7> close connection

required jars : mysql connector jar  (in Maven Repository)



import java.sql.*;
public class MyClass {
    public static void main(String args[]) throws Exception{
        String url = "";
        String uname = "root" // username
        String pass = "";   // password 
        // java reflection, to load class
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);  // static method
        ============== use mysql to create a database first =================   
        mysql download
        mysqlworkbench
    }   
}




// why enum
https://stackoverflow.com/questions/4709175/what-are-enums-and-why-are-they-useful
























































// Batch
@echo off     
//The Rem command is used to add a comment to say what exactly this batch file does.
Rem This is for listing down all the files in the directory Program files 
:: this is comment
// dir is list all files  ???
dir /s   // list all sub as well
dir /s "C:\Program Files" > C:\lists.txt 
echo "The program has completed"

=== command line argument ======
%1
%2
%3
==== variable =================
set /A var=5   // numerical
set message=Hello World 
echo %message%

SET /A a=5 
SET /A b=10 
............///////./SET /A c=%a% + %b% 
echo %c% 
SET /A c=%a% - %b% 
echo %c% 
SET /A c=%b% / %a% 
echo %c% 
SET /A c=%b% * %a% 
echo %c%
--- global  local ----
set globalvar=5
SETLOCAL
set var=13145
set /A var=%var% + 5
echo %var%
echo %globalvar%
ENDLOCAL
//variable will be destroyed as soon the ‘ENDLOCAL’ statement is executed.


Set /A a = 5
a *= 3
Output will be 15

================= Array =====================
set z[0]=1
@echo off 
set list=1 2 3 4 
(for %%a in (%list%) do ( 
   echo %%a 
))
// access
echo %a[0]%

-- length ----
// no exist, create by your own

// 2d array
@echo off 
set len=3 
set obj[0].Name=Joe 
set obj[0].ID=1 
set obj[1].Name=Mark 
set obj[1].ID=2 
set obj[2].Name=Mohan 
set obj[2].ID=3 


====  if statements ============
if %c%==15 echo "The value of variable c is 15" 
if %c%==15 (echo "The value of variable c is 15") else (echo "Unknown value") 

// if else if
if %x%==5 if %y%==5 (echo "Both x and y equal 5.")
if %x%==10 if %y%==10 (echo "Both x and y equal 10.") else (echo "Invalid input.")


=== Conditional ==========
@echo off
SET /A a=5
IF NOT %a%==6 echo "A is not equal to 6"

==== Loop =======================
@echo off
SET /A "index=1"
SET /A "count=5"
:while
if %index% leq %count% (     // ? can you do <=
   echo The value of index is %index%
   SET /A "index=index + 1"
   goto :while
)

The value of index is 1
The value of index is 2
The value of index is 3
The value of index is 4
The value of index is 5

--- for loop -----------
FOR /L %%variable IN (lowerlimit,Increment,Upperlimit) DO do_something


    The /L switch is used to denote that the loop is used for iterating through ranges.

    The IN list contains of 3 values. The lowerlimit, the increment, and the upperlimit. So, the loop would start with the lowerlimit and move to the upperlimit value, iterating each time by the Increment value.

FOR /L %%X IN (0,1,5) DO ECHO %%X

---- classic for loop -----------------
@echo off 
SET /A i=1 
:loop 

IF %i%==5 GOTO END 
echo The value of i is %i% 
SET /a i=%i%+1 
GOTO :LOOP 
:END

The value of i is 1 
The value of i is 2 
The value of i is 3 
The value of i is 4

=============== Function ===============================
--- call fun ----
@echo off 
SETLOCAL 
CALL :Display 
EXIT /B %ERRORLEVEL%  
:Display                 // define method 
SET /A index=2 
echo The value of index is %index% 
EXIT /B 0


@echo off
SETLOCAL
CALL :Display 5 , 10
EXIT /B %ERRORLEVEL%
:Display
echo The value of parameter 1 is %~1
echo The value of parameter 2 is %~2
EXIT /B 0

As seen in the above example, ~1 is used to access the first parameter sent to the function, similarly ~2 is used to access the second parameter.

---- return value -------------
@echo off
SETLOCAL
CALL :SetValue value1,value2
echo %value1%
echo %value2%
EXIT /B %ERRORLEVEL%
:SetValue
set "%~1=5"
set "%~2=10"
EXIT /B 0

The return values are set in the function using the set command and the tilde(~) character along with the positional number of the parameter.

Following example shows how a function can be called with return values.












