var a = 21;
var b = 4;
var rest = a % b;
if (rest != 0) {
	alert('Делится со следующим остатком ' + rest);
} else {
	alert('Делится, результат следующий: ' + (a / b));
}