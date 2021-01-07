class Apple{
    constructor(weight) {
        this.weight=weight
    }
    decrease(){
        this.weight--;
    }
    isEmpty(){
        if (this.weight=0)
            return true
         else
             return false
    }
    getWeight(){
        return this.weight
    }
}

class Human{
    constructor(name,gender,weight) {
        this.name=name;
        this.gender=gender;
        this.weight=weight
        this.apple=new Apple();
    }
    isMale(){
        if (this.gender)
            return true
        else
            return false
    }
    setGender(gender){
        this.gender=gender;
    }
    checkApple(){
        return this.apple.isEmpty()
    }
    eatApple(){
        this.apple.decrease();
        this.weight++
    }
}

quaTaoCam=new Apple(10);

adam = new Human('Adam',1,70);
adam.eatApple()
console.log(quaTaoCam)
console.log(adam)
