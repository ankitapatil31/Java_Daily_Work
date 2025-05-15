# Lambda
In lambda expresion... variable should be final or efectively final means... 
suppose we impliment labda in any method... so we cant modify that local variable of method... we can used it but not modify..

out of that scope.. intance member of class can we modify..but not local variable..
we can used local vairiable but not modify..

to solve this issue we used AtomicReference 

so if we want to update the value then used AtomicReference / AtomicInter likewise .. to update the value in local scope..

lambda not able to handle stack memory.. thats why not cant modify local variable ... that why we used atomicref.. it has seprate memory in heap and lamb can able to access that..