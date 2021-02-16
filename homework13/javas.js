'use strict';

function Salam() {
    var a = 21;
    var b = 4;
    var rest = a % b;
    if (rest != 0) {
        alert('Делится со следующим остатком ' + rest);
    } else {
        alert('Делится, без остатка: ' + (a / b));
    }
}

function Salam2() {
    for (var i = 0; i < 7; i++) {
        for (var a = 0; a < i; a++) {
            document.write('*');
        }
        document.write('<br/>');
    }
}




    for(var i = 0; i < 100; i++)
    {
        if(i % 2 === 0)
        {
            continue;
        }
        console.log(i);
    }



function Salam3() {
    var a = 1000;
    var i = 1;
    do {
        a = a / 2;
        i++;
    }
    while (a >= 50);
    console.log('Результат: ' + a + '. Разделено  ' + i + ' раз на 2');
}