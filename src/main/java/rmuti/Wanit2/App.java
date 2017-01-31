package rmuti.Wanit2;

import rmuti.Wanit2.App;
import rmuti.Wanit2.ArraysList;

public class App {

	int num1 = 1;
	int num2 = 2;
	char ch1 = 'a';
	char ch2 = 'b';
	
	char insert	= 'c';
    public static void main( String[] args )
    {
    	App app = new App();
    	ArraysList testArr	= 	new ArraysList();
    	
    	/*Test function add(Object e)*/
    	testArr.add(app.num1);
    	testArr.add(app.num2);
    	testArr.add(app.ch1);
    	testArr.add(app.ch2);
    	System.out.print(testArr.elementData[0]);
    	System.out.print(testArr.elementData[1]);
    	System.out.print(testArr.elementData[2]);
    	System.out.print(testArr.elementData[3]);

    	System.out.println();
    	/*Test function add(int i , Object e*/
    	testArr.add(2,app.insert); //testArr.add(index where to insert,app.insert);
    	System.out.print(testArr.elementData[0]);
    	System.out.print(testArr.elementData[1]);
    	System.out.print(testArr.elementData[2]);
    	System.out.print(testArr.elementData[3]);
    	System.out.print(testArr.elementData[4]);
    	
    	System.out.println();
    	
    	System.out.print(testArr.elementData.length);
        }
    }

