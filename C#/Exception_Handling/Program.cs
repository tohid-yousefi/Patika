using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exception_Handling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int num;
                Console.Write("Enter a Integer Number: ");
                num = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Youre Integer Number is: " + num);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error is: " + ex.Message);
            }
            finally
            {
                Console.WriteLine("Continue Code...");
            }
        }
    }
}
