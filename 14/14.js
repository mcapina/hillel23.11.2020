/*var str1="vasja@yandex.ru";
var str2="petja@gmail com"; //обратите внимание: тут опечатка!
var re=/(@gmail|@yandex).com/; // С точкой тут не все так просто
console.log(str1+': '+re.test(str1));
console.log(str2+': '+re.test(str2));*/


/*Формат поддержки мобильных телефонов 380 + 50 | 63 | 66 | 67 | 68 | 91 | 92 | 93 | 97 | 96 + 7 цифр. Мобильный телефон должен быть уникальным.*/

var str= "380501234567";
var re=/^(380)(50|63|66|67|68|91|92|93|97|96)\d{7}$/;
console.log(re.test(str));




var str= "m_capina.1@gmail.com";
var re=/^[a-zA-Z0-9_.-]{6,12}@(mail\.ru|gmail\.com|ukr\.net)$/;
console.log(re.test(str));
