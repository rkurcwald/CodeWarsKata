## CreditCard_Mask:
[Kata link](https://www.codewars.com/kata/5412509bd436bd33920011bc)

> Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it. <br/>
>Your task is to write a function maskify, which changes all but the last four characters into '#'.

Examples<br/>

| Method invocation | Expected result |
|-------------|-------------|
|CreditCard_Mask.Maskify("4556364607935616"); | should return "############5616"|
|CreditCard_Mask.Maskify("64607935616");      | should return "#######5616"
|CreditCard_Mask.Maskify("1");                | should return "1"
|CreditCard_Mask.Maskify("");                 | should return ""
|CreditCard_Mask.Maskify("Skippy");           | should return "##ippy"
|CreditCard_Mask.Maskify("Nananananananananananananananana Batman!"); | should return "####################################man!"

---

## HighestAndLowest:
[Kata link](https://www.codewars.com/kata/554b4ac871d6813a03000035)

>In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples<br/>
| Method invocation | Expected result |
|-------------|-------------|
|HighestAndLowest.highAndLow("1 2 3 4 5")  | return "5 1" |
|HighestAndLowest.highAndLow("1 2 -3 4 5") | return "5 -3" |
|HighestAndLowest.highAndLow("1 9 3 4 -5") | return "9 -5"|

NOTES:
- All numbers are valid Int32, no need to validate them.
- There will always be at least one number in the input string.
- Output string must be two numbers separated by a single space, and highest number is first.