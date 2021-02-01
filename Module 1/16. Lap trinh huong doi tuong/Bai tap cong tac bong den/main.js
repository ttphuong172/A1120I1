class ElectricLamp {
    constructor(status) {
        this.status = status;
    }

    turnOff() {
        this.status = false;
        document.getElementById('bongden').src = "./img/pic_bulboff.gif"
    }

    turnOn() {
        this.status = true;
        document.getElementById('bongden').src = "./img/pic_bulbon.gif"
    }
}

class SwitchButton {
    constructor(status, lamp) {
        this.status = status;
        this.lamp = lamp
    }

    switchOff() {
        this.status = false;
        this.lamp.turnOff()
    }

    switchOn() {
        this.status = true;
        this.lamp.turnOn()
    }
}

bongDen = new ElectricLamp(false);
congTat = new SwitchButton(false, bongDen)

function turnOn() {
    congTat.switchOn()
}

function turnOff() {
    congTat.switchOff()
}
