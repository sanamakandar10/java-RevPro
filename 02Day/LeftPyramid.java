/*Print the following patterns using loop :
a.
*
**
***
*****/

public class LeftPyramid {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
		System.out.println();
	}
Pattern2 p=new Pattern2();
p.m();
    }  
}





/*b.
1010101
 10101 
  101  
   1   */
class Pattern2 {
    public void m() {
        int i, j, k;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (k = 7; k >= (2 * i) - 1; k--) {
                if (k % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}


