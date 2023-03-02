// https://www.codewars.com/kata/55c28f7304e3eaebef0000da
// Level 8 kyu

// Directions:
// Unfinished Loop - Bug Fixing #1
// Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

// Function
using System.Collections.Generic;
using System.Linq;

public class Kata
{
  public static List<int> CreateList(int number)
  {
    return Enumerable.Range(1, number).ToList();
  }
}

// Test cases
// using System;
// using NUnit.Framework;
// using System.Collections.Generic;

// [TestFixture]
// public class Tests
// {
//   [Test]
//   public static void FixedTest()
//   {
//     List<int> myValues = new List<int>(new int[] { 1 } );
//     Assert.AreEqual(myValues, Kata.CreateList(1));
    
//     myValues = new List<int>(new int[] { 1, 2 } );
//     Assert.AreEqual(myValues, Kata.CreateList(2));
    
//     myValues = new List<int>(new int[] { 1, 2, 3, 4, 5, 6 } );
//     Assert.AreEqual(myValues, Kata.CreateList(6));
//   }
// }