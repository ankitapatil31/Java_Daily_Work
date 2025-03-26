-- Exception means which break the  normal flow of execution of program
Two type of Exception:
    1. Compile time (check)
        thread.sleep(100) without using try catch 
        it's not allowing us to compiling code. and show exception 
    2. Runtime (uncheck)
        which come out after program execution 

Error:
    means which we can not handle or resolve it. (its not in our hand)

--- try {} 
    catch(){} 
    finally {}
--- All the time finally block execute... 
    even if exception occur.. it's does not matter we write catch block or not.. (Test 2)
Test 1: 
    try{
    }
    catch(){
    }
    finally {
    }

Test 2:
    try{
    }
    finally{
    }

Test 3:
    try{
    }
    catch(){
    }
    finally{
        try{
        }catch(){
        }
    }

            Object Super Cls
                |
            Throwable 
                |
    |                                |
Exception                          Error
    |
             
1. Compile Time (Check)
2. RunTime(Uncheck)

Throw : Create New Exception

Throws : adding to