class Apple {
    constructor() {
        this.weight = 10;
    }

    decrease() {
        if (this.weight > 0) {
            this.weight--;
        }

    }

    isEmpty() {
        if (this.weight == 0)
            return true
        else
            return false
    }

    getWeight() {
        return this.weight
    }
}

class Human {
    constructor(name, gender, weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight

    }

    isMale() {
        if (this.gender)
            return false
        else
            return true
    }

    setGender(gender) {
        this.gender = gender;
    }

    checkApple(apple) {
        if (apple.isEmpty() === false) {
            return true
        } else {
            return false
        }
    }

    eat(apple) {
        if (this.checkApple(apple)) {
            apple.decrease();
            this.weight++
        }
    }

    say() {
        console.log('i love you')
    }

    getName() {
        return this.name
    }

    setName(name) {
        this.name = name;
    }

    getWeight() {
        return this.weight;
    }

    setWeight(weight) {
        this.weight = weight
    }
}

quaTaoCam = new Apple();

adam = new Human('Adam', 1, 70);
eva = new Human('Eva', 0, 50)

for (i = 0; i < 4; i++) {
    adam.eat(quaTaoCam)
    eva.eat(quaTaoCam)
}


console.log(quaTaoCam.getWeight())
console.log('check qua tao da het: ' + quaTaoCam.isEmpty())
console.log('check qua tao con an duoc: ' + adam.checkApple(quaTaoCam))
console.log(adam)
console.log(eva)
