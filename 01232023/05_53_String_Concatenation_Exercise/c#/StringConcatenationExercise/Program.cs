using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace StringConcatenationExercise
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var greeting = "Hello";
            var name = "Hardy";
            var greet_name = greeting + " " + name;

            Console.WriteLine(greet_name);
            Console.ReadLine();
        }
    }
}
