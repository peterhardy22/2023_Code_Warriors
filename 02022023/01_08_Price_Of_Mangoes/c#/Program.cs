// https://www.codewars.com/kata/57a77726bb9944d000000b06
// Level 8 kyu

// Directions:
// There's a "3 for 2" (or "2+1" if you like) offer on mangoes.
// For a given quantity and price (per mango), calculate the total cost of the mangoes.

// Examples
// mango(2, 3) ==> 6    # 2 mangoes for $3 per unit = $6; no mango for free
// mango(3, 3) ==> 6    # 2 mangoes for $3 per unit = $6; +1 mango for free
// mango(5, 3) ==> 12   # 4 mangoes for $3 per unit = $12; +1 mango for free
// mango(9, 5) ==> 30   # 6 mangoes for $5 per unit = $30; +3 mangoes for free

// Function
public class Kata
{
  public static int Mango(int quantity, int price)
  {    
    if (quantity % 3 == 0) {
      int freeMangoes = quantity / 3;
      int mangoesToBuy = quantity - freeMangoes;
      int total = mangoesToBuy * price;
      return total;
    } else if (quantity % 3 == 1) {
      quantity -= 1;
      int freeMangoes = quantity / 3;
      int mangoesToBuy = quantity - freeMangoes;
      int total = (mangoesToBuy + 1) * price;
      return total;
    } else {
      quantity -= 2;
      int freeMangoes = quantity / 3;
      int mangoesToBuy = quantity - freeMangoes;
      int total = (mangoesToBuy + 2) * price;
      return total;
    }
  }
}


// Test Cases
namespace Solution
{
  using NUnit.Framework;
  using System; 

  [TestFixture]
  public class KataTests
  {
    [Test]
    public void BasicTests()
    {
      Assert.AreEqual(6, Kata.Mango(3, 3));
      Assert.AreEqual(30, Kata.Mango(9, 5));
    }
  }
}