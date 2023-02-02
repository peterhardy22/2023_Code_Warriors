// https://www.codewars.com/kata/5547929140907378f9000039
// Level 8 kyu

// Directions
// Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

// Examples
// "hello"     -->  "hll"
// "codewars"  -->  "cdwrs"
// "goodbye"   -->  "gdby"
// "HELLO"     -->  "HELLO"
// don't worry about uppercase vowels
// y is not considered a vowel for this kata

// Function
using System.Collections.Generic;
using System.Linq;
using System.Text;

public class Kata
{
  public static string Shortcut(string input)
  {
    string vowels = "aeiou";
    var builder = new StringBuilder();

    foreach (var character in input.ToLower()) 
    {
      if (vowels.Contains(character)==false) {
        builder.Append(character);
      };
    };
    
    input = builder.ToString();
    
    return input;
  }
}


// Test Cases
using System;
using NUnit.Framework;

[TestFixture]
public class KataTest
{
  [Test]
  public void Test1()
  {
    KataTest.Assert("hello", "hll");
    KataTest.Assert("how are you today?", "hw r y tdy?");
    KataTest.Assert("complain", "cmpln");
    KataTest.Assert("never", "nvr");
  }

  private static void Assert(string input, string expected)
  {
      var result = Kata.Shortcut(input);
      NUnit.Framework.Assert.AreEqual(expected, result, String.Format("Expected \"{0}\" but got \"{1}\"", expected, result));
  }
}