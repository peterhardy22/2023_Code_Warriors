using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MakeSomeVariables
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Define a variable named city and set it equal to any string
            var city = "Chicago";
            // Define a variable named price and set it equal to any float
            var price = 10.99f;
            // Define a variable named high_score and set it equal to any int
            var highScore = 5000;
            // Define a variable named is_having_fun and set it to a Boolean value
            var isHavingFun = true;

            Console.WriteLine(city);
            Console.WriteLine(price);
            Console.WriteLine(highScore);
            Console.WriteLine(isHavingFun);

            Console.ReadLine();
        }
    }
}
