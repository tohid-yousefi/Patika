let myName = prompt("Lütfen Adınızı Giriniz")
let yourName = document.querySelector("span#myName");
if(myName){
    yourName.innerHTML = myName.toUpperCase();
} else{
    myName = prompt("Lütfen Adınızı Giriniz")
}

function newClock(){
    const time = new Date();
    document.querySelector("div#myClock").innerHTML =time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+" "+time.toLocaleString('tr-TR', {weekday: 'long'})
}
setInterval(newClock,1000)


