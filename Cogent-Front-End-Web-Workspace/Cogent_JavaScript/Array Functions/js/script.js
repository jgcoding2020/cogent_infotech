var animals = new Array("turtle", "snake", "rat");
document.write(animals);
animals.pop();
document.write("<br>Pop animals: " + animals);
animals.shift();
document.write("<br>Shift animals: " + animals);
animals.push("elephant", "tiger");
document.write("<br>Push animals: " + animals);
animals.unshift("lion", "bear");
document.write("<br>Unshift animals: " + animals);
var join = animals.join(", ");
document.write("<br>Join animals: " + join);
animals.sort();
document.write("<br>Sort animals: " + animals);
animals.reverse();
document.write("<br>Reverse animals: " + animals);
animals.splice(2,2);
document.write("<br>Splice  elements 3 and 4 of animals: " + animals);