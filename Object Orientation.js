//Write a Particle constructor function

//The constructor takes startX and startY parameters
//Particle will have a property of x that defaults to the value of the argument startX
//Particle will have a property of ythat defaults to the value of the argument startY
//Particle will have a property of velocity that defaults to {x: 0, y: 0}
//Create an empty array named particles
//Write loop to create 100 particles
//x values will be assigned from 0-99
//y will be random from 0 to 500 (Math.random()*500)

const gravity = 0.5;
let time = 0;
const particles = [];

class Particle {
  constructor(startX, startY) {
    this.x = startX;
    this.y = startY;
    this.velocity = { x: 0, y: 0 };
  }

  getVelocity() {
    return time * gravity;
  }

  move() {
    this.y += this.getVelocity();
    if (this.y >= 500) {
      console.log("bottom");
      clearInterval(interval);
    }
  }
}

for (let i = 0; i < 100; i++) {
  particles.push(new Particle(i, Math.random() * 500));
}

let interval = setInterval(function() {
  time++;
  particles
    .filter(function(p) {
      console.log(p.x);
      return p.y < 500;
    })
    .forEach(function(p) {
      p.move();
    });
}, 100);

//New Way!

class Particle {
    constructor(startX, startY) {
        this.x = startX;
        this.y = startY;
        velocity = {x: 0, y: 0};
    }
    randomParticles() {
        const particles = []
        for(let i = 0; i < 100; i++){
            particles.push(new Particle(i, math.random()*500));
        }
    }
}

const particle = new Particle()

//Inheritance.js

function Teach(name) {
    this.name = name;
    this.teach = function() {
        console.log(this.name + "says constructors are cool");
    }
}

const teacher1 = new Teacher1('Shane');
const teacher2 = new Teacher2('Assaf');

teacher1.teach();
teacher2.teach();


//Create a time variable and set it to 0
//Create a gravity variable and set it to 0.5
//Extend the particle class from earlier with a prototype object.
//Create a prototype object that contains:
//A property of getVelocity() that returns the value (time * gravity)
//A property of move()
//move() should add the value from getVelocity() to the existing y position
//If and when y >= 500 move() should instead do the following: console.log('bottom')
//use your existing array and for loop to create a particles array
//Use setInterval at 100ms to
//increment the global time variable by 1
//console.log all the particle's x values
//also return an array with all of the y values that are less than 500 (y < 500)
//take the array with y values
//call the move() function on EACH item

let time = 0
let gravity = 0.5

//Create a user profile object that contains properties for
//name
//address
//city
//state
//zipcode
//avatar
//Write a function getProfileUpdate() that hypothetically asks the user to update some profile properties and returns information about which properties were changed, and to what values.(for now, just hard code the return value)
//Write a function updateProfile() that takes a single object of keys:values and overwrites those keys on the profile object
//Get a profile update and update the profile with it.
//log the new profile

function UserProfile(name, address, city, state, zipcode, avatar){
    this.name = ;
    this.address = ;
    this.city = ;
    this.state = ;
    this.zipcode = ;
    this. avatar = ;
}

function getProfileUpdate(){
    return 
}

function updateProfile(){

} 
