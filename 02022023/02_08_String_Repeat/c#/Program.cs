// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
// Level 8kyu

// Directions
// Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

// Examples (input -> output)
// 6, "I"     -> "IIIIII"
// 5, "Hello" -> "HelloHelloHelloHelloHello"

// Function
using System.Linq;

namespace Solution
{
  public static class Program
  {
    public static string RepeatStr(int numb, string strng)
    {
      string answer = string.Concat(Enumerable.Repeat(strng, numb));
      return answer;
    }
  }
}


// Test Cases
namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test(Description = "Fixed Tests")]
    public void FixedTests()
    {
      Assert.AreEqual("***", Program.RepeatStr(3, "*"));
      Assert.AreEqual("#####", Program.RepeatStr(5, "#"));
      Assert.AreEqual("ha ha ", Program.RepeatStr(2, "ha "));
    }
  }
}