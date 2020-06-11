var auto = {
    merk: "chevrolet",
    model: "camaro ss",
    jaar: "2018",
    kleur: "Geel en Zwart"
}



function hi(){
    document.getElementById("a").innerHTML = "hello world";
    document.getElementById("b").innerHTML = "de keur van de auto is: " + auto.kleur;
    for(var i = 0; i<10; i++){
        console.log("i is gelijk aan: " + i);
    }
}