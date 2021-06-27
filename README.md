CreditCard_Mask:
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



