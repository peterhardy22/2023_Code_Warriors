using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringEscapeSequences
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Set the message variable equal to any string containing a new-line escape sequence
            var message = "hello down there \nhello up there";

            // Add a string to the mountains variable that when printed results in: /\/\/\
            // You will need to use an escape sequence more than once!
            var mountains = "/\\/\\/\\";

            // Set the quotation variable to any string that contains an escaped double quotation mark
            var quotation = "\"Hey there!\" Said the dude.";

            Console.WriteLine(message);
            Console.WriteLine(mountains);
            Console.WriteLine(quotation);

            Console.ReadLine();
        }
    }
}
