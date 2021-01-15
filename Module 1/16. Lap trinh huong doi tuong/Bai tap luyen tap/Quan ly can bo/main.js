class CanBo{
    constructor(name,age,gender,address) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
    }
    setName(name){
        this.name=name;
    }
    getName(){
        return this.name
    }
    setAge(age){
        this.age=age
    }
    getAge(){
        return this.age
    }
    setGender(gender){
        this.gender=gender
    }
    getGender(){
        return this.gender
    }
    setAddress(address){
        this.address=address
    }
    getAddress(){
        return this.address
    }
}

class CongNhan extends CanBo{
    constructor(name, age,gender,address,level) {
        super(name,age,gender,address);
        this.level=level;
    }
}
class KySu extends CanBo{
    constructor(name,age,gender,address,training) {
        super(name,age,gender,address);
        this.training=training;
    }
    getTraining(){
        return this.training
    }
    setTraining(training){
        this.training=training
    }

}
class NhanVien extends CanBo{
    constructor(name,age,gender,address,task) {
        super(name,age,gender,address);
        this.task=task
    }
    setTask(task){
        this.task=task
    }
    getTask(){
        return this.task
    }
}
class QLCB{
      constructor() {
          this.listCanBo=[];
      }
      themCanBo(canBo){
          this.listCanBo.push(canBo)
      }
      lietKeCanBo(){
          console.log(this.listCanBo)
          for (let canBo of this.listCanBo){
          }
      }
      timKiemCanBo(giaTri){

          for (let canBo of this.listCanBo) {
            if(giaTri===canBo.getName()){
                return console.log(canBo)
            }
          }
      }
}
function main(){
    var kySu1=new KySu('Tran Thanh Phuong',36,'nam','Hoa Xuan','IT')
    var kySu2=new KySu('Tran Thanh Lam',9,'nam','Hoa Xuan','IT')
    var congNhan1=new CongNhan('Tran Thanh Khanh Han',36,'nam','Hoa Xuan',3)
    var HR=new QLCB();
    HR.themCanBo(kySu1)
    HR.themCanBo(kySu2)
    HR.themCanBo(congNhan1)
    HR.lietKeCanBo()
    HR.lietKeCanBo()
    HR.timKiemCanBo('Tran Thanh Lam')
}
function addKySu(){
    var name=document.getElementById('name').value;
    var age=document.getElementById('age').value;
    var gender=document.querySelector('input[name="gender"]:checked').value;
    var address=document.getElementById('address').value;
    var training=document.getElementById('training').value;
    var kySutemp=new KySu()
    var PP=new QLCB()
    kySutemp.setName(name)
    kySutemp.setAge(age);
    kySutemp.setGender(gender)
    kySutemp.setAddress(address)
    kySutemp.setTraining(training)
    PP.themCanBo(kySutemp)
    PP.lietKeCanBo()

}
function displayCanBo(){

}


main()