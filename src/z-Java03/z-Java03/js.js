var random = 0;
var imgs = [];

for (var i = 0; i < 9; i++) {
    imgs.push(i + 1);
}



for (var b = 0; b<imgs.length; b++){
    random = Math.floor(Math.random() * 9);
    var tmp = imgs[b];
    imgs[b] = imgs[random];
    imgs[random] = tmp;
}

for(var c = 0; c<imgs.length; c++){
    document.getElementById("i"+c).src = "imgs/Boop" + imgs[c] + ".jpg";
}


console.log(imgs);



