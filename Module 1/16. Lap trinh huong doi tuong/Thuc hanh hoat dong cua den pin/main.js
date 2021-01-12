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
    } else {
      console.log('Pin da can. Lam on thay pin moi')
    }
  }
}

class FlashLamp{
  constructor(status,battery){
    this.status=status;
    this.battery=battery;
  }
  setBattery(battery){
    this.battery=battery;
  }

  getBatteryInfo(){
    return this.battery;
  }

  light(){
    if (this.status){
      this.battery.decreaseEnergy();
      console.log('Lighting');
    } else{
      console.log('Not lighting')
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
battery.setEnergy(100);
let flashLamp=new FlashLamp(false,battery);
flashLamp.turnOn()
for (i=0;i<90;i++){
  flashLamp.light()
}
flashLamp.light()


console.log(flashLamp)

