using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LuckyNumber7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random randomizer = new Random(); 
            int choice = randomizer.Next(1, 10);
            Console.WriteLine(choice);

            if (choice == 7)
            {
              Console.WriteLine("lucky");
            }
            else 
            {
              Console.WriteLine("unlucky");
            }

            Console.ReadLine();
        }
    }
}
