using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PositiveOrNegative
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random randomizer = new Random();
            int x = randomizer.Next(-100, 100);
            int y = randomizer.Next(-100, 100);
            Console.WriteLine("x: " + x);
            Console.WriteLine("y: " + y);

            if (x > 0 & y > 0)
            {
                Console.WriteLine("both positive");
            }
            else if (x < 0 & y < 0)
            {
                Console.WriteLine("both negative");
            }
            else if (x > 0 & y < 0)
            {
                Console.WriteLine("x is positive and y is negative");
            }
            else
            {
                Console.WriteLine("y is positive and x is negative");
            }
            Console.ReadLine();
        }
    }
}
