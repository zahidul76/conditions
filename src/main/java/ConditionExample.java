public class ConditionExample {
    public static void main(String[] args) {
        //req: \ if age is value is 54 then print adult
        //req: \ if age is value is 14 then print adult

        int age;
        age=14;    												// = is called assignement operator
        // == is equal sign
        //right side value of assignment operator
        //store in leftside variable

        if (age==54)System.out.println("Adult");

        if (age==14) System.out.println("Teen");


        // if condition is TRUE then run/execute the statement
        // if condition is FALSE then DO NOT Run the statement

        //condition       (age==14)
        //condition is comparing two values



		/*
		 * Among Junior Citizen
	if age is less than 12 then print Baby
	if age is >= 12 and <18 then print Teen
	if age is >= 18 then print Adult
	among Adult
	if age is > 45 then print Senior Adult
	if age is <= 45 then print Junior Adult

		 */

        float myNumber = 5.3f;
        if (myNumber == 5.3)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");


    }

}
