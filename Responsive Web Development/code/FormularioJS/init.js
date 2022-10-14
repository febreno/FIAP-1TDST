function mensagem(msg, campo){
	console.log(campo);

	document.getElementById(campo).focus();
	var msgR = document.getElementById('msgRight');
	var msgE = document.getElementById('msgError');
	msgR.style.display="none";
	msgE.style.display="block";

	msgE.innerHTML= msg +' ' + campo +'!';
	msgE.style.backgroundColor = 'red';
	msgE.style.textAlign = 'center';
	msgE.style.height = '60px';
}
function msgRight(){
	var msgE = document.getElementById('msgError');
	var msgR = document.getElementById('msgRight');
	msgE.style.display="none";
	msgR.style.display="block";

	msgR.innerHTML= "its all right!";
	msgR.style.backgroundColor = 'green';
	msgR.style.textAlign = 'center';
	msgR.style.height = '60px';
}



/*JAVA SCRIPT
- weakly typed
- client side
*/
//PRINT
//return in console
console.log("hello world!");
//return in page
document.write("hello world!");

// string is unchange value

// use again, change value
//literal primitive / obj String
var testV = 1;

// undeclarable again, change value
//literal primitive / obj String
let testL = 1;

//undeclarable again, unchange value
//literal primitive / obj String
const testC = 1;

//STRING ATRIBUTS
var test = "test";
console.log(test.length);
console.log(test.indexOf("es"));
console.log(test.charAt(2));
console.log(test.charAt(2,3));
console.log(test.replace("t", " "));

//ALERTS
alert("Hello world!");// no return
confirm("Just accept!")//true or false
prompt("type something")//value

parseInt(prompt("num:"));

//CASTING
var text = "20";
var int = 20;
console.log(typeof text);

var toInt = parseInt(text, 20);//+20
console.log(typeof toInt);

var toStr = int.toFixed(2);// float point
int.split("/")//remove "/"

//COMPARE
3 === "3"//f
3 == "3"//t
3 !== "3"//t
3 != "3"//f
3 > 3//f
3 < 3//f
3 >= 3//t
3 <= 3//t

//CONDITIONS
if(3 == 3){
    alert("3 == 3");
}
else if(3 != 3){
    alert("3 != 3");
}
else{
    alert("3 ? 3");
}

//ARRAYS
const arr = ["John", "Peter", "Sally", "Jane"];
frutas[0];//first
frutas[frutas.length - 1]//last
arr.forEach(function (item, index, array) {
  console.log(item, index, array);
});
arr.push('Jeff');//add last
arr.pop();//rm last
arr.shift();//rm first
arr.unshift('lola')//add first
arr.indexOf('banana');//search
arr.splice(0, 1);//rm 1=element(s) by 0=initial-position
arr.slice();//copy
let myString = JSON.stringify(arr);
document.getElementById("demo").innerHTML = myString;
const obj = {counter:0};

// Define Setters and Getters
Object.defineProperty(obj, "reset", {
  get : function () {this.counter = 0;}
});
Object.defineProperty(obj, "increment", {
  get : function () {this.counter++;}
});
Object.defineProperty(obj, "decrement", {
  get : function () {this.counter--;}
});
Object.defineProperty(obj, "add", {
  set : function (value) {this.counter += value;}
});
Object.defineProperty(obj, "subtract", {
  set : function (value) {this.counter -= value;}
});

// Play with counter:
obj.reset;
obj.add = 5;
obj.subtract = 1;
obj.increment;
obj.decrement;
document.getElementById("demo").innerHTML = obj.counter;

//OBJ
let myObj = {
  name:"John",
  age:30,
  today: new Date(),
  age: function () {
      return 30;
  },
  cars: {
    car1:"Ford",
    car2:"BMW",
    car3:"Fiat"
  },
  name: function() {
      return this.name;
  },
  get name() {
      return this.name;
  },
  set newName(n) {
      this.name = n;
  }
}
myObj.name();
myObj.newName = "Alfred";

function Person(first, age) {//constructor
  this.firstName = first;
  this.age = age;
}
const myFather = new Person("John", 21);// new obj
myObj.firstName //objectName.property
delete myObj.age;//delete myObj["age"];
var numObj = new Number(20); // fast with num

//obj sets
new Set();//Creates a new Set
add();//Adds a new element to the Set
arr.delete()//Removes an element from a Set
has();//Returns true if a value exists
clear();//Removes all elements from a Set
forEach();//Invokes a callback for each element     
values();//Returns an Iterator with all the values in a Set
keys();//Same as values()
entries();//Returns an Iterator with the [value,value] pairs from a Set
size//Returns the number elements in a Set
let text = "";
letters.forEach (function(value) {
  text += value;
})

// obj maps
new Map()//Creates a new Map object
set()//Sets the value for a key in a Map
get()//Gets the value for a key in a Map
clear()//Removes all the elements from a Map
arr.delete()//Removes a Map element specified by a key
has()//Returns true if a key exists in a Map
forEach()//Invokes a callback for each key/value pair in a Map
entries()//Returns an iterator object with the [key, value] pairs in a Map
keys()//Returns an iterator object with the keys in a Map
values()//Returns an iterator object of the values in a Map
size//Returns the number of Map elements

// LOOPS
for(let i = 0; i < cars.length; i++){}//text += cars[i] + "<br>";
for(i in values){}//return index
for (i of values){}//return elements
while (condition){}
//console.log(values[i]);
arr.forEach(function (item, index, array) {
  console.log(item, index, array);
});

// FUNCTIONS
function nameF(x){}
nameF(x);//call F
function functionWithF(nameF){}

style.background="#000000"

//<input onfocus="focus(this);" onblur="noFocus(this);">
function focus(i){
    i.style.background="#000000"
}
function noFocus(i){
    i.style.background="#FFFFFF"
}

function rolar(e){
    var carac = String.fromCharCode(e.which);
    if (carac == 'c'){
        self.scrollBy(0,10);
    }
    else if(carac == 'b'){
        self.scrollBy(0,-10);
    }
    else{
    return false;
    }
}

//REGEXP

//characters
[abc] //Encontre qualquer um dos caracteres entre os colchetes
[0-9] //Encontre qualquer um dos dígitos entre os parênteses
(x | y)//Encontre uma das alternativas separadas por |
// Metacaracteres são caracteres com um significado especial:

//modifier types
i //Executa a busca ignorando letras maiúsculas e minúsculas.
g //Executa uma pesquisa global (encontre todas os resultados em vez de parar após a primeira ocorrência).
m //Executar o ajuste de considerando as quebras de linha.

// Metacaractere Descrição
"\d" //Encontrar um dígito
"\s" //Encontrar um caractere de espaço em branco
"\b" //Encontrar uma correspondência no começo ou no final de uma palavra
"\uxxxx" //Encontre o caractere Unicode especificado pelo número hexadecimal xxxx

//Descrição do Quantificador
"n+" //Corresponde a qualquer string que contenha pelo menos um n
"n*" //Corresponde a qualquer cadeia que contenha zero ou mais ocorrências de n

var str = "Hello World!";
var r = str.search(/World/i);//mu=letters //i=uppercase and lowercase
var v = str.replace(/World/g,"university");//g=global search m=wrap lines

var r = /d(b+)d/g;//script usa o método exec para encontrar uma instancia dentro de uma string
var v = myRe.exec('cdbbdbsbz');
console.log(v);

var str = "Cara, cadê o meu carro?";
var r = str.search(/[a-h]/gi);//Retorna todas as ocorrencias das letras “a” a “h”, independente de serem maiúsculas ou minúsculas
console.log(r);

var str = "Hellooo World! Hello Mundoooooo!"; 
var r = /o+/g;//find "oO" in str
var r = str.match(r);
console.log(r);