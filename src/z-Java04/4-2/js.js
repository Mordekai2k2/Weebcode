var imgs = [1, 2, 3, 4, 5, 6, 7, 8, 9];
var teller = 0;

function next() {
    if(teller <= 7) {
        teller++;
        document.getElementById("Quack").src = "imgs/Boop" + imgs[teller] + ".jpg";
        console.log(teller);
    }
}

function back() {
    if(teller >= 1) {
        teller--;
        document.getElementById("Quack").src = "imgs/Boop" + imgs[teller] + ".jpg";
        console.log(teller);
    }

}