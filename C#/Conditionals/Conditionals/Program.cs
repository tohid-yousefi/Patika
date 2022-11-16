using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Conditionals
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Conditionals ===> if else
            int time = DateTime.Now.Hour;
            if (time <= 11 && time >=4)
            {
                Console.WriteLine("Günaydın");
            }
            else if (time <= 18)
            {
                Console.WriteLine("İyi Günler");
            }
            else if(time <= 23)
            {
                Console.WriteLine("İyi Akşamlar");
            }
            else if(time==24 || (time >=1 || time <= 3))
            {
                Console.WriteLine("İyi Geceler");
            }
            else
            {
                Console.WriteLine("Hata!!!");
            }

            // Another type of code
            string sonuc = time <= 11 && time >= 4 ? "Günaydın" : time <= 18 ? "İyi Günler" : time <= 23 ? "İyi Akşamlar" : time == 24 || (time >= 1 || time <= 3) ? "İyi Geceler" : "Hata";
            Console.WriteLine(sonuc);

            // Conditionals ===> switch case
            int month = DateTime.Now.Month;
            switch (month)
            {
                case 12:
                case 1:
                case 2:
                    Console.WriteLine("Şuan kış ayındasınız.");
                    break;
                case 3:
                case 4:
                case 5:
                    Console.WriteLine("Şuan ilkbahar ayındasınız.");
                    break;
                case 6:
                case 7:
                case 8:
                    Console.WriteLine("Şuan yaz ayındasınız.");
                    break;
                case 9:
                case 10:
                case 11:
                    Console.WriteLine("Şuan sonbahar ayındasınız");
                    break;
                default:
                    Console.WriteLine("Hata");
                    break;
            }
        }
    }
}
