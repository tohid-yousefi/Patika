using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace opertors
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Assignment and Operational Assignment Operators (=, +=, -=, *=, /=)
            int a = 5;
            int b = 10;
            int c = 15;
            int d = 20;
        
            a += 2; // a = a + 2
            Console.WriteLine(a);

            b -= 2; // b = b - 2
            Console.WriteLine(b);

            c *= 2; // c = c * 2
            Console.WriteLine(c);

            d /= 2; // b = b / 2
            Console.WriteLine(d);

            // Logical Operators (||, &&, !)
            bool isTrue = true;
            bool isFalse = false;

            if(isTrue && isTrue)
            {
                Console.WriteLine("NOOoooooOOOO");
            }

            if(isTrue || isFalse)
            {
                Console.WriteLine("YeeeeeeeSSSSS");
            }

            if (!isFalse)
            {
                Console.WriteLine("Again YYYYYYeeeeeeSSSSS");
            }

            // Relational Operators (==,!=, <, >, >=,<=)
            int num1 = 10;
            int num2 = 15;

            Console.WriteLine(Convert.ToString(num1) + "=" + Convert.ToString(num2) + " is " + (num1 == num2));
            Console.WriteLine(Convert.ToString(num1) + "!=" + Convert.ToString(num2) + " is " + (num1 != num2));
            Console.WriteLine(Convert.ToString(num1) + "<" + Convert.ToString(num2) + " is " + (num1 < num2));
            Console.WriteLine(Convert.ToString(num1) + ">" + Convert.ToString(num2) + " is " + (num1 > num2));
            Console.WriteLine(Convert.ToString(num1) + ">=" + Convert.ToString(num2) + " is " + (num1 >= num2));
            Console.WriteLine(Convert.ToString(num1) + "<=" + Convert.ToString(num2) + " is " + (num1 <= num2));

            // Arithmetic (+, -, *, /, %, ++, --)
            int x = 20;
            int y = 10;

            Console.WriteLine(Convert.ToString(x) + "+" + Convert.ToString(y) + " = " + (x + y));
            Console.WriteLine(Convert.ToString(x) + "-" + Convert.ToString(y) + " = " + (x - y));
            Console.WriteLine(Convert.ToString(x) + "*" + Convert.ToString(y) + " = " + (x * y));
            Console.WriteLine(Convert.ToString(x) + "/" + Convert.ToString(y) + " = " + (x / y));
            Console.WriteLine(Convert.ToString(x) + "%" + Convert.ToString(y) + " = " + (x % y));
            int x_new = x++;
            int y_new = y++;
            Console.WriteLine(Convert.ToString(x_new) + "++" + " = " + (x));
            Console.WriteLine(Convert.ToString(y_new) + "--" + " = " + (y));

        }
    }
}
