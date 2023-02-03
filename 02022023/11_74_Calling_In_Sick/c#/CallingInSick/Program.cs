using System;
using System.Collections.Generic;
using System.Linq;
using System.Media;
using System.Text;
using System.Threading.Tasks;

namespace CallingInSick
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random randomizer = new Random();

            bool actuallySick = randomizer.NextDouble() < 0.5;
            bool kindaSick = randomizer.NextDouble() < 0.5;
            bool hateYourJob = randomizer.NextDouble() < 0.5;
            int sickDays = randomizer.Next(1, 10);

            if ((actuallySick && sickDays > 0) | (kindaSick && hateYourJob && sickDays > 0)) {
                bool callingInSick = true;
                Console.WriteLine("It is " + callingInSick + ", I will be calling in sick today!");
            } else
            {
                bool callingInSick = false;
                Console.WriteLine("It is " + callingInSick + ", I will not be calling in sick today!");
            };
            Console.ReadLine();
        }

    }
}
