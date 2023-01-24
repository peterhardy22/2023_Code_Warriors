using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberIsOdd
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random randomizer = new Random();
            int randomNumber = randomizer.Next(1, 1000);
            Console.WriteLine(randomNumber);

            if (randomNumber % 2 == 0)
            {
                Console.WriteLine("even");
            }
            else
            {
                Console.WriteLine("odd");
            }

            Console.ReadLine();
        }
    }
}
