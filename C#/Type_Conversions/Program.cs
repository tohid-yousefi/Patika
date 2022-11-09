using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Type_Conversions
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Implicit Conversion
            Console.WriteLine("****** Implicit Conversion ******");

            //int
            int b = 100;
            Console.WriteLine("Variable b is: " + b + " ,and Type of Variable: " + b.GetType());

            //double
            double c = 10.5;
            Console.WriteLine("Variable c is: " + c + " ,and Type of Variable: " + c.GetType());

            //char
            char d = 'p';
            Console.WriteLine("Variable d is: " + d + " ,and Type of Variable: " + d.GetType());

            //byte
            byte e = 125;
            Console.WriteLine("Variable e is: " + e + " ,and Type of Variable: " + e.GetType());

            //sbyte
            sbyte f = 75;
            Console.WriteLine("Variable f is: " + f + " ,and Type of Variable: " + f.GetType());

            //float
            float g = 14.7f;
            Console.WriteLine("Variable g is: " + g + " ,and Type of Variable: " + g.GetType());

            //short
            short h = 5;
            Console.WriteLine("Variable h is: " + h + " ,and Type of Variable: " + h.GetType());

            //ushort
            ushort i = 6;
            Console.WriteLine("Variable i is: " + i + " ,and Type of Variable: " + i.GetType());

            //decimal
            decimal j = 12.5478m;
            Console.WriteLine("Variable j is: " + j + " ,and Type of Variable: " + j.GetType());

            // Explicit Conversion
            Console.WriteLine("****** Explicit Conversion ******");

            int k = 7;
            byte l = (byte)k;
            Console.WriteLine("Variable l is: " + l + " ,Before Type Conversion is: " + k.GetType() + " ,After Type Conversion is: " + l.GetType());

            // ToString 
            int m = 8;
            string n = m.ToString();
            Console.WriteLine("Variable n is: " + n + " , Type of Vafriable is: " + n.GetType());

            // Convert
            string num1 = "20";
            string num2 = "25";
            int result = Convert.ToInt32(num1) + Convert.ToInt32(num2);
            Console.WriteLine(num1 + " + " + num2 + " = " + Convert.ToString(result));

            // Parse
            string num3 = "15";
            string num4 = "17.21";
            double total = int.Parse(num3) + double.Parse(num4);
            Console.WriteLine(num3 + " + " + num4 + " = " + Convert.ToString(total));

        }
    }
}
