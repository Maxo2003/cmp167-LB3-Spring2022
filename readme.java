/* Methods: Block of code that has a definition and body. it is used to promote reusability, it can be called anywhere in the code to perform 1 specific task

 Syntax:
 
 access_modifier staticOrNot  dataTypeOfReturnValue  nameOfMethod  (parameterList) ExceptionList {
 BODY	
 }
 
 ** access modifier ** : public, private, protected, or default of package (optional)
 ** static or not ** : static elements belong to the class, no object construction required to access static elements(methods,variables) (optional)
 ** data type of return values ** : the type of the element to be returned, if nothing is going to be returned then set data type to void
 ** name of method ** : cannot start with a number, it must start with a letter, $, _ (required)
 ** parameter list ** : contains the declaration of a set of variables that will be used to perform the task of the methods (required) either empty or not empty
 ** exception list ** : a list of exceptions to handle unexpected errors
 ** body ** : contains the set of statements to be executed
*/

public class readme {
// Method to return the sum of three numbers
	public static int num2(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		return total;
	}
	
	public static void main(String [] args) {
		String fname = args[0];
		String sname = args[1];
	}
	
/* Method calling/ invocation
 * Syntax:
 * 
 * nameOfMehtod(ArgumentsList) ;
 * 
 * 	 Semantics:
 * - Grab a space in memory, and give that space the corresponding method name and argument values
 * - Search for the method declaration that matches the method signature of the method call
 * - If there is a match found, assign the argument values to the parameter variables and execute the statements 
 * - If there is a value to return, replace the method call with the value and the method call, free out of space on memory
 * - If a signature match is not found, crash the program and an error will occur  
 * 
 * Example:
 * sum3("5", "6", 7); // Error 
 * 
 * sum3(5, 4, 6); // Match
 * 
 * Return statement
 * syntax:
 * 
 * return expression;
 * 
 * Semantics:
 * -Evaluate the expression
 * -Replace the method call with the value
 * -End the method call
 * 
 * 
 */
	
	
	
	
	
	
	
	
}

