using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace myvariables
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //string
            string a = "patika";
            Console.WriteLine("Variable a is: " + a);

            //int
            int b = 100;
            Console.WriteLine("Variable b is: " + b);

            //double
            double c = 10.5;
            Console.WriteLine("Variable c is: " + c);

            //char
            char d = 'p';
            Console.WriteLine("Variable d is: " + d);

            //byte
            byte e = 125;
            Console.WriteLine("Variable e is: " + e);

            //sbyte
            sbyte f = 75;
            Console.WriteLine("Variable f is: " + f);

            //float
            float g = 14.7f;
            Console.WriteLine("Variable g is: " + g);

            //short
            short h = 5;
            Console.WriteLine("Variable h is: " + h);

            //ushort
            ushort i = 6;
            Console.WriteLine("Variable i is: " + i);

            //decimal
            decimal j = 12.5478m;
            Console.WriteLine("Variable j is: " + j);

            //bool
            bool k = true;
            Console.WriteLine("Variable k is: " + k);

            //datetime
            DateTime dt = DateTime.Now;
            Console.WriteLine("Time is: " + dt);

            //convert string to int
            int num1_int, num2_int, result_int;
            Console.WriteLine("**** Int ****");
            Console.Write("Enter first number: ");
            num1_int = int.Parse(Console.ReadLine());
            Console.Write("Enter second number: ");
            num2_int = Convert.ToInt16(Console.ReadLine());
            result_int = num1_int + num2_int;
            Console.WriteLine("Result is: " + result_int);

            //convert string to float
            float num1_float, num2_float, result_float;
            Console.WriteLine("**** float ****");
            Console.Write("Enter first number: ");
            num1_float = float.Parse(Console.ReadLine());
            Console.Write("Enter second number: ");
            num2_float = float.Parse(Console.ReadLine());
            result_float = num1_float + num2_float;
            Console.WriteLine("Result is: " + result_float);

            //convert string to double
            double num1_double, num2_double, result_double;
            Console.WriteLine("**** double ****");
            Console.Write("Enter first number: ");
            num1_double = double.Parse(Console.ReadLine());
            Console.Write("Enter second number: ");
            num2_double = double.Parse(Console.ReadLine());
            result_double = num1_double + num2_double;
            Console.WriteLine("Result is: " + result_double);

            //convert string to decimal
            double num1_decimal, num2_decimal, result_decimal;
            Console.WriteLine("**** decimal ****");
            Console.Write("Enter first number: ");
            num1_decimal = double.Parse(Console.ReadLine());
            Console.Write("Enter second number: ");
            num2_decimal = double.Parse(Console.ReadLine());
            result_decimal = num1_decimal + num2_decimal;
            Console.WriteLine("Result is: " + result_decimal);

            //convert string to short - part1
            double num1_short, num2_short, result_short;
            Console.WriteLine("**** short ****");
            Console.Write("Enter first number: ");
            num1_short = short.Parse(Console.ReadLine());
            Console.Write("Enter second number: ");
            num2_short = short.Parse(Console.ReadLine());
            result_short = num1_short + num2_short;
            Console.WriteLine("Result is: " + result_short);

            //convert string to short - part2
            short num3_short, num4_short, result2_short;
            Console.WriteLine("**** short ****");
            num3_short = 10;
            num4_short = 15;
            result2_short = (short)(num3_short + num4_short);
            Console.WriteLine(num3_short + " + " + num4_short + " is: " + result2_short);

            Console.Read();
        
        }
    }
}
