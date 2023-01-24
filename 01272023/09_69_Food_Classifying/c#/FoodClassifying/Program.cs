using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FoodClassifying
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var foodList = new List<string>()
                    {
                        "apple",
                        "grape",
                        "bacon",
                        "steak",
                        "worm",
                        "dirt"
                    };

            var random = new Random();
            int index = random.Next(foodList.Count);
            var food = foodList[index];
            Console.WriteLine(food);

            if (food == "apple" || food == "grape")
            {
                Console.WriteLine("fruit");
            }
            else if (food == "bacon" || food == "steak")
            {
                Console.WriteLine("meat");
            }
            else if (food == "dirt" || food == "worm")
            {
                Console.WriteLine("yuck");
            }
            Console.ReadLine();
        }
    }
}
