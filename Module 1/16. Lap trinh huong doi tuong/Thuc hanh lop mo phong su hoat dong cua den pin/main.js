class Battery{
  constructor(energy){
    this.energy=energy;
  }
  getEnergy(){
    return this.energy
  }
  setEnergy(energy){
    this.energy=energy;
  }
  decreaseEnergy(){
    if(this.energy>0){
      this.energy--
    }
  }
}

class FlashLamp{
  constructor(status,battery){
    this.status=status;
    this.battery=new Battery();
  }
  setBattery(battery){
    this.battery=battery;
  }

  getBatteryInfo(){
    return this.battery.getEnergy();
  }

  light(){
    if (this.status){
      alert('Lighting');
    } else{
      alert('Not lighting')
    }
  }
  turnOn(){
    this.status=true
  }
  turnOff(){
    this.status=false
  }
}

let battery=new Battery();
battery.setEnergy(10);
let flashLamp=new FlashLamp;
flashLamp.setBattery(battery);


console.log(battery.getEnergy())
console.log(flashLamp.getBatteryInfo())
flashLamp.turnOn();
battery.decreaseEnergy()
flashLamp.light();
console.log(flashLamp.getBatteryInfo())
